package lolcomps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class LolComps {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        boolean sint=false;
        SaidaParser out = new SaidaParser();
        FileWriter teste;
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        compsLexer lexer = new compsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        compsParser parser = new compsParser(tokens);
        ErrorListener erros = new ErrorListener(out);
        SaidaParser script = new SaidaParser();
        parser.removeErrorListeners();
        parser.addErrorListener(erros);
        try {
            compsParser.ProgramaContext arvore = parser.programa();
            if (out.modificado) {
                throw new ParseCancellationException();
            }
            Semantico sem = new Semantico(out);
            sem.visitPrograma(arvore);
            if (out.modificado) {
                sint=true;
                throw new ParseCancellationException();
            }
            GeracaoCodigo gerador = new GeracaoCodigo();
            script = (SaidaParser) gerador.visitPrograma(arvore);

        } catch (ParseCancellationException pce) {
            if (pce.getMessage() != null) {
                out.println(pce.getMessage());
            }
        }
        if (!sint && out.modificado) {
            FileWriter saida;
            String result = args[0].substring(args[0].lastIndexOf("\\")+1,args[0].length());
            saida = new FileWriter(new File("ERROSINTATICO_"+result));
            saida.write("Arquivo de erro:"+args[0]);
            saida.write("\n");
            saida.write(out.toString());
            saida.write("\nFim da compilação.");
            saida.close();
        } else if(out.modificado) {
            FileWriter saida;
            String result = args[0].substring(args[0].lastIndexOf("\\")+1,args[0].length());
            saida = new FileWriter(new File("ERROSEMANTICO_"+result));
            saida.write("Arquivo de erro:"+args[0]);
            saida.write("\n");
            saida.write(out.toString());
            saida.write("\nFim da compilação.");
            saida.close();
        }
        if(!out.modificado) {
            FileWriter arquivo;
            arquivo = new FileWriter(new File("script.py"));
            arquivo.write(script.toString());
            arquivo.close();
        }
    }
}
