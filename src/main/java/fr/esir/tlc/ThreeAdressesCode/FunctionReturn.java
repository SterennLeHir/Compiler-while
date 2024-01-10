package fr.esir.tlc.ThreeAdressesCode;

public class FunctionReturn extends Operation {
    private String[] retours;
    public FunctionReturn(String[] retours) {
        this.retours = retours;
    }
    @Override
    public String toThreeAdressesCode() {
        String s = "return";
        for (String retour: retours) {
            s += " " + retour + ",";
        }
        s = s.substring(0, s.length() - 1); // On enlève la dernière ","
        return s;
    }

    @Override
    public String toJava() {
        return null;
    }
}
