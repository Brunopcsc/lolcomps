/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lolcomps;

/**
 *
 * @author gury
 */
public class Semantico extends compsBaseVisitor<Object> {

    SaidaParser saida;
    PilhaDeTabelas pilhaDeTabelas;
    TabelaDeSimbolos campeoes;
    // TabelaDeBonecos.valueOf("");
    public NomesBonecos listaDeCampeoes;
    
    public Semantico(SaidaParser out) {
        saida = out;
        listaDeCampeoes = new NomesBonecos();
        pilhaDeTabelas = new PilhaDeTabelas();
    }

    @Override
    public Object visitPrograma(compsParser.ProgramaContext ctx) {
        String nome_escopo = (String) visitNome(ctx.nome());
        boolean existe = false;
        for (TabelaDeSimbolos tabela : pilhaDeTabelas.percorrerEscoposAninhados()) {
            if (tabela.nomeEscopo() == nome_escopo) {
                existe = true;
                saida.println("Linha " + ctx.nome().getStart().getLine() + " : composição " + nome_escopo + " já existente!");
                break;
            }
        }
        if (!existe) {
            pilhaDeTabelas.criarNovoEscopo(nome_escopo);
        }
        pilhaDeTabelas.criarNovoEscopo("Campeoes");
        visitPosicoes(ctx.posicoes());
        pilhaDeTabelas.abandonarEscopo();
        pilhaDeTabelas.criarNovoEscopo("Caracteristicas");
        visitCarac(ctx.carac());
        pilhaDeTabelas.abandonarEscopo();
        visitMais_comp(ctx.mais_comp());
        return null;
    }

    @Override
    public Object visitNome(compsParser.NomeContext ctx) {
        if (ctx.IDENT() != null) {
            if(ctx.IDENT().getText().length()>18)
                saida.println("Linha "+ ctx.IDENT().getSymbol().getLine()+ ": nome da comp não pode conter mais de 18 caracteres.");
            return ctx.IDENT().getText();
        }
        return null;
    }

    @Override
    public Object visitPosicoes(compsParser.PosicoesContext ctx) {
        visitListacamps(ctx.listacamps());
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitListacamps(compsParser.ListacampsContext ctx) {
        visitTop(ctx.top());
        visitJungle(ctx.jungle());
        visitMid(ctx.mid());
        visitAdc(ctx.adc());
        visitSup(ctx.sup());
        return null;
    }

    @Override
    public Object visitTop(compsParser.TopContext ctx) {
        int qtd = (int) visitCampeoes(ctx.campeoes());
        if (qtd>3)
            saida.println("Linha: "+ ctx.getStart().getLine()+ ": foram adicionados mais de 3 campeões!");
        return null;
    }

    @Override
    public Object visitJungle(compsParser.JungleContext ctx) {
        int qtd = (int) visitCampeoes(ctx.campeoes());
        if (qtd>3)
            saida.println("Linha: "+ ctx.getStart().getLine()+ ": foram adicionados mais de 3 campeões!");
        return null;
    }

    @Override
    public Object visitMid(compsParser.MidContext ctx) {
        int qtd = (int) visitCampeoes(ctx.campeoes());
        if (qtd>3)
            saida.println("Linha: "+ ctx.getStart().getLine()+ ": foram adicionados mais de 3 campeões!");
        return null;
    }

    @Override
    public Object visitAdc(compsParser.AdcContext ctx) {
        int qtd = (int) visitCampeoes(ctx.campeoes());
        if (qtd>3)
            saida.println("Linha: "+ ctx.getStart().getLine()+ ": foram adicionados mais de 3 campeões!");
        return null;
    }

    @Override
    public Object visitSup(compsParser.SupContext ctx) {
        int qtd = (int) visitCampeoes(ctx.campeoes());
        if (qtd>3)
            saida.println("Linha: "+ ctx.getStart().getLine()+ ": foram adicionados mais de 3 campeões!");
        return null;
    }

    @Override
    public Object visitCampeoes(compsParser.CampeoesContext ctx) {
        int inseriu=0;
        if (ctx.CAMPEAO() != null) {
            String camp = ctx.CAMPEAO().getText().substring(1, ctx.CAMPEAO().getText().length()-1);
            if(!listaDeCampeoes.getLista().contains(camp.toUpperCase()))
                saida.println("Linha "+ ctx.CAMPEAO().getSymbol().getLine() + ": campeão " + ctx.CAMPEAO().getText() + " não existe!");
            else if(pilhaDeTabelas.pegarEscopoAtual().verificar(ctx.CAMPEAO().getText())!=null)
            {
                saida.println("Linha "+ ctx.CAMPEAO().getSymbol().getLine() + ": campeão " + ctx.CAMPEAO().getText() + " já foi adicionado à essa comp!");
            }
            else
            {
                pilhaDeTabelas.pegarEscopoAtual().inserir(ctx.CAMPEAO().getText());
                inseriu++;
            }
        }
        return inseriu+(int)visitMais_campeoes(ctx.mais_campeoes());
    }

    @Override
    public Object visitMais_campeoes(compsParser.Mais_campeoesContext ctx) {
        if (ctx.campeoes() != null) {
            return visitCampeoes(ctx.campeoes());
        }        
        return 0;
    }

    @Override
    public Object visitLista(compsParser.ListaContext ctx) {
        if(pilhaDeTabelas.pegarEscopoAtual().verificar(ctx.getChild(0).getText())!=null)
        {
            saida.println("Linha "+ ctx.VALOR().getSymbol().getLine() + ": característica " + ctx.getChild(0).getText()+" já foi adicionada à essa comp!");
        }
        else
            pilhaDeTabelas.pegarEscopoAtual().inserir(ctx.getChild(0).getText());    
        if(Float.parseFloat(ctx.VALOR().getText())>10)
            saida.println("Linha "+ ctx.VALOR().getSymbol().getLine() + ": o valor deve estar no intervalo [0,10]!");
        return null;
    }

    @Override
    public Object visitCarac(compsParser.CaracContext ctx) {
        visitLista(ctx.lista());
        visitMais_lista(ctx.mais_lista());
        return null;
    }

    @Override
    public Object visitMais_comp(compsParser.Mais_compContext ctx) {
        if (ctx.nome() != null) {
            String nome_escopo = (String) visitNome(ctx.nome());
            boolean existe = false;
            for (TabelaDeSimbolos tabela : pilhaDeTabelas.percorrerEscoposAninhados()) {
                if (tabela.nomeEscopo().equals(nome_escopo)) {
                    existe = true;
                    saida.println("Linha " + ctx.nome().getStart().getLine() + " : composição " + nome_escopo + " já existente!");
                    break;
                }
            }
            if (!existe) {
                pilhaDeTabelas.criarNovoEscopo(nome_escopo);
            }
            pilhaDeTabelas.criarNovoEscopo("Campeoes");
            visitPosicoes(ctx.posicoes());
            pilhaDeTabelas.abandonarEscopo();
            pilhaDeTabelas.criarNovoEscopo("Caracteristicas");
            visitCarac(ctx.carac());
            pilhaDeTabelas.abandonarEscopo();
            if(ctx.mais_comp()!=null)
                visitMais_comp(ctx.mais_comp());
        }
        return null;
    }

}
