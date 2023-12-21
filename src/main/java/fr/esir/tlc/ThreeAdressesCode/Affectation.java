package fr.esir.tlc.ThreeAdressesCode;

public class Affectation extends Operation {

    Register variableLeft;
    String variableRight;
    public Affectation(Register variableToAffect, String valueToAffect) {
        this.variableLeft = variableToAffect;
        this.variableRight = valueToAffect;
    }
    @Override
    public String toThreeAdressesCode() {
       return variableLeft.name + "=" + variableRight;
    }

    @Override
    public String toJava() {
        return null;
    }
}
