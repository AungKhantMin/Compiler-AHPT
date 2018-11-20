package AKM.Interpreter.Symbols;

import AKM.Interpreter.Lexer.Token;

public class Operator extends Token {
    public Operator(Token prev, Token next, Token current){
        super(prev,next,current);
    }
}
