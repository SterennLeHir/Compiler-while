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
    private final int entries;
    private final int outputs;

    /**
     * This is the constructor.
     * @param name The name of the parent class/
     */
    public TableOfSymbols(String name){
        this.name = name;
        this.set = new HashSet<>();
        this.entries=0;
        this.outputs=0;
    }

    /**
     * This is the constructor for a Table affiliated with a parent function.
     * @param name The name of the parent function.
     * @param entries The number of parameters.
     * @param outputs The number of outputs.
     * @param parameters The parameters of the function.
     */
    public TableOfSymbols(String name, int entries, int outputs, Set<String> parameters){
        this.name = name;
        this.set = parameters;
        this.entries = entries;
        this.outputs = outputs;
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
        return this.name+" ("+entries+","+outputs+") : "+ set.toString();
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
}
