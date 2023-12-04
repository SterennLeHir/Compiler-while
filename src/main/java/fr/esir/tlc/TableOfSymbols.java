package fr.esir.tlc;

import java.util.HashSet;
import java.util.Set;


/*
On crée une nouvelle table à chaque truc.
Une table pour les fonctions.
Une table pour les paramètres.
Une table pour les variables locales.

Faut faire un pattern visitor sur l'AST pour générer la table des symboles
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
    private final String type; //Refers to what type of table it is (functions/parameters/variables)
    private Set<String> set;
    private final int entries;
    private final int outputs;
    /**
     * This is the constructor.
     * @param name The name of the symbol
     */
    public TableOfSymbols(String name, String type){
        this.name = name;
        this.type = type;
        this.set = new HashSet<>();
        this.entries=0;
        this.outputs=0;
    }

    public TableOfSymbols(String name, String type, int entries, int outputs){
        this.name = name;
        this.type = type;
        this.set = new HashSet<>();
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
        return this.name+" ("+type+") : ";
    }

    /**
     * This function returns true if the key is present in the set.
     * @param key : a key to find
     * @return true if present, false if not
     */
    public boolean foundKey (String key){
        return this.set.contains(key);
    }
}
