package Interpreter;

import java.util.Scanner;

public class ReadLine {
    private String line = "";
    private Scanner scanner;

    public  ReadLine(){
        scanner = new Scanner(System.in);
    }

    public String read(){
        System.out.print(">>>> ");
        line = scanner.nextLine();
        return line;
    }
}
