package CodeWithMosh;

import java.util.Scanner;

public class FizzBuzzExercise {
    public static void main(String[] args){
    //fizz 5, buzz 3, fizzbuzz 5,3, not both same number
    Scanner scanner = new Scanner(System.in);

    System.out.print("Number: ");
    int userInput = scanner.nextInt();

    if ((userInput%3 == 0) && (userInput%5== 0)){
        System.out.println("Fizzbuzz");
    } else if (userInput%3 == 0){
        System.out.println("Buzz");
    } else if (userInput%5 == 0){
        System.out.println("Fizz");
    } else {
        System.out.println(userInput);
    }

    }
}
