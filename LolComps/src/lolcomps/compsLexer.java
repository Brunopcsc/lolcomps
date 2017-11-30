// Generated from comps.g4 by ANTLR 4.7
package lolcomps;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, IDENT=23, CAMPEAO=24, 
		VALOR=25, ESPACOS=26, ERROR=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "IDENT", "CAMPEAO", "VALOR", 
		"ESPACOS", "ERROR"
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


	public compsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "comps.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25:
			ESPACOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ESPACOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip(); 
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado"); 
			
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00c3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\5\30\u00a4\n\30\3\30\7\30\u00a7"+
		"\n\30\f\30\16\30\u00aa\13\30\3\31\3\31\7\31\u00ae\n\31\f\31\16\31\u00b1"+
		"\13\31\3\31\3\31\3\32\6\32\u00b6\n\32\r\32\16\32\u00b7\3\32\3\32\5\32"+
		"\u00bc\n\32\3\33\3\33\3\33\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\6\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\6\2\"\"))C\\c|\5\2\13\f\17\17\"\"\2\u00c6\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2"+
		"\2\2\13A\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21N\3\2\2\2\23R\3\2\2\2\25V\3"+
		"\2\2\2\27Z\3\2\2\2\31\\\3\2\2\2\33c\3\2\2\2\35m\3\2\2\2\37s\3\2\2\2!x"+
		"\3\2\2\2#\u0080\3\2\2\2%\u0083\3\2\2\2\'\u0089\3\2\2\2)\u0090\3\2\2\2"+
		"+\u0097\3\2\2\2-\u009d\3\2\2\2/\u00a3\3\2\2\2\61\u00ab\3\2\2\2\63\u00b5"+
		"\3\2\2\2\65\u00bd\3\2\2\2\67\u00c0\3\2\2\29:\7*\2\2:\4\3\2\2\2;<\7+\2"+
		"\2<\6\3\2\2\2=>\7]\2\2>\b\3\2\2\2?@\7_\2\2@\n\3\2\2\2AB\7v\2\2BC\7q\2"+
		"\2CD\7r\2\2D\f\3\2\2\2EF\7?\2\2F\16\3\2\2\2GH\7l\2\2HI\7w\2\2IJ\7p\2\2"+
		"JK\7i\2\2KL\7n\2\2LM\7g\2\2M\20\3\2\2\2NO\7o\2\2OP\7k\2\2PQ\7f\2\2Q\22"+
		"\3\2\2\2RS\7c\2\2ST\7f\2\2TU\7e\2\2U\24\3\2\2\2VW\7u\2\2WX\7w\2\2XY\7"+
		"r\2\2Y\26\3\2\2\2Z[\7.\2\2[\30\3\2\2\2\\]\7g\2\2]^\7p\2\2^_\7i\2\2_`\7"+
		"c\2\2`a\7i\2\2ab\7g\2\2b\32\3\2\2\2cd\7f\2\2de\7k\2\2ef\7u\2\2fg\7g\2"+
		"\2gh\7p\2\2hi\7i\2\2ij\7c\2\2jk\7i\2\2kl\7g\2\2l\34\3\2\2\2mn\7u\2\2n"+
		"o\7k\2\2op\7g\2\2pq\7i\2\2qr\7g\2\2r\36\3\2\2\2st\7r\2\2tu\7q\2\2uv\7"+
		"m\2\2vw\7g\2\2w \3\2\2\2xy\7r\2\2yz\7k\2\2z{\7e\2\2{|\7m\2\2|}\7q\2\2"+
		"}~\7h\2\2~\177\7h\2\2\177\"\3\2\2\2\u0080\u0081\7e\2\2\u0081\u0082\7e"+
		"\2\2\u0082$\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085\7r\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7k\2\2\u0087\u0088\7v\2\2\u0088&\3\2\2\2\u0089\u008a"+
		"\7i\2\2\u008a\u008b\7n\2\2\u008b\u008c\7q\2\2\u008c\u008d\7d\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f(\3\2\2\2\u0090\u0091\7e\2\2\u0091"+
		"\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\u0094\7c\2\2\u0094\u0095\7t\2\2"+
		"\u0095\u0096\7y\2\2\u0096*\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7c\2"+
		"\2\u0099\u009a\7t\2\2\u009a\u009b\7n\2\2\u009b\u009c\7{\2\2\u009c,\3\2"+
		"\2\2\u009d\u009e\7n\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1.\3\2\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a8"+
		"\3\2\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\60\3\2\2\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00af\7)\2\2\u00ac\u00ae\t\4\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\7)\2\2\u00b3\62\3\2\2\2\u00b4\u00b6\4\62;\2"+
		"\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\7\60\2\2\u00ba\u00bc\4\62;\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\64\3\2\2\2\u00bd\u00be"+
		"\t\5\2\2\u00be\u00bf\b\33\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\13\2\2\2\u00c1"+
		"\u00c2\b\34\3\2\u00c28\3\2\2\2\n\2\u00a3\u00a6\u00a8\u00ad\u00af\u00b7"+
		"\u00bb\4\3\33\2\3\34\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}