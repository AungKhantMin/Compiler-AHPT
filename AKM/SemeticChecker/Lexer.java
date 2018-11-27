package AKM.SemeticChecker;

import java.io.IOException;
import java.util.Hashtable;

public class Lexer {
    private Token lexeme;
    private Hashtable reserveWord;

    public Lexer(){
        reserve(new Token("int",TokenCode.INT));
        reserve(new Token("float", TokenCode.REAL));
        reserve(new Token("string", TokenCode.STRING));
        reserve(new Token("for",TokenCode.FOR));
        reserve(new Token("while", TokenCode.WHILE));
        reserve(new Token("do", TokenCode.DO));
        reserve(new Token("if", TokenCode.IF));
    }

    public char readch() throws IOException{
        return (char)System.in.read();
    }

    public Token analyze() throws IOException{
        char ch = ' ';
        String lexemer = "";
        for (;; ch = readch()){
            if (Character.isLetter(ch)){
                while (Character.isLetter(ch)){
                    lexemer += Character.toString(ch);
                }
                return classify(lexemer);
            }
            else if (Character.isDigit(ch)){
                int v = 0;
                while (Character.isDigit(ch)){
                    v = v * 10 + Character.digit(ch,10);
                    ch = readch();
                }
                if (ch == '.'){
                    ch = readch();
                    float x = v;
                    float d = 10;
                    while (Character.isDigit(ch)){
                        x = x + Character.digit(ch, 10)/ d;
                        d *=10;
                    }
                    return classify(x);
                }
                return classify(v);
            }
            else if ( ch == '"'){
                do{
                    lexemer += Character.toString(ch);
                    ch = readch();
                    if (ch == '\n'){
                        break;
                    }
                }while (ch != '"');
                //return classify()
            }

        }
    }


    public Token classify(String lexeme){
        if (reserveWord.get(lexeme) == null){
            return new Token(lexeme, TokenCode.ID);
        }
        else return (Token)reserveWord.get(lexeme);
    }

    public Token classify(float lexeme){
        return new Token(,TokenCode.VALUE);
    }

    public Token classify(int lexeme){

    }


    public void reserve(Token token){
        reserveWord.put(token.lexeme, token.tag);
    }

}
