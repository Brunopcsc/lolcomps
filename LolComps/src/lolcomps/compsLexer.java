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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, IDENT=24, 
		CAMPEAO=25, VALOR=26, ESPACOS=27, ERROR=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "IDENT", "CAMPEAO", 
		"VALOR", "ESPACOS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'['", "']'", "'top'", "'='", "'jungle'", "'mid'", 
		"'adc'", "'sup'", "','", "'engage'", "'disengage'", "'siege'", "'poke'", 
		"'pickoff'", "'cc'", "'splitpush'", "'globalpresence'", "'clearwave'", 
		"'earlygame'", "'midgame'", "'lategame'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDENT", "CAMPEAO", "VALOR", "ESPACOS", "ERROR"
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
		case 26:
			ESPACOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00e4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\5\31\u00c5"+
		"\n\31\3\31\7\31\u00c8\n\31\f\31\16\31\u00cb\13\31\3\32\3\32\7\32\u00cf"+
		"\n\32\f\32\16\32\u00d2\13\32\3\32\3\32\3\33\6\33\u00d7\n\33\r\33\16\33"+
		"\u00d8\3\33\3\33\5\33\u00dd\n\33\3\34\3\34\3\34\3\35\3\35\3\35\2\2\36"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3"+
		"\2\6\5\2C\\aac|\6\2\62;C\\aac|\7\2\"\"))\60\60C\\c|\5\2\13\f\17\17\"\""+
		"\2\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rG\3\2\2"+
		"\2\17I\3\2\2\2\21P\3\2\2\2\23T\3\2\2\2\25X\3\2\2\2\27\\\3\2\2\2\31^\3"+
		"\2\2\2\33e\3\2\2\2\35o\3\2\2\2\37u\3\2\2\2!z\3\2\2\2#\u0082\3\2\2\2%\u0085"+
		"\3\2\2\2\'\u008f\3\2\2\2)\u009e\3\2\2\2+\u00a8\3\2\2\2-\u00b2\3\2\2\2"+
		"/\u00ba\3\2\2\2\61\u00c4\3\2\2\2\63\u00cc\3\2\2\2\65\u00d6\3\2\2\2\67"+
		"\u00de\3\2\2\29\u00e1\3\2\2\2;<\7*\2\2<\4\3\2\2\2=>\7+\2\2>\6\3\2\2\2"+
		"?@\7]\2\2@\b\3\2\2\2AB\7_\2\2B\n\3\2\2\2CD\7v\2\2DE\7q\2\2EF\7r\2\2F\f"+
		"\3\2\2\2GH\7?\2\2H\16\3\2\2\2IJ\7l\2\2JK\7w\2\2KL\7p\2\2LM\7i\2\2MN\7"+
		"n\2\2NO\7g\2\2O\20\3\2\2\2PQ\7o\2\2QR\7k\2\2RS\7f\2\2S\22\3\2\2\2TU\7"+
		"c\2\2UV\7f\2\2VW\7e\2\2W\24\3\2\2\2XY\7u\2\2YZ\7w\2\2Z[\7r\2\2[\26\3\2"+
		"\2\2\\]\7.\2\2]\30\3\2\2\2^_\7g\2\2_`\7p\2\2`a\7i\2\2ab\7c\2\2bc\7i\2"+
		"\2cd\7g\2\2d\32\3\2\2\2ef\7f\2\2fg\7k\2\2gh\7u\2\2hi\7g\2\2ij\7p\2\2j"+
		"k\7i\2\2kl\7c\2\2lm\7i\2\2mn\7g\2\2n\34\3\2\2\2op\7u\2\2pq\7k\2\2qr\7"+
		"g\2\2rs\7i\2\2st\7g\2\2t\36\3\2\2\2uv\7r\2\2vw\7q\2\2wx\7m\2\2xy\7g\2"+
		"\2y \3\2\2\2z{\7r\2\2{|\7k\2\2|}\7e\2\2}~\7m\2\2~\177\7q\2\2\177\u0080"+
		"\7h\2\2\u0080\u0081\7h\2\2\u0081\"\3\2\2\2\u0082\u0083\7e\2\2\u0083\u0084"+
		"\7e\2\2\u0084$\3\2\2\2\u0085\u0086\7u\2\2\u0086\u0087\7r\2\2\u0087\u0088"+
		"\7n\2\2\u0088\u0089\7k\2\2\u0089\u008a\7v\2\2\u008a\u008b\7r\2\2\u008b"+
		"\u008c\7w\2\2\u008c\u008d\7u\2\2\u008d\u008e\7j\2\2\u008e&\3\2\2\2\u008f"+
		"\u0090\7i\2\2\u0090\u0091\7n\2\2\u0091\u0092\7q\2\2\u0092\u0093\7d\2\2"+
		"\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095\u0096\7r\2\2\u0096\u0097"+
		"\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7e\2\2\u009c\u009d\7g\2\2\u009d(\3\2\2\2\u009e"+
		"\u009f\7e\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2"+
		"\u00a2\u00a3\7t\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6"+
		"\7x\2\2\u00a6\u00a7\7g\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7{\2\2\u00ad"+
		"\u00ae\7i\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1,\3\2\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7f\2"+
		"\2\u00b5\u00b6\7i\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9"+
		"\7g\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7i\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7o\2\2\u00c1\u00c2\7g\2\2\u00c2\60\3\2\2\2\u00c3\u00c5\t\2\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c8\t\3\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\62\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d0\7)\2\2\u00cd\u00cf\t\4\2\2"+
		"\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7)\2\2\u00d4"+
		"\64\3\2\2\2\u00d5\u00d7\4\62;\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00db"+
		"\7\60\2\2\u00db\u00dd\4\62;\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\66\3\2\2\2\u00de\u00df\t\5\2\2\u00df\u00e0\b\34\2\2\u00e08\3\2"+
		"\2\2\u00e1\u00e2\13\2\2\2\u00e2\u00e3\b\35\3\2\u00e3:\3\2\2\2\n\2\u00c4"+
		"\u00c7\u00c9\u00ce\u00d0\u00d8\u00dc\4\3\34\2\3\35\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}