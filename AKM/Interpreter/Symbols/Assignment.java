package AKM.Interpreter.Symbols;

import AKM.Interpreter.Lexer.Token;

public class Assignment extends Operator {
    private int key;

    public Assignment(Token prev, Token next, Token current, int key){
        super(prev,next,current);
        this.key = key;
    }
}
