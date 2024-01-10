package fr.esir.tlc;

import java.util.ArrayList;

public class TreeTable {
    private final Node root;
    public TreeTable(){
        this.root=new Node(new Table(""));
    }

    public class Node {
        public Table table;
        public Node parent;
        public ArrayList<Node> children;


        public Node(Table table){
            this.table = table;
            this.children=new ArrayList<>();
        }

        public Node getChild(int i){
            return this.children.get(i);
        }

        public ArrayList<Node> getChildren(){
            return this.children;
        }

        public void addChild(Table table){
            this.children.add(new Node(table));
        }
    }

    public Node getRoot(){
        return root;
    }

}
