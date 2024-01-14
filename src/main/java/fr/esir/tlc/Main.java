package fr.esir.tlc;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

public class Main {


    public static void main(String[] args) throws Exception {
        //Initialisation du Lexer et Parser
        whileLexer lex = new whileLexer(new ANTLRFileStream("C:\\Users\\aleco\\IdeaProjects\\Compiler-while\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        whileParser g = new whileParser(tokens, null);

        //Traitement principal
        try {
            whileParser.program_return prog = g.program(); //AST de notre programme d'entrée
            System.out.println("AST\n-------------------------------------------------------");
            Tree t = (Tree) prog.getTree();
            //t C'est la racine
            System.out.println(t.toStringTree()); //Affichage de l'AST

            System.out.println("\nANALYSE SEMANTIQUE\n-------------------------------------------------------");

            VisitorSemantic v = new VisitorSemantic();
            v.visit(t);

        } catch (RecognitionException e) {
            e.printStackTrace();
        }
        System.out.println("\n-------------------------------------------------------\nFIN");
    }
}