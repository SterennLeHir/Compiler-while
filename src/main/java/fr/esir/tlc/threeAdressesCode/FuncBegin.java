package fr.esir.tlc.threeAdressesCode;

public class FuncBegin extends Instruction{
    private final String name;

    public FuncBegin(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "func begin " + this.name;
    }
}
