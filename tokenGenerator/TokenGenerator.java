package tokenGenerator;

import java.io.IOException;
import java.util.Hashtable;

public class TokenGenerator {
    public Hashtable token = new Hashtable();

    public void generate() throws IOException {
        Lexer lexer = new Lexer();
        String word = "";
        do{
            word = lexer.readWord();
            if (word != ""){
                token.put(word,"Token");
                printToken(word);
                word = "";
            }

        }while (true);
    }

    public void printToken(String word){
        System.out.printf("<%s, %s>\n", word,token.get(word));
    }
}
