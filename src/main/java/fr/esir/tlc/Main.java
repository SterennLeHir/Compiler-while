package fr.esir.tlc;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.Tree;

import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        whileLexer var1 = new whileLexer(new ANTLRFileStream("C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream var2 = new CommonTokenStream(var1);
        whileParser var3 = new whileParser(var2, null);
        try {
            whileParser.program_return retour = var3.program();
            Tree ast = (Tree) retour.getTree();
            System.out.println(ast.toStringTree());
        } catch (RecognitionException var5) {
            var5.printStackTrace();
        }
    }
}

