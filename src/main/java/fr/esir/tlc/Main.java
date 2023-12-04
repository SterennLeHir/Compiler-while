package fr.esir.tlc;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<TableOfSymbols> stack = new Stack<>();
        TableOfSymbols t1 = new TableOfSymbols("table1");
        stack.push(t1);
        TableOfSymbols t2 = new TableOfSymbols("table2");
        stack.push(t2);
        TableOfSymbols t3 = new TableOfSymbols("table3");
        stack.push(t3);

        System.out.println(stack.peek().toString());

        System.out.println("2 ? : "+stack.search(t2));
        System.out.println(t1.toString());
        System.out.println(stack.elementAt(1).toString());
    }
}