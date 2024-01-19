package fr.esir.tlc;

import fr.esir.tlc.exceptions.*;
import org.antlr.runtime.tree.Tree;

import java.util.HashSet;
import java.util.Set;

public class VisitorSemantic {

    private Table rootTable; //the root table
    private Table currentTable; //the current table
    private int leftSum; //the number of values on the left side of an affect
    private int rightSum; //the number of values on the right side of an affect
    private int N_params; //the number of params that needs the current method

    private int id; //sert à donner des noms aux tables sans fonction ex : if1, if2, else3

    public VisitorSemantic(){
        this.rootTable=null;
        this.currentTable=null;
        this.leftSum = 0;
        this.rightSum = 0;
        this.N_params = 0;
        this.id = 0;
    }

    public Table getRootTable() {
        return rootTable;
    }

    public void visit(Tree t) throws Exception {
        switch (t.toString()){
                case "Node_Function": {
                    //System.out.println("VISITE FONCTION");
                    treatingFunction(t);
                    break;
                }
                case "Node_Input": {
                    //System.out.println("VISITE INPUT");
                    treatingInput(t);
                    break;
                }
                case "Node_Bloc": {
                    //System.out.println("VISITE BLOC");
                    treatingBloc(t);
                    break;
                }
                case "Node_Output": {
                    //System.out.println("VISITE OUTPUT");
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
                case "Node_Params": {
                    treatingParams(t);
                    break;
                }
                case "nil":{
                    System.out.println("VISITE ROOT"); //Cas de la racine (défensif : vérifier qu'il a des enfants)
                    treatingRoot(t);
                    break;
                }
            }
    }


    public void treatingRoot(Tree t) throws Exception {
        this.rootTable = new Table("_ROOT_");
        for (int i = 0 ; i < t.getChildCount();i++){
            this.currentTable = this.rootTable; //très important
            visit(t.getChild(i));
        }
        System.out.println("PARCOURS TERMINÉ");
        System.out.println("\nTABLE DES SYMBOLES : \n" + this.rootTable.toStringAll(0));
    }

    //Concernant les fonctions

    public void treatingFunction(Tree t) throws Exception{
        //Verif que le nom de la fonction est pas déjà pris par une autre fonction
        for(Table func: this.rootTable.getChildren()){ //PAS OPTI DU TOUT, faire un hashset avec les nom plutot
            if(t.getChild(0).toString().equals(func.getName())){
                throw new DuplicateFunctionException("NOM DE FONCTION DEJA EXISTANT");
            }
        }

        Table table = new Table(t.getChild(0).toString()); //On crée la table de la fonction(The first Child is always the name of the function)
        this.currentTable.addChild(table); //On ajoute comme enfant de la table courante notre table

        //Très important : visiter d'abord les paramètres d'entrée et de sorties pour le cas d'une fonction récursive
        this.currentTable = table;
        visit(t.getChild(1)); //VISITE LES INPUTS
        visit(t.getChild(3));//VISITE LES OUTPUTS
        visit(t.getChild(2));//VISITE LE BLOC
        this.currentTable = table;
        //VERIF QUE L'OUTPUT EST DECLAREE QQ PART DS LA FUNC
        for(int i = 0; i<this.currentTable.getN_outputs(); i++){
            if(!this.currentTable.findVarOrParam(t.getChild(3).getChild(i).toString())){
                throw new UndeclaredOutputException("OUTPUT NON DECLAREE(S) DANS FONCTION");
            }
            /*
            if(!this.currentTable.findOutput(t.getChild(3).getChild(i).toString())){
                this.correctSemantic = false;
                System.out.println("ARRET DU PARCOURS - OUTPUT NON DECLAREE");
                return;
            }
            */
        }
        System.out.println(table);
    }

    public void treatingInput(Tree t){ //Ajoute les paramètres et le nombre de paramètres à la table
        Set<String> set = new HashSet<>();
        for (int i =0;i<t.getChildCount();i++){
            set.add(t.getChild(i).toString());
        }
        this.currentTable.addParams(set);
        //Est-ce qu'on développe un truc qui prend en compte le fait qu'il faut pas avoir plusieurs paramètres du même nom ?
    }

    public void treatingOutput(Tree t){
        this.currentTable.setN_outputs(t.getChildCount());
        //Est-ce qu'on développe un truc qui prend en compte le fait qu'il faut pas avoir plusieurs outputs du même nom ?
    }

    public void treatingBloc(Tree t) throws Exception {
        Table table = this.currentTable;
        for (int i = 0; i < t.getChildCount();i++){
            this.currentTable = table;
            visit(t.getChild(i));
        }
    }

    //Affectations

    public void treatingAffection(Tree t) throws Exception {
        //Le nœud Affectation possède deux enfants : Node_Left, Node_Right
        //Node Left est le nom de la ou des variables, Node_Right, sa/les valeurs

        //init des nombres de valeurs à droite et à gauche (SECURITE)
        this.leftSum = 0; //=t.getChild(0).getChildCount();
        this.rightSum = 0; //t.getChild(1).getChildCount() pas bon car un appel de fonction est 1 enfant mais peut fournir plusieurs valeurs


        //On regarde à droite (d'abord à droite pour éviter les A = A)
        visit(t.getChild(1));

        //On regarde à gauche
        visit(t.getChild(0));

        //Vérification du bon nombre de valeurs de chaque côté
        if(this.leftSum!=this.rightSum){
            throw new IncorrectAssignementException("MAUVAIS NOMBRE DE VALEURS DANS L'AFFECTATION");
            //fin du parcours de l'AST car erreur dans le code while
        }
    }

    public void treatingRight(Tree t) throws Exception {//compte le nombre de valeurs retournées à droite
        for(int i = 0; i<t.getChildCount(); i++){
            //case CALL
            if("Node_Call".equals(t.getChild(i).toString())){
                visit(t.getChild(i));
            }
            //case HEAD TAIL
            else if(t.getChild(i).toString().startsWith("Node_")){
                visit(t.getChild(i));
                this.rightSum += 1;//je le mets ici parce que cons hd et tail ça peut s'enchainer ex hd(hd(hd(nil))) = nil et c 1
            }
            else{ //case IDENTIFIANT de variable
                //System.out.println(t.getChild(i).toString());
                this.rightSum += 1;
                if(!this.currentTable.findVarOrParam(t.getChild(i).toString())){//=> parcours de la table et des tables parentes pour trouver la variable/identifiant ou le param
                    throw new UndeclaredVariableException("APPEL A UNE VARIABLE NON DECLAREE DANS AFFECTATION");
                }
            }

            //cas LIST ??? @TODO
        }
    }

    public void treatingLeft(Tree t){//compte le nombre de valeurs retournées à gauche
        //Si l'identifiant apparaît plusieurs fois, il n'est ajouté qu'une fois
        this.leftSum = t.getChildCount();
        for(int i = 0; i<t.getChildCount(); i++){
            this.currentTable.addVar(t.getChild(i).toString());//ajoute chaque var à gauche à la table des symboles courante
            //voir comment on gère si y'a deux fois le même identifiant de variable@TODO
        }
    }

    //Appels de fonctions

    public void treatingCall(Tree t) throws Exception {
        //Child 0 is name
        //Child 1 is Node_Params
        String name = t.getChild(0).toString();
        //On vérifie que la fonction existe bien (dans notre implémentation elle n'existe que si elle est déclarée avant + pas d'appels recursifs @TODO)
        boolean functionFound = false;
        for(Table child : this.rootTable.getChildren()){
            if(name.equals(child.getName())){ //pas d'appel recursif ?? (pas encore fait) @TODO
                functionFound = true;
                this.N_params = child.getN_inputs(); //le nombre de param que prend la fonction appelée
                this.rightSum += child.getN_outputs(); //on ajoute le nombre d'outputs de la fonction
            }
        }

        if(!functionFound){
            throw new UndeclaredFunctionException("APPEL DE FONCTION INEXISTANTE (DOIT ETRE DECLAREE AVANT)");
        }

        visit(t.getChild(1));
    }

    private void treatingParams(Tree t) throws Exception {
        //on vérifie qu'on a le bon nombre de paramètres (on consière que les paramètres ne sont que des variables @TODO)
        boolean goodNumberOfParams = this.N_params == t.getChildCount();
        if(!goodNumberOfParams){
            throw new IncorrectAssignementException("MAUVAIS NOMBRE DE PARAMS DANS UN APPEL DE FONCTION");
            // les return arrêtent pas du tout le parcours en fait, il faut faire un boolean running qui gere le switch case du visitor @TODO
        }

        //on verifie que les params existent @TODO
    }

    //je skip eux pour le moment @TODO
    private void treatingTail(Tree t) throws Exception{
        //The child is the one that you are getting the tail of
        if(!this.currentTable.findVarOrParam(t.getChild(0).toString())){//=> parcours de la table et des tables parentes pour trouver la variable/identifiant ou le param
            throw new UndeclaredVariableException("APPEL A UNE VARIABLE NON DECLAREE DANS TAIL");
        }
    }

    private void treatingHead(Tree t) throws Exception{
        //The child is the one that you are getting the head of
        if(!this.currentTable.findVarOrParam(t.getChild(0).toString())){//=> parcours de la table et des tables parentes pour trouver la variable/identifiant ou le param
            throw new UndeclaredVariableException("APPEL A UNE VARIABLE NON DECLAREE DANS HEAD");
        }
    }

    private void treatingExprList(Tree t) {
        //The child is the one that you are getting the tail of
    }

    //Structures de contrôle

    public void treatingIf(Tree t) throws Exception {
        Table table = new Table("if"+id++); //faire un système de nom auto-généré et incrémenté pour chaque structure de contrôle anonyme @TODO
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

    public void treatingElse(Tree t) throws Exception {
        Table table = new Table("else"+id++);
        currentTable.addChild(table);
        currentTable = table;
        visit(t.getChild(0)); //Toujours un enfant : Node_Block
    }

    public void treatingFor(Tree t) throws Exception {
        Table table = new Table("for"+id++);
        currentTable.addChild(table);
        currentTable= table;

        //VERIFIER QUE LA VAR DE BOUCLE EXISTE
        if(!this.currentTable.getParent().findVarOrParam(t.getChild(0).toString())){//=> parcours des tables parentes pour trouver la variable/identifiant
            throw new UndeclaredVariableException("VARIABLE DE BOUCLE FOR NON DECLAREE");
        }

        this.currentTable.addVar(t.getChild(0).toString());
        visit(t.getChild(1)); //Toujours un Node_Bloc
    }

    public void treatingForEach(Tree t) throws Exception {
        Table table = new Table("foreach"+id++);
        currentTable.addChild(table);
        currentTable= table;

        //VERIFIER QUE LA VAR DE BOUCLE EXISTE
        if(!this.currentTable.getParent().findVarOrParam(t.getChild(1).toString())){//=> parcours des tables parentes pour trouver la variable/identifiant
            throw new UndeclaredVariableException("VARIABLE DE BOUCLE FOREACH NON DECLAREE");
        }

        this.currentTable.addVar(t.getChild(0).toString());
        this.currentTable.addVar(t.getChild(1).toString());
        visit(t.getChild(2)); //Toujours un Node_Bloc
    }

    public void treatingWhile(Tree t) throws Exception { //Two childrens : Op, Node_Bloc
        Table table = new Table("while"+id++);
        currentTable.addChild(table);
        currentTable= table;

        //VERIFIER QUE LA VAR DE BOUCLE EXISTE
        if(!this.currentTable.getParent().findVarOrParam(t.getChild(0).toString())){//=> parcours des tables parentes pour trouver la variable/identifiant
            throw new UndeclaredVariableException("VARIABLE DE BOUCLE WHILE NON DECLAREE");
        }

        this.currentTable.addVar(t.getChild(0).toString());

        visit(t.getChild(1)); //Toujours un Node_Bloc
    }

    //Constructeurs

    public void treatingCons(Tree t) throws Exception {
        for (int i = 0 ; i < t.getChildCount() ; i ++){
            if (t.getChild(i).toString().startsWith("Node_")){//CAS CONS HD TL | PAS CALL
                visit(t.getChild(i));
            }
            else if(Character.isUpperCase(t.getChild(i).toString().charAt(0))){ //CAS APPEL DE VARIABLE
                if(!this.currentTable.findVarOrParam(t.getChild(i).toString())){//=> parcours de la table et des tables parentes pour trouver la variable/identifiant ou le param
                    throw new UndeclaredVariableException("APPEL A UNE VARIABLE NON DECLAREE DANS CONS");
                }
            }//PAS D'APPEL DE FONCTION POSSIBLE DANS UN CONS DANS NOTRE IMPLEM
        }
    }

    public void treatingList(Tree t){ //pas envie @TODO
        for (int i = 0 ; i < t.getChildCount() ; i++){
            //Les enfants de t sont les élements de la liste
            t.getChild(i);
        }
    }
}
