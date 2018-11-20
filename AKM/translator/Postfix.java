package AKM.translator;
import java.io.*;

class Parser{
    static int look_ahead;

    public Parser() throws IOException{
        look_ahead = System.in.read();
    }

    void expr() throws IOException{
        term();
        while(true){
            if(look_ahead == '+'){
                match('+');
                term();
                System.out.write('+');
            }
            else if (look_ahead == '-'){
                match('-');
                term();
                System.out.write('-');
            }
            else return;
        }
    }

    void term() throws IOException{
        if(Character.isDigit((char)look_ahead )){
            System.out.write((char)look_ahead );
            match(look_ahead);
        }
        else throw new Error("syntax error");
    }

    void match(int t) throws IOException{
        if(t == look_ahead){
            look_ahead = System.in.read();
        }
        else throw new Error("syntax error");
    }
}

public class Postfix{
    public static void main(String args[]) throws IOException{
        Parser parser = new Parser();
        parser.expr();
        System.out.write('\n');
    }
}
