package fr.esir.tlc.threeAdressesCode;

public class Register {
    public static int registerCount = 0;
    public String name;
    public Register() {
        name = "t" +  registerCount; // produce t0 then t1...
        registerCount++;
    }
}
