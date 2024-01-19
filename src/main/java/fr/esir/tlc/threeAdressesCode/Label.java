package fr.esir.tlc.threeAdressesCode;

public class Label extends Instruction {

    private String name;

    Label(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name+":";
    }
}
