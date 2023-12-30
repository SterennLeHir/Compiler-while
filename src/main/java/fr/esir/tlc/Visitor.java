package fr.esir.tlc;

import org.antlr.runtime.tree.Tree;

import java.util.HashSet;
import java.util.Set;

public class Visitor {

    private TreeTable treeTable;
    private TableOfSymbols currentTable;

    public Visitor(){
        treeTable=null;
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

    public void treatingRoot(Tree t){
        treeTable = new TreeTable();
        currentTable= new TableOfSymbols("Root");
        for (int i = 0 ; i < t.getChildCount();i++){
            visit(t.getChild(i));
        }
    }

    public void treatingFunction(Tree t){
        //System.out.println("Function has "+t.getChildCount()+" children."); //Name ; Input ; Bloc ; Output

        TableOfSymbols tableOfSymbols = new TableOfSymbols(t.getChild(0).toStringTree()); //The first Child is always the name of the function
        System.out.println(currentTable);
        currentTable = tableOfSymbols;
        for (int i = 1;i<t.getChildCount();i++){
            visit(t.getChild(i));
        }
        treeTable.getRoot().addChild(currentTable); //Puisque toutes les fonctions sont au même niveau dans l'AST, on peut y accéder directement.
    }

    public void treatingInput(Tree t){
        this.currentTable.setInputs(t.getChildCount());
        Set<String> set = new HashSet<>();
        for (int i =0;i<t.getChildCount();i++){
            set.add(t.getChild(i).toStringTree());
        }
        this.currentTable.addParameters(set);
    }

    public void treatingOutput(Tree t){
        this.currentTable.setOutputs(t.getChildCount());
    }

    public void treatingBloc(Tree t){
        for (int i = 0; i < t.getChildCount();i++){
            visit(t.getChild(i));
        }
    }

    public void treatingAffection(Tree t){
        //Le nœud Affectation possède deux enfants : Node_Left, Node_Right
        //Node Left est le nom de la variable, Node_Right, sa valeur
        t.getChild(0);
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

    public void treatingIf(Tree t){
        TableOfSymbols oldTable = currentTable;
        currentTable= new TableOfSymbols("forEach");
        //Trois enfants : Op, Node_Bloc, Node_Else (optionnel)
        if (true /* À METTRE UNE CONDITION, MAIS JE NE VOIS PAS LAQUELLE*/){
            visit(t.getChild(1));
        } else if (t.getChildCount()>2){ //On s'assure de l'existence de l'instruction Else
            visit(t.getChild(2));
        }
        currentTable=oldTable;
    }

    public void treatingElse(Tree t){
        visit(t.getChild(0)); //Toujours un enfant : Node_Block
    }

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

    public void treatingFor(Tree t){
        TableOfSymbols oldTable = currentTable;
        currentTable= new TableOfSymbols("for");
        visit(t.getChild(1)); //Toujours un Node_Bloc
        currentTable=oldTable;
    }

    public void treatingForEach(Tree t){
        TableOfSymbols oldTable = currentTable;
        currentTable= new TableOfSymbols("forEach");
        currentTable.addVariableToSet(t.getChild(0).toStringTree());
        visit(t.getChild(2)); //Toujours un Node_Bloc
        currentTable=oldTable;
    }

    public void treatingWhile(Tree t) { //Two childrens : Op, Node_Bloc
        TableOfSymbols oldTable = currentTable;
        currentTable=new TableOfSymbols("while");
        visit(t.getChild(1));
        currentTable=oldTable;
    }
}
