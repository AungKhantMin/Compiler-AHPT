package AKM.tokenGenerator;

import java.io.*;
import java.util.*;

public class Lexer  {
    public static int line = 1;
    char peek = ' ';
    Hashtable words = new Hashtable();

    void reserve( Word w){
        words.put(w.lexeme, w);
    }

    public Lexer(){
        reserve(new Word(Tag.IF, "if"));
        reserve(new Word(Tag.ELSE, "else"));
        reserve(new Word(Tag.WHILE, "while"));
        reserve(new Word(Tag.DO, "do"));
        reserve(new Word(Tag.BREAK, "break"));
    }

    public String readWord() throws IOException{
        String word = "";
        char ch;
        do {
            ch = readch();
            if (ch != ' ' && ch != '\n' && ch != '\t') {
                word += Character.toString(ch);
            }
        }while (Character.isLetterOrDigit(ch));
        return word;
    }

    public char readch() throws IOException{
        char ch = (char)System.in.read();
        return ch;
    }

}
