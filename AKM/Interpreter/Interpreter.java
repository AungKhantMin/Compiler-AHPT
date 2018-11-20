package AKM.Interpreter;

public class Interpreter {
    public static void main(String args[]){
        Lexer lexer = new Lexer();
        lexer.analyze();
        lexer.printToken();
    }
}
