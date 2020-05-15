package br.unilins.es.compiladores.semanticanalyzer;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class LangSemanticUtils {
     public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Erro %d:%d - %s", linha, coluna, mensagem));
    }
    
    public static TabelaDeSimbolos.TipoLang verificarTipo(TabelaDeSimbolos tabela, SemaGrammarParser.ExpressaoAritmeticaContext ctx) {
        TabelaDeSimbolos.TipoLang ret = null;
        for (SemaGrammarParser.TermoAritmeticoContext ta : ctx.termoAritmetico()) {
            TabelaDeSimbolos.TipoLang aux = verificarTipo(tabela, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLang.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Expressão " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLang.INVALIDO;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoLang verificarTipo(TabelaDeSimbolos tabela, SemaGrammarParser.TermoAritmeticoContext ctx) {
        TabelaDeSimbolos.TipoLang ret = null;
        
        for (SemaGrammarParser.FatorAritmeticoContext fa : ctx.fatorAritmetico()) {
            TabelaDeSimbolos.TipoLang aux = verificarTipo(tabela, fa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLang.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLang.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLang verificarTipo(TabelaDeSimbolos tabela, SemaGrammarParser.FatorAritmeticoContext ctx) {
        if (ctx.NUMINT() != null) {
            return TabelaDeSimbolos.TipoLang.INTEIRO;
        }
        if (ctx.NUMREAL() != null) {
            return TabelaDeSimbolos.TipoLang.REAL;
        }
        if (ctx.VARIAVEL() != null) {
            String nomeVar = ctx.VARIAVEL().getText();
            if (!tabela.existe(nomeVar)) {
                adicionarErroSemantico(ctx.VARIAVEL().getSymbol(), "Variável " + nomeVar + " não foi declarada antes do uso");
                return TabelaDeSimbolos.TipoLang.INVALIDO;
            }
            return verificarTipo(tabela, nomeVar);
        }
        return verificarTipo(tabela, ctx.expressaoAritmetica());
    }
    
    public static TabelaDeSimbolos.TipoLang verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}
