package fr.esir.tlc.threeAdressesCode;

public class Affectation extends Instruction {

    String variableLeft;
    String variableRight;
    public Affectation(String variableToAffect, String valueToAffect) {
        this.variableLeft = variableToAffect;
        this.variableRight = valueToAffect;
    }
    @Override
    public String toThreeAdressesCode() {
       return variableLeft + "=" + variableRight;
    }

    @Override
    public String toJava() {
        return null;
    }
}
