package fr.esir.tlc;

import org.antlr.runtime.tree.Tree;

import java.util.HashSet;
import java.util.Set;

public class VisitorSemantic {

    private Table rootTable;
    private Table currentTable;

    private boolean correctSemantic;

    public VisitorSemantic(){
        this.rootTable=null;
        this.currentTable=null;
        this.correctSemantic = true;
    }

    public void visit(Tree t){
        switch (t.toString()){
            case "Node_Function": {
                treatingFunction(t);
                break;
            }
            case "Node_Input": {
                treatingInput(t);
                break;
            }
            case "Node_Bloc": {
                treatingBloc(t);
                break;
            }
            case "Node_Output": {
                treatingOutput(t);
                break;
            }
            case "Node_Affectation": {
                treatingAffection(t);
                break;
            }
            case "Node_Left": {
                treatingLeft(t);
                break;
            }
            case "Node_Right": {
                treatingRight(t);
                break;
            }
            case "Node_If": {
                treatingIf(t);
                break;
            }
            case "Node_Else": {
                treatingElse(t);
                break;
            }
            case "Node_Cons": {
                treatingCons(t);
                break;
            }
            case "Node_For": {
                treatingFor(t);
                break;
            }
            case "Node_ForEach": {
                treatingForEach(t);
                break;
            }
            case "Node_While": {
                treatingWhile(t);
                break;
            }
            case "Node_Head": {
                treatingHead(t);
                break;
            }
            case "Node_Tail": {
                treatingTail(t);
                break;
            }
            case "Node_ExprList": {
                treatingExprList(t);
                break;
            }
            case "Node_List": {
                treatingList(t);
                break;
            }
            case "Node_Call": {
                treatingCall(t);
                break;
            }
            case "nil":{
                System.out.println("C'est la racine !"); //Cas de la racine (défensif : vérifier qu'il a des enfants)
                treatingRoot(t);
                break;
            }
        }

    }


    public void treatingRoot(Tree t){
        this.rootTable = new Table("_ROOT_");
        for (int i = 0 ; i < t.getChildCount();i++){
            this.currentTable = this.rootTable; //très important
            visit(t.getChild(i));
        }
        System.out.println("PARCOURS TERMINÉ");
    }

    //Concernant les fonctions

    public void treatingFunction(Tree t){
        Table table = new Table(t.getChild(0).toStringTree()); //On crée la table de la fonction(The first Child is always the name of the function)
        this.currentTable.addChild(table); //On ajoute comme enfant de la table courante notre table
        System.out.println(table);
        for (int i = 1;i<t.getChildCount();i++){
            this.currentTable = table;//On place notre table comme table courante
            visit(t.getChild(i));
        }
    }

    public void treatingInput(Tree t){ //Ajoute les paramètres et le nombre de paramètres à la table
        Set<String> set = new HashSet<>();
        for (int i =0;i<t.getChildCount();i++){
            set.add(t.getChild(i).toStringTree());
        }
        this.currentTable.addParams(set);
    }

    public void treatingOutput(Tree t){
        this.currentTable.setN_outputs(t.getChildCount());
    }

    public void treatingBloc(Tree t){
        for (int i = 0; i < t.getChildCount();i++){
            visit(t.getChild(i));
        }
    }

    //Affectations

    public void treatingAffection(Tree t){
        //Le nœud Affectation possède deux enfants : Node_Left, Node_Right
        //Node Left est le nom de la variable, Node_Right, sa valeur

        //Vérification du bon nombre
        int n_left = t.getChild(0).getChildCount();
        int n_right = t.getChild(1).getChildCount();

        if(n_left!=n_right){
            this.correctSemantic = false;
            System.out.println("ARRET DU PARCOURS - MAUVAISE MULTIPLICITE D'AFFECTATION");
            return; //fin du parcours de l'AST car erreur dans le code while
        }

        //Left
        for(int i = 0; i<n_left; i++){
            //Si l'identifiant apparaît plusieurs fois, il n'est ajouté qu'une fois
           currentTable.addVar(t.getChild(0).getChild(i).toStringTree());
        }

        //Right
        for(int i = 0; i<n_right; i++){
            //L'enfant peut-être soit un (Node_Cons/Head/Tail), soit une variable pré-définie, soit un (Node_Call)

        }


    }

    public void treatingLeft(Tree t){
        //Node Left n'a TOUJOURS qu'UN enfant.
        t.getChild(0);
    }

    public void treatingRight(Tree t){
        if (t.getChild(0).toStringTree().substring(0,5).equals("Node_")){
            visit(t.getChild(0));
        }
    }


    //Structures de contrôle

    public void treatingIf(Tree t){
        Table table = new Table("if1");
        currentTable.addChild(table);
        Table oldTable = currentTable; //pour le else
        //Trois enfants : Op (ne peut pas être directement un appel de fontion), Node_Bloc, Node_Else (optionnel)
        currentTable = table;
        visit(t.getChild(1));

        if(t.getChildCount()>=2){ //On s'assure de l'existence de l'instruction Else
            currentTable = oldTable;
            visit(t.getChild(2));
        }
    }

    public void treatingElse(Tree t){
        Table table = new Table("else1");
        currentTable.addChild(table);
        currentTable = table;
        visit(t.getChild(0)); //Toujours un enfant : Node_Block
    }

    public void treatingFor(Tree t){
        Table table = new Table("for1");
        currentTable.addChild(table);
        currentTable= table;
        visit(t.getChild(1)); //Toujours un Node_Bloc
    }

    public void treatingForEach(Tree t){
        Table table = new Table("foreach1");
        currentTable.addChild(table);
        currentTable= table;
        visit(t.getChild(1)); //Toujours un Node_Bloc
    }

    public void treatingWhile(Tree t) { //Two childrens : Op, Node_Bloc
        Table table = new Table("while1");
        currentTable.addChild(table);
        currentTable= table;
        visit(t.getChild(1)); //Toujours un Node_Bloc
    }

    //Constructeurs

    public void treatingCons(Tree t){
        for (int i = 0 ; i < t.getChildCount() ; i ++){
            if (t.getChild(i).toStringTree().startsWith("Node_")){
                visit(t.getChild(i));
            }
        }
    }

    public void treatingList(Tree t){
        for (int i = 0 ; i < t.getChildCount() ; i++){
            //Les enfants de t sont les élements de la liste
            t.getChild(i);
        }
    }

    //Appels de fonctions

    public void treatingCall(Tree t){
        //Child 0 is order
        //Child 1 is value
        visit(t.getChild(1));
    }

    private void treatingTail(Tree t) {
        //The child is the one that you are getting the tail of
    }

    private void treatingHead(Tree t) {
        //The child is the one that you are getting the head of
    }

    private void treatingExprList(Tree t) {
        //The child is the one that you are getting the tail of
    }
}
