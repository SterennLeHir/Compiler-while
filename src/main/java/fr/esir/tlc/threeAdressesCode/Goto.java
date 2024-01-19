package fr.esir.tlc.threeAdressesCode;

public class Goto extends Instruction{

    private final String label;

    Goto(String lab){
        this.label = lab;
    }

    @Override
    public String toString() {
        return "goto " + this.label;
    }
}
