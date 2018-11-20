package AKM.Interpreter.Symbols;

import java.util.Hashtable;

public class KeyWordsTable {
    private Hashtable keywords = new Hashtable();
    private SymbolCode code = new SymbolCode();

    public KeyWordsTable(){
        keywords.put(code.AND, "&&");
        keywords.put(code.EQ, "=");
        keywords.put(code.EQEQ, "==");
        keywords.put(code.IF, "if");
        keywords.put(code.ELSE, "else");
        keywords.put(code.DO, "do");
        keywords.put(code.WHILE, "while");
        keywords.put(code.GT, ">");
        keywords.put(code.GTE, ">=");
        keywords.put(code.LT, "<");
        keywords.put(code.LTE, "<=");
        keywords.put(code.FOR, "for");
        keywords.put(code.OR, "||");
        keywords.put(code.NE, "!=");
        keywords.put(code.PEQ, "+=");
        keywords.put(code.PLPL, "++");
        keywords.put(code.MIEQ, "-=");
        keywords.put(code.MIMI, "--");
        keywords.put(code.MUEQ, "*=");
        keywords.put(code.DEQ, "/=");
        keywords.put(code.MOEQ, "%=");
        keywords.put(code.PLUS, "+");
        keywords.put(code.MINUS, "-");
        keywords.put(code.MULTI, "*");
        keywords.put(code.MOD, "%");
        keywords.put(code.DIV, "/");
        keywords.put(code.SB, "{");
        keywords.put(code.EB, "}");
    }

    public Object getKey(int key){
        return keywords.get(key);
    }
}

