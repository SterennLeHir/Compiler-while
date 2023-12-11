package fr.esir.tlc;

public class concreteVisitor implements Visitor{
    @Override
    public void visit(){
        System.out.println("Visiting ElementA");
    }
}
