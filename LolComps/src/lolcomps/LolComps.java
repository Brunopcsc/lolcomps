package lolcomps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class LolComps {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        SaidaParser out = new SaidaParser();
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("D:\\grammarcamp.txt"));
        compsLexer lexer = new compsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        compsParser parser = new compsParser(tokens);
        ErrorListener erros = new ErrorListener(out);
        
        parser.removeErrorListeners();
        parser.addErrorListener(erros);
        try{
            compsParser.ProgramaContext arvore = parser.programa();
            if (out.modificado) {
                throw new ParseCancellationException();
            }
            Semantico sem = new Semantico(out);
            sem.visitPrograma(arvore);
            if(out.modificado)
                throw new ParseCancellationException();
            
        } catch (ParseCancellationException pce) {
            if (pce.getMessage() != null) {
                out.println(pce.getMessage());
            }
        }
        System.out.println(out + "Fim da compilacao");
    }
}
