package fr.esir.tlc;

import org.antlr.runtime.tree.Tree;

import java.util.HashSet;
import java.util.Set;

public class VisitorTAC {

    private String tac;
    private int id; //sert à donner des labels aux blocs : if1, if2, else3
    private int regId;//donne le numéro du registre

    public VisitorTAC(){
        this.tac = "";
        this.id = 0;
        this.regId = 0;
    }

    /*
    public void visit(Tree t){
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



    public void treatingRoot(Tree t){
        for (int i = 0 ; i < t.getChildCount();i++){
            visit(t.getChild(i));
        }
    }

    //Concernant les fonctions

    public void treatingFunction(Tree t){
        this.tac += t.getChild(0)+":\n"; //on donne le nom en label
        visit(t.getChild(1)); //VISITE LES INPUTS
        visit(t.getChild(3));//VISITE LES OUTPUTS
        visit(t.getChild(2));//VISITE LE BLOC
    }

    public void treatingInput(Tree t){ //Ajoute les paramètres et le nombre de paramètres à la table
        for (int i =0;i<t.getChildCount();i++){
            set.add(t.getChild(i).toString());
        }
        this.currentTable.addParams(set);
    }

    public void treatingOutput(Tree t){
        this.currentTable.setN_outputs(t.getChildCount());
    }

    public void treatingBloc(Tree t){
        Table table = this.currentTable;
        for (int i = 0; i < t.getChildCount();i++){
            this.currentTable = table;
            visit(t.getChild(i));
        }
    }

    //Affectations

    public void treatingAffection(Tree t){
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
            this.correctSemantic = false;
            System.out.println("ARRET DU PARCOURS - MAUVAIS NOMBRE DE VALEURS DANS L'AFFECTATION");
            return; //fin du parcours de l'AST car erreur dans le code while
        }
    }

    public void treatingRight(Tree t){//compte le nombre de valeurs retournées à droite
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
                    this.correctSemantic = false;
                    System.out.println("ARRET DU PARCOURS - APPEL A UNE VARIABLE NON DECLAREE");
                    return;
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

    public void treatingCall(Tree t){
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
            this.correctSemantic = false;
            System.out.println("ARRET DU PARCOURS - APPEL DE FONCTION INEXISTANTE (DOIT ETRE DECLAREE AVANT)");
            return;
        }

        visit(t.getChild(1));
    }

    private void treatingParams(Tree t) {
        //on vérifie qu'on a le bon nombre de paramètres (on consière que les paramètres ne sont que des variables @TODO)
        boolean goodNumberOfParams = this.N_params == t.getChildCount();
        if(!goodNumberOfParams){
            this.correctSemantic = false;
            System.out.println("ARRET DU PARCOURS - MAUVAIS NOMBRE DE PARAMS DANS UN APPEL DE FONCTION");
            return; // les return arrêtent pas du tout le parcours en fait, il faut faire un boolean running qui gere le switch case du visitor @TODO
        }

        //on verifie que les params existent @TODO
    }

    //je skip eux pour le moment @TODO
    private void treatingTail(Tree t) {
        //The child is the one that you are getting the tail of
    }

    private void treatingHead(Tree t) {
        //The child is the one that you are getting the head of
    }

    private void treatingExprList(Tree t) {
        //The child is the one that you are getting the tail of
    }

    //Structures de contrôle

    public void treatingIf(Tree t){
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

    public void treatingElse(Tree t){
        Table table = new Table("else"+id++);
        currentTable.addChild(table);
        currentTable = table;
        visit(t.getChild(0)); //Toujours un enfant : Node_Block
    }

    public void treatingFor(Tree t){
        Table table = new Table("for"+id++);
        currentTable.addChild(table);
        currentTable= table;

        //VERIFIER QUE LA VAR DE BOUCLE EXISTE
        if(!this.currentTable.getParent().findVarOrParam(t.getChild(0).toString())){//=> parcours des tables parentes pour trouver la variable/identifiant
            this.correctSemantic = false;
            System.out.println("ARRET DU PARCOURS - VARIABLE DE BOUCLE FOR NON DECLAREE");
            return;
        }

        this.currentTable.addVar(t.getChild(0).toString());
        visit(t.getChild(1)); //Toujours un Node_Bloc
    }

    public void treatingForEach(Tree t){
        Table table = new Table("foreach"+id++);
        currentTable.addChild(table);
        currentTable= table;

        //VERIFIER QUE LA VAR DE BOUCLE EXISTE
        if(!this.currentTable.getParent().findVarOrParam(t.getChild(1).toString())){//=> parcours des tables parentes pour trouver la variable/identifiant
            this.correctSemantic = false;
            System.out.println("ARRET DU PARCOURS - VARIABLE DE BOUCLE FOREACH NON DECLAREE");
            return;
        }

        this.currentTable.addVar(t.getChild(0).toString());
        this.currentTable.addVar(t.getChild(1).toString());
        visit(t.getChild(2)); //Toujours un Node_Bloc
    }

    public void treatingWhile(Tree t) { //Two childrens : Op, Node_Bloc
        Table table = new Table("while"+id++);
        currentTable.addChild(table);
        currentTable= table;

        //VERIFIER QUE LA VAR DE BOUCLE EXISTE
        if(!this.currentTable.getParent().findVarOrParam(t.getChild(0).toString())){//=> parcours des tables parentes pour trouver la variable/identifiant
            this.correctSemantic = false;
            System.out.println("ARRET DU PARCOURS - VARIABLE DE BOUCLE WHILE NON DECLAREE");
            return;
        }

        this.currentTable.addVar(t.getChild(0).toString());

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

    public void treatingList(Tree t){ //pas envie @TODO
        for (int i = 0 ; i < t.getChildCount() ; i++){
            //Les enfants de t sont les élements de la liste
            t.getChild(i);
        }
    }
    */
}
