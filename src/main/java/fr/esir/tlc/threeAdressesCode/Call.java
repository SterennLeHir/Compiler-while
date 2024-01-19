package fr.esir.tlc.threeAdressesCode;

public class Call extends Instruction{

    private final String name;
    private final int number;

    Call(String name, int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "call " + name + " " + number;
    }
}
