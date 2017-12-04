package lolcomps;

import java.util.LinkedList;
import java.util.List;

public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilhaDeTabelas;
    public PilhaDeTabelas() {
        pilhaDeTabelas  = new LinkedList<>();
    }
    public void criarNovoEscopo(String escopo) {
        pilhaDeTabelas.push(new TabelaDeSimbolos(escopo));
    }
    public TabelaDeSimbolos pegarEscopoAtual() {
        return pilhaDeTabelas.peek();
    }
    public List<TabelaDeSimbolos> percorrerEscoposAninhados() {
        return pilhaDeTabelas;
    }
    public void abandonarEscopo() {
        pilhaDeTabelas.pop();
    }
}