package fr.esir.tlc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
On crée une nouvelle table à chaque truc.
Une table pour les fonctions.
Une table pour les paramètres. (À voir, parce qu'en soient les paramètres sont une forme de variables locales)
Une table pour les variables locales.

Il faut faire un modèle visitor sur l'AST pour générer la table des symboles
Donc, il faut que la table ait un type, un nom (la fonction pour les paramètres/variables locales ; le programme pour les fonctions)

Il faut que la table stocke soit :
- Le nom des fonctions ainsi que le nombre de paramètres et de sorties.
- Le nom des paramètres.
- Le nom des variables locales.

Il faut stocker plusieurs noms, ainsi que donner le type de table.
Si type = "fonction" : sauver aussi la taille entrée et sortie.
 */

public class Table {
    private final String name; //refers to the parent function or program
    private final Set<String> params;
    private final Set<String> vars;

    private int n_inputs;
    private int n_outputs;

    //parents et enfants
    private Table parent;
    private final ArrayList<Table> children;

    /**
     * This is the constructor.
     * @param name The name of the parent class/
     */
    public Table(String name){
        this.name = name;
        this.vars = new HashSet<>();
        this.params =new HashSet<>();

        this.n_inputs =0;
        this.n_outputs =0;

        this.parent = null;
        this.children=new ArrayList<>();
    }

    public Table getParent(){
        return this.parent;
    }

    public Table getChild(int i){
        return this.children.get(i);
    }

    public ArrayList<Table> getChildren(){
        return this.children;
    }

    public void addChild(Table table){
        this.children.add(table);
        table.setParent(this);
    }

    private void setParent(Table table) {
        this.parent = table;
    }

    /**
     * This function returns the name of the table.
     * @return The name of the table (private parameter).
     */
    public String getName(){
        return this.name;
    }

    /**
     * This function returns the toString version of the table.
     * It follows the format : "name_of_table : table.toString()"
     * @return The toString version of the table
     */
    public String toString(){
        return this.name+" ("+ n_inputs +","+ n_outputs +") : "+ vars.toString();
    }

    /**
     * This function returns the toString version of the table and its children
     * It follows the format : "name_of_table : table.toString()"
     * @return The toString version of the table
     */
    public String toStringAll(int depth){
        StringBuilder all = new StringBuilder(this.toString());
        for(Table child:this.getChildren()){
            all.append("\n");
            for(int i = 0; i<depth+1; i++){
                all.append("    ");
            }
            all.append(child.toStringAll(depth+1));
        }
        return all.toString();
    }


    /**
     * This function returns true if the key is present in the set.
     * @param variable : a variable to find in the table
     * @return true if present, false if not
     */
    public boolean findVarOrParam(String variable){
        if(this.parent!=null){//tant qu'on a pas tout remonté
            return (this.vars.contains(variable)||this.params.contains(variable))||parent.findVarOrParam(variable);//on regarde si la variable est dans cette table ou celle du parent
        }
        else
        {
            return false; //ici on est dan la racine, il n'y a pas de variables
        }
    }

    public boolean findOutput(String variable){
        boolean bool = this.vars.contains(variable)||this.params.contains(variable);
        if(!this.children.isEmpty()){//tant qu'on a pas tout descendu
            for(Table child : this.getChildren()){
                bool = bool||child.findOutput(variable);//on regarde si la variable est dans cette table ou celle dees enfants
            }
        }
        return bool;
    }

    public void addParams(Set<String> s){
        vars.addAll(s); //On considère que les params font parti des variables locales à la table
        this.n_inputs = s.size();
    }

    /**
     * This function adds the variable to the set, if the variable isn't there.
     * @param variable The variable to add to the table
     */
    public void addVar(String variable){
        if (!this.vars.contains(variable)) this.vars.add(variable);
    }

    public int getN_inputs() {
        return n_inputs;
    }

    public int getN_outputs() {
        return n_outputs;
    }


    public void setN_outputs(int i){
        this.n_outputs =i;
    }

    public Set<String> getParams(){
        return params;
    }

    public Set<String> getVars(){
        return vars;
    }
}
