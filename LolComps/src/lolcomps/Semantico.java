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
	TabelaDeSimbolos ts;
	// TabelaDeBonecos.valueOf("");
	public Semantico(SaidaParser out) {
		saida = out;
		ts = new TabelaDeSimbolos();
	}

	@Override
	public Object visitPrograma(compsParser.ProgramaContext ctx) {
		String nome_escopo = (String)visitNome(ctx.nome());
				/*
		if (ctx.IDENT() != null) {	
			EntradaTabelaDeSimbolos escopo = ts.verificar(ctx.getText());
			if (escopo.nome != null)
				saida.println("Linha: " + ctx.IDENT().getSymbol().getLine() 
					+ " nome de composicao ja existente");
			else {
				ts.inserir(escopo.nome, ctx.IDENT(). );
			}
			return null; //To change body of generated methods, choose Tools | Templates.
		}*/
		visitPosicoes(ctx.posicoes());
		visitCarac(ctx.carac());
		visitBans(ctx.bans());
		visitMais_comp(ctx.mais_comp());
		return null; //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Object visitNome(compsParser.NomeContext ctx) {
		if (ctx.IDENT() != null)
			return ctx.IDENT().getText();
		else return null;

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
		return null; //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public Object visitTop(compsParser.TopContext ctx) {
		visitCampeoes(ctx.campeoes());
		return null; //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public Object visitJungle(compsParser.JungleContext ctx) {
		visitCampeoes(ctx.campeoes());
		return null;
	}
	@Override
	public Object visitMid(compsParser.MidContext ctx) {
		visitCampeoes(ctx.campeoes());
		return null;
	}
	@Override
	public Object visitAdc(compsParser.AdcContext ctx) {
		visitCampeoes(ctx.campeoes());
		return null;
	}
	@Override
	public Object visitSup(compsParser.SupContext ctx) {
		visitCampeoes(ctx.campeoes());
		return null;
	}
	@Override
	public Object visitCampeoes(compsParser.CampeoesContext ctx) {
		if (ctx.CAMPEAO() != null) {
			if (NomesBonecos.valueOf(ctx.CAMPEAO().getText()) == null)
				saida.println("Linha: " + ctx.CAMPEAO().getSymbol().getLine()
					+ "campeao nao existente.");
			else
				visitMais_campeoes(ctx.mais_campeoes());
		}
		return null;
	}

	@Override
	public Object visitMais_campeoes(compsParser.Mais_campeoesContext ctx) {
		if (ctx.campeoes() != null)
			visitCampeoes(ctx.campeoes());
		return null;
	}
	
	@Override
	public Object visitBans(compsParser.BansContext ctx) {
		return super.visitBans(ctx); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Object visitLista(compsParser.ListaContext ctx) {
		return super.visitLista(ctx); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Object visitCarac(compsParser.CaracContext ctx) {
		return super.visitCarac(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	

	@Override
	public Object visitMais_comp(compsParser.Mais_compContext ctx) {
		return super.visitMais_comp(ctx); //To change body of generated methods, choose Tools | Templates.
	}
	
	
	
	
	
}
