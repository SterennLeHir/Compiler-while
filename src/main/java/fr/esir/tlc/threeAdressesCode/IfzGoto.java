package fr.esir.tlc.threeAdressesCode;

public class IfzGoto extends Instruction{

    private final String registre;
    private final String label;

    IfzGoto(String reg, String lab){
        this.registre = reg;
        this.label = lab;
    }

    @Override
    public String toString() {
        return "ifz " + this.registre + " goto " + this.label;
    }
}
