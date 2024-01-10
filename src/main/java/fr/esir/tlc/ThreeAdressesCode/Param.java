package fr.esir.tlc.ThreeAdressesCode;

public class Param extends Operation {

    private String param;

    public Param(String param) {
        this.param = param;
    }
    @Override
    public String toThreeAdressesCode() {
        return "param " + this.param; // Ajoute this.param sur la pile
    }

    @Override
    public String toJava() {
        return null;
    }
}
