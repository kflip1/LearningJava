package basics;

import java.util.Scanner;

public class MortgageCal2  {
    public static void main(String[] args){
        // Mortgage Calculator
        String principalError = "Error: Enter a number between 1,000 and 1,000,000.";
        String rateError = "Error: Enter a value greater than 0 and less than or equal to 30";
        String yearError = "Error: Enter a value between 1 and 30";

        int userPrincipal;//4 bytes
        float userAnnualRate; //4 bytes
        float userMonthlyRate;
        byte userYear; //1 byte
        double mortgage;//4 bytes

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal ($1k - $1M): ");
        while (true) {
            userPrincipal = scanner.nextInt();
            if (userPrincipal < 1000 || userPrincipal > 1_000_000){
                System.out.println(principalError);
                System.out.print("Principal ($1k - $1M): ");
            } else
                break;
        }

        System.out.print("Annual Interest Rate: ");
        while (true){
            userAnnualRate =scanner.nextFloat();
            if (userAnnualRate <= 0 || userAnnualRate > 30){
                System.out.println(rateError);
                System.out.print("Annual Interest Rate: ");
            } else {
                userMonthlyRate = userAnnualRate / 100 / 12;
                break;
            }
        }

        System.out.print("Period (Years): ");
        while (true){
            userYear = scanner.nextByte();
            if (userYear <= 0 || userYear > 30){
                System.out.println(yearError);
                System.out.println("Period (Years): ");
            } else {
                break;
            }
        }

        System.out.println("\n");
        mortgage = userPrincipal
                * ((userMonthlyRate*(Math.pow(1+userMonthlyRate,userYear*12)))
                /(Math.pow(1+userMonthlyRate,userYear*12)-1));
        //Math.pow() returns double
        // double -> 8 bytes

        System.out.println("-------------------------------------------");
        System.out.println("User's Mortgage Report 🧮\n");
        System.out.println("Principal: " + userPrincipal);
        System.out.println("Rate: " + userAnnualRate);
        System.out.println("Year: " + userYear);
        System.out.printf("Mortgage: " + "$%,.2f%n", mortgage);

    }
}
