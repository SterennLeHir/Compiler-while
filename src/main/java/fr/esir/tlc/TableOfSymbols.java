package fr.esir.tlc;

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

public class TableOfSymbols {
    private final String name; //refers to the parent function or program
    private final Set<String> set;

    private final Set<String> parameters;



    private int inputs;
    private int outputs;

    /**
     * This is the constructor.
     * @param name The name of the parent class/
     */
    public TableOfSymbols(String name){
        this.name = name;
        this.set = new HashSet<>();
        this.parameters=new HashSet<>();
        this.inputs=0;
        this.outputs=0;
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
    public String toString (){
        return this.name+" ("+inputs+","+outputs+") : "+ set.toString();
    }

    /**
     * This function returns true if the key is present in the set.
     * @param variable : a variable to find in the table
     * @return true if present, false if not
     */
    public boolean foundVariable (String variable){
        return this.set.contains(variable);
    }

    /**
     * This function adds the variable to the set, if the variable isn't there.
     * @param variable The variable to add to the table
     */
    public void addVariableToSet(String variable){
        if (!foundVariable(variable)) this.set.add(variable);
    }
    public void addVarToParameters(String variable){
        if (!this.parameters.contains(variable)){
            parameters.add(variable);
        }
    }

    public int getInputs() {
        return inputs;
    }

    public int getOutputs() {
        return outputs;
    }

    public void setInputs(int i){
        this.inputs=i;
    }

    public void setOutputs(int i){
        this.outputs=i;
    }

    public void addParameters(Set<String> s){
        set.addAll(s);
    }

    public Set<String> getParameters(){
        return parameters;
    }

    public Set<String> getSet(){
        return set;
    }


}
