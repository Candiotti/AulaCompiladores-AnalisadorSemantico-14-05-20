package br.unilins.es.compiladores.semanticanalyzer;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
        public enum TipoLang {
        INTEIRO,
        REAL,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoLang tipo;

        private EntradaTabelaDeSimbolos(String nome, TipoLang tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoLang tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoLang verificar(String nome) {
        return tabela.get(nome).tipo;
    }
}
