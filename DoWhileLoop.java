package basics;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = "";

        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
        /* Do while Mechanism:
        1. do { } is executed once at the beginning regardless of the condition in while
        2. Check the condition in while ( Condition )
        3. If TRUE then go to step 1 again, otherwise(FALSE) the loop ends
        - Check the condition(!input.equals("quit")) last unlike While Loop that checks the condition first
        - Do While Loop is rarely used
         */
    }
}
