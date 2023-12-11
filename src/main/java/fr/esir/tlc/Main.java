package fr.esir.tlc;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Main {
    public static void main(String[] args) throws Exception {
        whileLexer lex = new whileLexer(new ANTLRFileStream("C:\\Users\\hywel\\OneDrive\\Documents\\BOULOT\\M1\\S1\\TLC\\Projet\\Compiler-while\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        whileParser g = new whileParser(tokens, null);
        try {
            g.program();
            System.out.println("j'essaie");
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
        System.out.println("j'ai fini");
        System.out.println(g.program().tree.toString());
    }
}