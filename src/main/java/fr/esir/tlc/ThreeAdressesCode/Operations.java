package fr.esir.tlc.ThreeAdressesCode;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    // Cette classe correspond à l'ensemble des opérations en Code 3 Adresses
    private List<Operation> liste_operations;

    public Operations() {
        this.liste_operations = new ArrayList<>();
    }

    public void add(Operation op) {
        liste_operations.add(op);
    }

    public void add(Operations i) {
        liste_operations.addAll(i.getListe_operations());
    }

    public void remove(Operation op) {
        liste_operations.remove(op);
    }

    public String toString() {
        String s = "";
        for (Operation op : liste_operations) {
            s += op.toString() + "\n";
        }
        s = s.substring(0, s.length() - 1); // On enlève le dernier \n
        return s;
    }

    public List<Operation> getListe_operations() {
        return liste_operations;
    }

}
