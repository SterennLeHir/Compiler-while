package fr.esir.tlc.ThreeAdressesCode;

public class Goto extends Operation {
    private String label;

    public Goto(String label) {
        this.label = label;
    }

    @Override
    public String toThreeAdressesCode() {
        return "goto " + this.label;
    }

    @Override
    public String toJava() {
        return null;
    }
}
