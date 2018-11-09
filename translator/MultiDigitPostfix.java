package translator;

import java.io.*;

public class MultiDigitPostfix {
    public static void main(String args[]) throws IOException{
        MultiDigitParser multiDigitParser = new MultiDigitParser();
        multiDigitParser.expression();

    }
}

class MultiDigitParser{
    static String digit = "";
    static int singledigit ;
    final static char[] operator = {'+', '-', '*', '/', '%', '\n', ' '};

    public MultiDigitParser() {

    }

    void expression() throws IOException{
        readDigit();
        while (true){
            if ((char)singledigit == '+'){
                readDigit();
                System.out.print('+');
            }
            else if ((char)singledigit == '-'){
                readDigit();
                System.out.print('-');
            }
            else if ((char)singledigit == '*'){
                readDigit();
                System.out.print('*');
            }
            else if ((char)singledigit == '/'){
                readDigit();
                System.out.print('/');
            }
            else if ((char)singledigit == '%'){
                readDigit();
                System.out.print('%');
            }
            else return;
        }
    }

    private void readDigit() throws IOException{
        singledigit = System.in.read();
        while(singledigit == ' '){
            singledigit = System.in.read();
        }
        if (Character.isDigit((char)singledigit)) {
            while (Character.isDigit((char)singledigit)) {
                digit += (char) singledigit;
                singledigit = System.in.read();
            }
            System.out.print(digit);
            while (singledigit == ' '){
                singledigit = System.in.read();
            }
            digit = "";
        }
        else {
            if (checkOperator(singledigit)){
            }
            else {
                throw  new Error("Syntax Error");
            }
        }
    }

    private boolean checkOperator(int opr) throws IOException{
        for (int checkOpr:operator) {
            if (opr == checkOpr){
                return true;
            }
        }
        return false;
    }
}