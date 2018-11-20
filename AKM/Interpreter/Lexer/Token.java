package AKM.Interpreter.Lexer;

public class Token {
    private Token prev;
    private Token next;
    private Token current;
    public Token(Token pre, Token nex, Token token){
        prev = pre;
        current = token;
        next = nex;
    }

    public Token getNext() {
        return next;
    }

    public Token getPrev() {
        return prev;
    }

    public Token getCurrent() {
        return current;
    }
}
