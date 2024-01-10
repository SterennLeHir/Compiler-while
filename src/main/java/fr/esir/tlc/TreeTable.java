package fr.esir.tlc;

import java.util.ArrayList;

public class TreeTable {
    private final Node root;
    private Node current;
    public TreeTable(){
        this.root=new Node(new Table("_ROOT_"));
        this.current=root;
    }

    public class Node {
        private final Table table;
        private final Node parent;
        private final ArrayList<Node> children;

        public Node(Table table){
            this.table = table;
            this.parent = null;
            this.children=new ArrayList<>();
        }

        public Node(Table table, Node parent){
            this.table = table;
            this.parent = parent;
            this.children=new ArrayList<>();
        }

        public Node getParent(){
            return this.parent;
        }

        public Node getChild(int i){
            return this.children.get(i);
        }

        public ArrayList<Node> getChildren(){
            return this.children;
        }

        public void addChild(Table table){
            this.children.add(new Node(table, this)); //On ajoute un enfant qui a la table donnée et le pointeur vers le parent
        }
    }

    public Node getRoot(){
        return this.root;
    }

    public Node getCurrent(){
        return this.current;
    }
    public void setCurrent(Node node){
        this.current = node;
    }
}
