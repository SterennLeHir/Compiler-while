package fr.esir.tlc.threeAdressesCode;

import fr.esir.tlc.semantic.Table;
import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private List<Instruction> instructions;
    private int id; //sert à donner des labels aux blocs : if1, if2, else3
    private int regId; //donne le numéro du registre
    private Tree t;
    private Table symbolTable;

    private List<String> listeRegistres;

    public Generator(Tree node, Table table) {
        this.instructions = new ArrayList<>() ;
        this.id = 0;
        this.regId = 0;
        this.t = node;
        this.symbolTable = table;
        this.listeRegistres = new ArrayList<String>();
    }

    public List<Instruction> generateCode() {
        visit(this.t);
        return this.instructions;
    }

    public void afficheInstructions(){ //Affiche en console le résultat écrit de notre code 3 adresses
        for(Instruction i : this.instructions){
            System.out.println(i);
        }
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
                case "Node_Program":{
                    System.out.println("VISITE ROOT"); //Cas de la racine (défensif : vérifier qu'il a des enfants)
                    treatingRoot(t);
                    break;
                }
                case "nil":{
                    treatingRoot(t.getChild(0));
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
            //FUNC BEGIN
            String name = t.getChild(0).toString();
            this.instructions.add(new FuncBegin(name));

            visit(t.getChild(1)); //VISITE LES INPUTS
            visit(t.getChild(2));//VISITE LE BLOC
            visit(t.getChild(3));//VISITE LES OUTPUTS
            
            //FUNC END
            this.instructions.add(new FuncEnd());
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

            //Init des registres
            this.listeRegistres = new ArrayList<String>();

            //On regarde à droite
            visit(t.getChild(1));

            //On regarde à gauche
            visit(t.getChild(0));

        }

        public void treatingRight(Tree t){//compte le nombre de valeurs retournées à droite
            for(int i = 0; i<t.getChildCount(); i++){
                //case CALL
                if("Node_Call".equals(t.getChild(i).toString())){
                    visit(t.getChild(i));
                }
                //case HEAD TAIL CONS
                else if(t.getChild(i).toString().startsWith("Node_")){
                    visit(t.getChild(i));
                }
                else{ //case IDENTIFIANT de variable
                    Register r = new Register();
                    this.listeRegistres.add(r.getName());
                    this.instructions.add(new Affectation(r.getName(), t.getChild(i).toString()));
                }

                //cas LIST ??? @TODO
            }
        }

        public void treatingLeft(Tree t){//compte le nombre de valeurs retournées à gauche
            //Si l'identifiant apparaît plusieurs fois, il n'est ajouté qu'une fois
            for(int i = 0; i<t.getChildCount(); i++){
                this.instructions.add(new Affectation(t.getChild(i).toString(), this.listeRegistres.get(i)));
            }
        }

        //Appels de fonctions

        public void treatingCall(Tree t){
            //Child 0 is name
            //Child 1 is Node_Params
            visit(t.getChild(1)); //VISTER LES PARAMS

            String name = t.getChild(0).toString();
            int num = t.getChild(1).getChildCount();

            Register r = new Register();
            this.listeRegistres.add(r.getName());
            this.instructions.add(new Affectation(r.getName(), "call "+name+" "+num));
        }

        private void treatingParams(Tree t) {
            for (int i = 0; i<t.getChildCount(); i++){
                Register r = new Register();
                this.instructions.add(new Affectation(r.getName(), t.getChild(i).toString()));
                this.instructions.add(new Param(r.getName()));
            }
        }

        //je skip eux pour le moment @TODO
        private void treatingTail(Tree t){
            //The child is the one that you are getting the tail of
            Register r = new Register();
            this.instructions.add(new Affectation(r.getName(), t.getChild(0).toString()));
            this.instructions.add(new Param(r.getName()));

            Register r2 = new Register();
            this.listeRegistres.add(r2.getName());
            this.instructions.add(new Affectation(r2.getName(), "call tl 1"));
        }

        private void treatingHead(Tree t){
            //The child is the one that you are getting the head of
            Register r = new Register();
            this.instructions.add(new Affectation(r.getName(), t.getChild(0).toString()));
            this.instructions.add(new Param(r.getName()));

            Register r2 = new Register();
            this.listeRegistres.add(r2.getName());
            this.instructions.add(new Affectation(r2.getName(), "call hd 1"));
        }

        private void treatingExprList(Tree t) {
            //The child is the one that you are getting the tail of
        }

        //Structures de contrôle

        public void treatingIf(Tree t){//Trois enfants : Op (ne peut pas être directement un appel de fontion), Node_Bloc, Node_Else (optionnel)

            if("Node_Call".equals(t.getChild(0).toString())){
                //INSTRUCTIONS CONDITION DU IF
                Register r = new Register();
                this.instructions.add(new Affectation(r.getName(), t.getChild(1).toString()));
                this.instructions.add(new Param(r.getName()));
                Register r2 = new Register();
                this.instructions.add(new Affectation(r2.getName(), "call not 1"));

                String ifLabel = "if"+id++;
                String elseLabel = "else"+id++;

                // if OP goto ELSELABEL
                this.instructions.add(new IfzGoto(r2.getName(), elseLabel));

                //CORPS DU IF
                visit(t.getChild(2));

                // goto ENDLABEL
                this.instructions.add(new Goto(ifLabel));
                //ELSELABEL
                this.instructions.add(new Label(elseLabel));

                if(t.getChildCount()>3){ //On s'assure de l'existence de l'instruction Else
                    visit(t.getChild(3));
                }
                //ENDLABEL
                this.instructions.add(new Label(ifLabel));
            }
            else{
                //INSTRUCTIONS CONDITION DU IF
                Register r = new Register();
                this.instructions.add(new Affectation(r.getName(), t.getChild(0).toString()));

                String ifLabel = "if"+id++;
                String elseLabel = "else"+id++;

                // if OP goto ELSELABEL
                this.instructions.add(new IfzGoto(r.getName(), elseLabel));

                //CORPS DU IF
                visit(t.getChild(1));

                // goto ENDLABEL
                this.instructions.add(new Goto(ifLabel));
                //ELSELABEL
                this.instructions.add(new Label(elseLabel));

                if(t.getChildCount()>2){ //On s'assure de l'existence de l'instruction Else
                    visit(t.getChild(2));
                }
                //ENDLABEL
                this.instructions.add(new Label(ifLabel));
            }
        }

        public void treatingElse(Tree t) {
            visit(t.getChild(0)); //Toujours un enfant : Node_Block
        }

        public void treatingFor(Tree t){
            //LABEL DE LOOP
            String forLabel = "for"+id++;
            String ifLabel = "if"+id++;
            this.instructions.add(new Label(forLabel));

            //CONDITION DE LOOP
            Register r = new Register();
            this.instructions.add(new Affectation(r.getName(), t.getChild(0).toString()));
            this.instructions.add(new IfzGoto(r.getName(), ifLabel));

            //CORPS DU LOOP
            visit(t.getChild(1)); //Toujours un Node_Bloc

            //DECREASE TAILLE ARBRE ??????????
            //appel de head
            Register r2 = new Register();
            this.instructions.add(new Affectation(r2.getName(), t.getChild(0).toString()));
            this.instructions.add(new Param(r2.getName()));

            Register r3 = new Register();
            this.instructions.add(new Affectation(r3.getName(), "call hd 1"));

            this.instructions.add(new Affectation(t.getChild(0).toString(), r3.getName()));

            //GOTO START OF LOOP
            this.instructions.add(new Goto(forLabel));

            //SORTIE DU LOOP
            this.instructions.add(new Label(ifLabel));
        }

        public void treatingForEach(Tree t){
            //LABEL DE LOOP
            String forLabel = "for"+id++;
            String ifLabel = "if"+id++;
            this.instructions.add(new Label(forLabel));

            //CONDITION DE LOOP
            Register r = new Register();
            this.instructions.add(new Affectation(r.getName(), t.getChild(1).toString()));
            this.instructions.add(new IfzGoto(r.getName(), ifLabel));

            //CORPS DU LOOP
            visit(t.getChild(2)); //Toujours un Node_Bloc

            //DECREASE TAILLE ARBRE ??????????
            //appel de head
            Register r2 = new Register();
            this.instructions.add(new Affectation(r2.getName(), t.getChild(1).toString()));
            this.instructions.add(new Param(r2.getName()));

            Register r3 = new Register();
            this.instructions.add(new Affectation(r3.getName(), "call hd 1"));

            this.instructions.add(new Affectation(t.getChild(1).toString(), r3.getName()));

            //GOTO START OF LOOP
            this.instructions.add(new Goto(forLabel));

            //SORTIE DU LOOP
            this.instructions.add(new Label(ifLabel));
        }

        public void treatingWhile(Tree t) { //Two childrens : Op, Node_Bloc
            //LABEL DE WHILE
            String forLabel = "while"+id++;
            String ifLabel = "if"+id++;
            this.instructions.add(new Label(forLabel));

            //CONDITION DE LOOP
            Register r = new Register();
            this.instructions.add(new Affectation(r.getName(), t.getChild(0).toString()));
            this.instructions.add(new IfzGoto(r.getName(), ifLabel));

            //CORPS DU LOOP
            visit(t.getChild(1)); //Toujours un Node_Bloc
            this.instructions.add(new Goto(forLabel));

            //SORTIE DU LOOP
            this.instructions.add(new Label(ifLabel));
        }

        //Constructeurs

        public void treatingCons(Tree t){
            for (int i = 0 ; i < t.getChildCount() ; i ++){
                if (t.getChild(i).toString().startsWith("Node_")){
                    visit(t.getChild(i));
                }else {
                    Register r = new Register();
                    this.instructions.add(new Affectation(r.getName(), t.getChild(i).toString()));
                    this.instructions.add(new Param(r.getName()));
                }
                if(t.getChildCount()-1==i){
                    Register r2 = new Register();
                    this.listeRegistres.add(r2.getName());
                    this.instructions.add(new Affectation(r2.getName(), "call cons " + t.getChildCount()));
                }
            }
            if(t.getChildCount() == 0){
                Register r2 = new Register();
                this.listeRegistres.add(r2.getName());
                this.instructions.add(new Affectation(r2.getName(), "call cons " + t.getChildCount()));
            }
        }

        public void treatingList(Tree t) { //pas envie @TODO
            for (int i = 0; i < t.getChildCount(); i++) {
                //Les enfants de t sont les élements de la liste
                t.getChild(i);
            }
        }
}
