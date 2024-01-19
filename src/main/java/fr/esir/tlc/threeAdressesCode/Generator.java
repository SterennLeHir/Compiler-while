package fr.esir.tlc.threeAdressesCode;

import fr.esir.tlc.Table;
import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private List<Instruction> instructions;
    private int id; //sert à donner des labels aux blocs : if1, if2, else3
    private int regId;//donne le numéro du registre
    private Tree t;
    private Table symbolTable;

    public Generator(Tree node, Table table) {
        this.instructions = new ArrayList<>() ;
        this.id = 0;
        this.regId = 0;
        this.t = node;
        this.symbolTable = table;
    }

    public List<Instruction> generateCode() {
        visit(this.t);
        return this.instructions;
    }

    private void visit(Tree t){
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
            visit(t.getChild(1)); //VISITE LES INPUTS
            visit(t.getChild(2));//VISITE LE BLOC
            visit(t.getChild(3));//VISITE LES OUTPUTS
        }

        public void treatingInput(Tree t){ //Ajoute les paramètres et le nombre de paramètres à la table
            for (int i =0;i<t.getChildCount();i++){
            }
        }

        public void treatingOutput(Tree t){
        }

        public void treatingBloc(Tree t){
            for (int i = 0; i < t.getChildCount();i++){
                visit(t.getChild(i));
            }
        }

        //Affectations

        public void treatingAffection(Tree t){
            //Le nœud Affectation possède deux enfants : Node_Left, Node_Right
            //Node Left est le nom de la ou des variables, Node_Right, sa/les valeurs

            //On regarde à droite
            visit(t.getChild(1));

            //On regarde à gauche
            visit(t.getChild(0));

            //Vérification du bon nombre de valeurs de chaque côté
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
                }
                else{ //case IDENTIFIANT de variable
                    //System.out.println(t.getChild(i).toString());
                }

                //cas LIST ??? @TODO
            }
        }

        public void treatingLeft(Tree t){//compte le nombre de valeurs retournées à gauche
            //Si l'identifiant apparaît plusieurs fois, il n'est ajouté qu'une fois
            for(int i = 0; i<t.getChildCount(); i++){
            }
        }

        //Appels de fonctions

        public void treatingCall(Tree t){
            //Child 0 is name
            //Child 1 is Node_Params
            String name = t.getChild(0).toString();
            //On vérifie que la fonction existe bien (dans notre implémentation elle n'existe que si elle est déclarée avant + pas d'appels recursifs @TODO)
            boolean functionFound = false;

            if(!functionFound){
                System.out.println("ARRET DU PARCOURS - APPEL DE FONCTION INEXISTANTE (DOIT ETRE DECLAREE AVANT)");
                return;
            }

            visit(t.getChild(1));
        }

        private void treatingParams(Tree t) {
            //on vérifie qu'on a le bon nombre de paramètres (on consière que les paramètres ne sont que des variables @TODO
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

            //Trois enfants : Op (ne peut pas être directement un appel de fontion), Node_Bloc, Node_Else (optionnel)
            visit(t.getChild(1));

            if(t.getChildCount()>=2){ //On s'assure de l'existence de l'instruction Else
                visit(t.getChild(2));
            }
        }

        public void treatingElse(Tree t) {
            visit(t.getChild(0)); //Toujours un enfant : Node_Block
        }

        public void treatingFor(Tree t){

            visit(t.getChild(1)); //Toujours un Node_Bloc
        }

        public void treatingForEach(Tree t){

            visit(t.getChild(2)); //Toujours un Node_Bloc
        }

        public void treatingWhile(Tree t) { //Two childrens : Op, Node_Bloc

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

        public void treatingList(Tree t) { //pas envie @TODO
            for (int i = 0; i < t.getChildCount(); i++) {
                //Les enfants de t sont les élements de la liste
                t.getChild(i);
            }
        }
}
