package fr.esir.tlc.threeAdressesCode;

public class Register {
    public static int registerCount = 0;
    private String name;

    public Register() {
        name = "R" +  registerCount; // produce t0 then t1...
        registerCount++;
    }
    public String getName(){
        return this.name;
    }
}
