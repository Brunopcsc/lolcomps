/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lolcomps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TabelaDeSimbolos {
    
    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;
    public TabelaDeSimbolos() {
        tabelaDeSimbolos = new HashMap<>();
    }
    public void inserir(String nome_escopo, String nome_caracteristica) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome_caracteristica;
	tabelaDeSimbolos.put(nome_escopo, etds);
    }
    public EntradaTabelaDeSimbolos verificar(String nome_escopo) {
        if(tabelaDeSimbolos.containsKey(nome_escopo))
		return tabelaDeSimbolos.get(nome_escopo);
        else 
		return null;
    }
    
}