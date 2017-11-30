package lolcomps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author Bruno
 */
public class LolComps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        SaidaParser out = new SaidaParser();
        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("D:\\grammarcamp.txt"));
            compsLexer lexer = new compsLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            compsParser parser = new compsParser(tokens);
            ErrorListener erros = new ErrorListener(out);

            //lexer.removeErrorListeners();
            parser.removeErrorListeners();
            parser.addErrorListener(erros);
            parser.programa();
        } catch (ParseCancellationException pce) {
            if (pce.getMessage() != null) {
                out.println(pce.getMessage());
            }
        }
        //FileWriter fw = new FileWriter(args[1]);
        //fw.write(out + "Fim da compilacao\n");
        //fw.flush();
        //fw.close();
        System.out.println(out + "Fim da compilacao");
    }
}
