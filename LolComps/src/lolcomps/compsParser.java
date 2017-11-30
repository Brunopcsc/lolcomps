// Generated from comps.g4 by ANTLR 4.7
package lolcomps;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, IDENT=23, CAMPEAO=24, 
		VALOR=25, ESPACOS=26, ERROR=27;
	public static final int
		RULE_programa = 0, RULE_mais_comp = 1, RULE_nome = 2, RULE_posicoes = 3, 
		RULE_listacamps = 4, RULE_top = 5, RULE_jungle = 6, RULE_mid = 7, RULE_adc = 8, 
		RULE_sup = 9, RULE_mais_campeoes = 10, RULE_campeoes = 11, RULE_carac = 12, 
		RULE_lista = 13, RULE_bans = 14;
	public static final String[] ruleNames = {
		"programa", "mais_comp", "nome", "posicoes", "listacamps", "top", "jungle", 
		"mid", "adc", "sup", "mais_campeoes", "campeoes", "carac", "lista", "bans"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'['", "']'", "'top'", "'='", "'jungle'", "'mid'", 
		"'adc'", "'sup'", "','", "'engage'", "'disengage'", "'siege'", "'poke'", 
		"'pickoff'", "'cc'", "'split'", "'global'", "'clearw'", "'early'", "'late'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "IDENT", 
		"CAMPEAO", "VALOR", "ESPACOS", "ERROR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "comps.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public PosicoesContext posicoes() {
			return getRuleContext(PosicoesContext.class,0);
		}
		public CaracContext carac() {
			return getRuleContext(CaracContext.class,0);
		}
		public BansContext bans() {
			return getRuleContext(BansContext.class,0);
		}
		public Mais_compContext mais_comp() {
			return getRuleContext(Mais_compContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			nome();
			setState(31);
			posicoes();
			setState(32);
			carac();
			setState(33);
			bans();
			setState(34);
			mais_comp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_compContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public CampeoesContext campeoes() {
			return getRuleContext(CampeoesContext.class,0);
		}
		public CaracContext carac() {
			return getRuleContext(CaracContext.class,0);
		}
		public BansContext bans() {
			return getRuleContext(BansContext.class,0);
		}
		public Mais_compContext mais_comp() {
			return getRuleContext(Mais_compContext.class,0);
		}
		public Mais_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterMais_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitMais_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitMais_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_compContext mais_comp() throws RecognitionException {
		Mais_compContext _localctx = new Mais_compContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mais_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(36);
				nome();
				setState(37);
				campeoes();
				setState(38);
				carac();
				setState(39);
				bans();
				setState(40);
				mais_comp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(compsParser.IDENT, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			match(IDENT);
			setState(46);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PosicoesContext extends ParserRuleContext {
		public ListacampsContext listacamps() {
			return getRuleContext(ListacampsContext.class,0);
		}
		public PosicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterPosicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitPosicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitPosicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosicoesContext posicoes() throws RecognitionException {
		PosicoesContext _localctx = new PosicoesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_posicoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__2);
			setState(49);
			listacamps();
			setState(50);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListacampsContext extends ParserRuleContext {
		public TopContext top() {
			return getRuleContext(TopContext.class,0);
		}
		public JungleContext jungle() {
			return getRuleContext(JungleContext.class,0);
		}
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public AdcContext adc() {
			return getRuleContext(AdcContext.class,0);
		}
		public SupContext sup() {
			return getRuleContext(SupContext.class,0);
		}
		public ListacampsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listacamps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterListacamps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitListacamps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitListacamps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListacampsContext listacamps() throws RecognitionException {
		ListacampsContext _localctx = new ListacampsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listacamps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			top();
			setState(53);
			jungle();
			setState(54);
			mid();
			setState(55);
			adc();
			setState(56);
			sup();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopContext extends ParserRuleContext {
		public CampeoesContext campeoes() {
			return getRuleContext(CampeoesContext.class,0);
		}
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitTop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitTop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_top);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__4);
			setState(59);
			match(T__5);
			setState(60);
			campeoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JungleContext extends ParserRuleContext {
		public CampeoesContext campeoes() {
			return getRuleContext(CampeoesContext.class,0);
		}
		public JungleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jungle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterJungle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitJungle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitJungle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JungleContext jungle() throws RecognitionException {
		JungleContext _localctx = new JungleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jungle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__6);
			setState(63);
			match(T__5);
			setState(64);
			campeoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MidContext extends ParserRuleContext {
		public CampeoesContext campeoes() {
			return getRuleContext(CampeoesContext.class,0);
		}
		public MidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterMid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitMid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitMid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MidContext mid() throws RecognitionException {
		MidContext _localctx = new MidContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__7);
			setState(67);
			match(T__5);
			setState(68);
			campeoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdcContext extends ParserRuleContext {
		public CampeoesContext campeoes() {
			return getRuleContext(CampeoesContext.class,0);
		}
		public AdcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterAdc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitAdc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitAdc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdcContext adc() throws RecognitionException {
		AdcContext _localctx = new AdcContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_adc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__8);
			setState(71);
			match(T__5);
			setState(72);
			campeoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SupContext extends ParserRuleContext {
		public CampeoesContext campeoes() {
			return getRuleContext(CampeoesContext.class,0);
		}
		public SupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterSup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitSup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitSup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupContext sup() throws RecognitionException {
		SupContext _localctx = new SupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__9);
			setState(75);
			match(T__5);
			setState(76);
			campeoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_campeoesContext extends ParserRuleContext {
		public CampeoesContext campeoes() {
			return getRuleContext(CampeoesContext.class,0);
		}
		public Mais_campeoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_campeoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterMais_campeoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitMais_campeoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitMais_campeoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_campeoesContext mais_campeoes() throws RecognitionException {
		Mais_campeoesContext _localctx = new Mais_campeoesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mais_campeoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(78);
				match(T__10);
				setState(79);
				campeoes();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CampeoesContext extends ParserRuleContext {
		public TerminalNode CAMPEAO() { return getToken(compsParser.CAMPEAO, 0); }
		public Mais_campeoesContext mais_campeoes() {
			return getRuleContext(Mais_campeoesContext.class,0);
		}
		public CampeoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campeoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterCampeoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitCampeoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitCampeoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampeoesContext campeoes() throws RecognitionException {
		CampeoesContext _localctx = new CampeoesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_campeoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CAMPEAO);
			setState(83);
			mais_campeoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaracContext extends ParserRuleContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public CaracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterCarac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitCarac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitCarac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaracContext carac() throws RecognitionException {
		CaracContext _localctx = new CaracContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_carac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__2);
			setState(86);
			lista();
			setState(87);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaContext extends ParserRuleContext {
		public List<TerminalNode> VALOR() { return getTokens(compsParser.VALOR); }
		public TerminalNode VALOR(int i) {
			return getToken(compsParser.VALOR, i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__11);
			setState(90);
			match(T__10);
			setState(91);
			match(VALOR);
			setState(92);
			match(T__12);
			setState(93);
			match(T__10);
			setState(94);
			match(VALOR);
			setState(95);
			match(T__13);
			setState(96);
			match(T__10);
			setState(97);
			match(VALOR);
			setState(98);
			match(T__14);
			setState(99);
			match(T__10);
			setState(100);
			match(VALOR);
			setState(101);
			match(T__15);
			setState(102);
			match(T__10);
			setState(103);
			match(VALOR);
			setState(104);
			match(T__16);
			setState(105);
			match(T__10);
			setState(106);
			match(VALOR);
			setState(107);
			match(T__17);
			setState(108);
			match(T__10);
			setState(109);
			match(VALOR);
			setState(110);
			match(T__18);
			setState(111);
			match(T__10);
			setState(112);
			match(VALOR);
			setState(113);
			match(T__19);
			setState(114);
			match(T__10);
			setState(115);
			match(VALOR);
			setState(116);
			match(T__20);
			setState(117);
			match(T__10);
			setState(118);
			match(VALOR);
			setState(119);
			match(T__7);
			setState(120);
			match(T__10);
			setState(121);
			match(VALOR);
			setState(122);
			match(T__21);
			setState(123);
			match(T__10);
			setState(124);
			match(VALOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BansContext extends ParserRuleContext {
		public TerminalNode CAMPEAO() { return getToken(compsParser.CAMPEAO, 0); }
		public Mais_campeoesContext mais_campeoes() {
			return getRuleContext(Mais_campeoesContext.class,0);
		}
		public BansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).enterBans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compsListener ) ((compsListener)listener).exitBans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compsVisitor ) return ((compsVisitor<? extends T>)visitor).visitBans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BansContext bans() throws RecognitionException {
		BansContext _localctx = new BansContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(126);
				match(T__2);
				setState(127);
				match(CAMPEAO);
				setState(128);
				mais_campeoes();
				setState(129);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\fS\n\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0086\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36\2\2\2{\2 \3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\62\3\2\2"+
		"\2\n\66\3\2\2\2\f<\3\2\2\2\16@\3\2\2\2\20D\3\2\2\2\22H\3\2\2\2\24L\3\2"+
		"\2\2\26R\3\2\2\2\30T\3\2\2\2\32W\3\2\2\2\34[\3\2\2\2\36\u0085\3\2\2\2"+
		" !\5\6\4\2!\"\5\b\5\2\"#\5\32\16\2#$\5\36\20\2$%\5\4\3\2%\3\3\2\2\2&\'"+
		"\5\6\4\2\'(\5\30\r\2()\5\32\16\2)*\5\36\20\2*+\5\4\3\2+-\3\2\2\2,&\3\2"+
		"\2\2,-\3\2\2\2-\5\3\2\2\2./\7\3\2\2/\60\7\31\2\2\60\61\7\4\2\2\61\7\3"+
		"\2\2\2\62\63\7\5\2\2\63\64\5\n\6\2\64\65\7\6\2\2\65\t\3\2\2\2\66\67\5"+
		"\f\7\2\678\5\16\b\289\5\20\t\29:\5\22\n\2:;\5\24\13\2;\13\3\2\2\2<=\7"+
		"\7\2\2=>\7\b\2\2>?\5\30\r\2?\r\3\2\2\2@A\7\t\2\2AB\7\b\2\2BC\5\30\r\2"+
		"C\17\3\2\2\2DE\7\n\2\2EF\7\b\2\2FG\5\30\r\2G\21\3\2\2\2HI\7\13\2\2IJ\7"+
		"\b\2\2JK\5\30\r\2K\23\3\2\2\2LM\7\f\2\2MN\7\b\2\2NO\5\30\r\2O\25\3\2\2"+
		"\2PQ\7\r\2\2QS\5\30\r\2RP\3\2\2\2RS\3\2\2\2S\27\3\2\2\2TU\7\32\2\2UV\5"+
		"\26\f\2V\31\3\2\2\2WX\7\5\2\2XY\5\34\17\2YZ\7\6\2\2Z\33\3\2\2\2[\\\7\16"+
		"\2\2\\]\7\r\2\2]^\7\33\2\2^_\7\17\2\2_`\7\r\2\2`a\7\33\2\2ab\7\20\2\2"+
		"bc\7\r\2\2cd\7\33\2\2de\7\21\2\2ef\7\r\2\2fg\7\33\2\2gh\7\22\2\2hi\7\r"+
		"\2\2ij\7\33\2\2jk\7\23\2\2kl\7\r\2\2lm\7\33\2\2mn\7\24\2\2no\7\r\2\2o"+
		"p\7\33\2\2pq\7\25\2\2qr\7\r\2\2rs\7\33\2\2st\7\26\2\2tu\7\r\2\2uv\7\33"+
		"\2\2vw\7\27\2\2wx\7\r\2\2xy\7\33\2\2yz\7\n\2\2z{\7\r\2\2{|\7\33\2\2|}"+
		"\7\30\2\2}~\7\r\2\2~\177\7\33\2\2\177\35\3\2\2\2\u0080\u0081\7\5\2\2\u0081"+
		"\u0082\7\32\2\2\u0082\u0083\5\26\f\2\u0083\u0084\7\6\2\2\u0084\u0086\3"+
		"\2\2\2\u0085\u0080\3\2\2\2\u0085\u0086\3\2\2\2\u0086\37\3\2\2\2\5,R\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}