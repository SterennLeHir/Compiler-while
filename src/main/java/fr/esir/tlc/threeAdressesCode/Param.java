package fr.esir.tlc.threeAdressesCode;

public class Param extends Instruction{

    private String param;

    public Param(String p) {
        this.param = p;
    }

    @Override
    public String toString() {
        return "param "+param;
    }
}
