package AKM.tokenGenerator;

public class Token {
    public final int tag;
    public Token(int t){
        tag = t;
    }
    @Override
    public String toString(){
        return "" + (char)tag;
    }
}
