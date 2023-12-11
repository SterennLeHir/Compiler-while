package fr.esir.tlc;

public interface Visitable {
    void accept(Visitor visitor);
}
