package fr.esir.tlc;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import javax.sound.midi.Soundbank;

public class Main {


    public static void main(String[] args) throws Exception {
        whileLexer lex = new whileLexer(new ANTLRFileStream("C:\\Users\\aleco\\IdeaProjects\\Compiler-while\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        whileParser g = new whileParser(tokens, null);
        try {
            whileParser.program_return prog = g.program();
            System.out.println("j'essaie");
            System.out.println("\n-------------------------------------------------------\n");
            Tree t = (Tree) prog.getTree();
            //t C'est la racine
            System.out.println(t.toStringTree());
            Visitor v = new Visitor();
            v.visit(t);

        } catch (RecognitionException e) {
            e.printStackTrace();
        }
        System.out.println("\n-------------------------------------------------------\n");
        System.out.println("j'ai fini");
    }
}