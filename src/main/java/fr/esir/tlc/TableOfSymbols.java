package fr.esir.tlc;

import java.util.HashMap;
import java.util.Map;

public class TableOfSymbols {
    private final String name;
    private final Map<String,Integer> table;

    /**
     * This is the constructor.
     * @param name The name of the table, corresponding to the name of the function,
     *             followed by a number, indicating which loop we are in. (e.g. : {})
     */
    public TableOfSymbols(String name){
        this.name = name;
        table = new HashMap<>();
    }

    /**
     * This function adds a pair (key, value) to the map of symbols.
     * @param key The identifier of a symbol
     * @param value The line at which it is first found/created
     */
    public void addToTable(String key, int value){
        table.put(key,value);
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
        return this.name+" : "+this.table.toString();
    }

    /**
     * This function returns true if the key is present in the table.
     * @param key : a key to find
     * @return true if present, false if not
     */
    public boolean foundKey (String key){
        return this.table.containsKey(key);
    }
}
