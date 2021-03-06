package lolcomps;


import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class ErrorListener implements ANTLRErrorListener {

    SaidaParser sp;
	
	public ErrorListener(SaidaParser sp) {
		this.sp = sp;
	}

	@Override
	public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
		Token token = (Token) o;
		String texto = token.getText();
		if(texto.equals("<EOF>")) texto = "EOF";
		if (!sp.isModificado()) {
			sp.println("Linha " + i + ": erro sintatico proximo a " + texto);
		}
	}

	@Override
	public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
	}

	@Override
	public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
	}

	@Override
	public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
}
}