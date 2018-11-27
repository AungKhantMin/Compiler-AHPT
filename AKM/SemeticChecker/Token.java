package AKM.SemeticChecker;

public class Token {
    public String lexeme;
    public int tag;

    public Token(String lexeme,int tag){
        this.lexeme = lexeme;
        this.tag = tag;
    }
}
