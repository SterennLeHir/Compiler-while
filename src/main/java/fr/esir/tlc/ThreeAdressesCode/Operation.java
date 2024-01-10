package fr.esir.tlc.ThreeAdressesCode;


public abstract class Operation {
    // Cette classe correspond à toutes les opérations possibles en code 3 adresses et utiles pour while

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
