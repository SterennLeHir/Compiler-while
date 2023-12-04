package fr.esir.tlc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TableOfSymbols {
    private String name;

    private Map<String,Integer> table;

    public TableOfSymbols(String name){
        this.name = name;
        table = new HashMap<>();
    }

    public void AddToTable (String key, int value){
        table.put(key,value);
    }

    public String getName(){
        return this.name;
    }

    public String toString (){
        return this.name+" : "+this.table.toString();
    }
}
