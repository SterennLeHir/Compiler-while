package fr.esir.tlc.threeAdressesCode;


public abstract class Instruction {
    /**
     * @return a string corresponding to the Operation
     */
    public abstract String toThreeAdressesCode();

    /**
     * translate ThreeAdresses code in Java code
     * @return string corresponding to a Java code
     */
    public abstract String toJava();

    }
