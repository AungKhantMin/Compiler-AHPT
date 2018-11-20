package AKM.Interpreter.Lexer;

import java.util.Hashtable;

public class Lexer {
    private ReadLine readLine;
    private String lexeme;
    private Hashtable<String, String> tokenTable;
    private Hashtable<String, String> keyWords;

    public Lexer(){
        keyWords = new Hashtable<>();
        tokenTable = new Hashtable<>();
        readLine = new ReadLine();
        keyWords.put("int","Type Specifier");
        keyWords.put("float", "Type Specifier");
        keyWords.put("double", "Type Specifier");
        keyWords.put("if", "Key Word");
        keyWords.put("else", "Key Word");
        keyWords.put("do", "Key Word");
        keyWords.put("while", "Key Word");
        keyWords.put("switch", "Key Word");
        keyWords.put("=", "Assignment Expression");
        keyWords.put("+=", "Assignment Expression");
        keyWords.put("-=", "Assignment Expression");
        keyWords.put("*=", "Assignment Expression");
        keyWords.put("/=", "Assignment Expression");
        keyWords.put("%=", "Assignment Expression");
        keyWords.put("==", "Binary Operator");
        keyWords.put("+", "Binary Operator");
        keyWords.put("*", "Binary Operator");
    }

    public void analyze(){
        char ch;
        boolean digit = false;
        String token = "";
        lexeme = readLine.read();
        for (int i = 0; i < lexeme.length(); i++) {
            ch = lexeme.charAt(i);
            switch (ch){
                case '{':
                    // Start Block
                    break;
                case '!':
                    // Look Ahead !=
                    break;
                case '=':
                    if (lexeme.charAt(i+1) == '='){
                        token = "==";
                    }
                    else token = "=";
                    break;
                case '<':
                    // Look ahead <=
                    break;
                case '>':
                    // Look ahead >=
                    break;
                case '|':
                    // Look ahead ||
                    break;
                case '&':
                    // Look ahead &&
                    break;
                case '+':
                    // Look ahead +=
                    break;
                case '-':
                    // Look ahead -=
                    break;
                case '/':
                    // Look ahead /=
                    break;
                case '%':
                    // Look ahead %=
                    break;
                case '*':
                    // Look ahead *=
                    break;
                default:
                    break;
            }
            while (Character.isLetter(ch)) {
                token += Character.toString(ch);
                if (i < lexeme.length()-1){
                    i++;
                }
                else {
                    break;
                }
                ch = lexeme.charAt(i);
            }

            while (Character.isDigit(ch) || ch == '.'){
                token += Character.toString(ch);
                if (i < lexeme.length()-1){
                    i++;
                }
                else {
                    digit = true;
                    break;
                }
                ch = lexeme.charAt(i);

            }

            if (digit){
                tokenTable.put(token, "Value");
                token = "";
                continue;
            }

            if (keyWords.get(token) != null){
                tokenTable.put(token,keyWords.get(token));
            }
            else if(token == "\n" || token == " " || token == ""){
                // do nothing
            }
            else {
                tokenTable.put(token,"Identifier");
            }
            token = "";

        }
    }

    public void printToken(){
        System.out.printf("%s",tokenTable.toString());
    }
}
