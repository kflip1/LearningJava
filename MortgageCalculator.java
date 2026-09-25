package CodeWithMosh;

import java.util.Scanner;

public class MortgageCalculator {

    public static int add(int x,int y){
        return x+y;
    }

    public static void main(String[] args){
        System.out.println("Pyo's Mortgage Calculator 😎");
        System.out.print("What's your balance?");
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();

        System.out.println("Your balance is "+balance);
    }
}
