package br.unilins.es.compiladores.semanticanalyzer;

import br.unilins.es.compiladores.semanticanalyzer.SemaGrammarParser.ProgramaContext;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class SemaMain {
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        SemaGrammarLexer lexer = new SemaGrammarLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SemaGrammarParser parser = new SemaGrammarParser(tokens);
        ProgramaContext arvore = parser.programa();
        SemanticAnalyzer sa = new SemanticAnalyzer();
        sa.visitPrograma(arvore);
        LangSemanticUtils.errosSemanticos.forEach((s) -> System.out.println(s));
    }
}
