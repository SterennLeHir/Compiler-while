package fr.esir.tlc.ThreeAdressesCode;

public class FunctionBegin extends Operation {

    private String name;

    public FunctionBegin(String funcName) {
        this.name = name;
    }
    @Override
    public String toThreeAdressesCode() {
        return "func begin " + this.name;
    }

    @Override
    public String toJava() {
        return null;
    }
}
