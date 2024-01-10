package fr.esir.tlc.ThreeAdressesCode;

public class FunctionCall extends Operation {

    private String name;
    private int nbParams;

    public FunctionCall(String name, int nbParams) {
        this.name = name;
        this.nbParams = nbParams;
    }
    @Override
    public String toThreeAdressesCode() {
        return "call " + this.name + " " + this.nbParams;
    }

    @Override
    public String toJava() {
        return null;
    }
}
