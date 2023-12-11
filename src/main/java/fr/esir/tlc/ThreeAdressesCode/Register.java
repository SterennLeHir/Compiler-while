package fr.esir.tlc.ThreeAdressesCode;

public class Register {
    public static int registerCount = 0;
    public String name;
    public Register() {
        name = "t" +  registerCount; // produce t1 then t2...
        registerCount++;
    }
}
