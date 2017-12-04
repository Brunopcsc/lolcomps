package lolcomps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TabelaDeSimbolos {
    public String escopo;
    
    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;
    public TabelaDeSimbolos(String escopo) {
        this.escopo=escopo;
        tabelaDeSimbolos = new HashMap<>();
    }
    public void inserir(String nome) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        tabelaDeSimbolos.put(nome, etds);
    }
    public EntradaTabelaDeSimbolos verificar(String nome) {
        if(!tabelaDeSimbolos.containsKey(nome))
            return null;
        else return tabelaDeSimbolos.get(nome);
    }
    
    public String nomeEscopo()
    {
        return this.escopo;
    }
}