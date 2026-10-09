package basics;

import java.util.Locale;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = "";
        // While loop is used when you don't know when the program will be terminated
        // such as the program termination depends on users' input

        // The system keeps receiving inputs until the input is "quit"
        while (!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            //toLowerCase() method prevents "Quit" from being ignored
            //toLowerCase(): String method. returns a NEW lowercase String
            System.out.println(input);
        }
    }
}
