package basics;

import java.util.Locale;
import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            // This IF code prevents the input, quit, not to be printed in the terminal
            // when users type "quit"
//            if (!input.equals("quit"))
//                System.out.println(input);
            if(input.equals("pass"))
                continue; // "continue" brings control to the beginning of the loop, "continue" can only be used inside loops: for, while, and do-while
            if(input.equals("quit")){
                break; // "break" terminates the loop
            }
            System.out.println(input);
        }
    }
}
