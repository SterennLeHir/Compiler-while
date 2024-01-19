package fr.esir.tlc;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import java.io.File;

public class Main {


    public static void main(String[] args) throws Exception {
        //On vérifie si les arguments de main sont vides ou non.
        if(args.length == 0) {
            System.err.println("Should provide the path to the source code");
            System.exit(1);
        }

        //Si ce n'est pas le cas, on crée une File depuis le premier argument d'args.
        File file = new File(args[0]);

        //Si le fichier existe et est lisible
        if(!file.exists() || !file.canRead()) {
            System.err.println("Provide a path to an existing readable file");
            System.exit(2);
        }
        //On a alors un fichier qu'on peut utiliser

        //Initialisation du Lexer et Parser avec ce fichier
        whileLexer lex = new whileLexer(new ANTLRFileStream(args[0], "UTF8"));
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

            System.out.println("\nCODE 3 ADDRESSES\n-------------------------------------------------------");

            //VisitorTAC v2 = new VisitorTAC();
            //v2.visit(t);

            System.out.println("\nTRADUCTION\n-------------------------------------------------------");

        } catch (RecognitionException e) {
            e.printStackTrace();
        }
        System.out.println("\n-------------------------------------------------------\nFIN");
    }
}