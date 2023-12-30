package fr.esir.tlc;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

public class TreeTable {

    private Node root;

    public TreeTable(){
        this.root=new Node(new TableOfSymbols(""));
    }


    public class Node {
        public ArrayList<Node> children;
        public Node parent;
        public TableOfSymbols value;

        public Node(TableOfSymbols table){
            this.value = table;
            children=new ArrayList<>();
        }

        public Node getChild(int i){
            return this.children.get(i);
        }

        public ArrayList<Node> getChildren(){
            return this.children;
        }

        public void addChild(TableOfSymbols table){
            this.children.add(new Node(table));
        }
    }

    public Node getRoot(){
        return root;
    }

}
