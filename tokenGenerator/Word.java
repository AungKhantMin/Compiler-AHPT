package tokenGenerator;

public class Word extends Token {
    public String lexeme = "";
    public Word(int tag, String l){
        super(tag);
        lexeme = l;
    }

    @Override
    public String toString() {
        return "" + lexeme;
    }

    public static final Word
            and = new Word(Tag.AND, "&&"), or = new Word(Tag.OR, "||"),
            equal = new Word(Tag.EQ, "=="), ne = new Word(Tag.NE, "!="),
            le = new Word(Tag.LE, "<="), ge = new Word(Tag.GE, ">="),

            minus = new Word(Tag.MINUS, "minus"),
            tr = new Word(Tag.TRUE,  "true"),
            fe = new Word(Tag.FALSE, "false"),
            temp = new Word(Tag.TEMP, "temp");

}
