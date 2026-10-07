package basics;

import java.text.NumberFormat;
import java.util.Scanner;

// Mortgage Monthly Payment Calculator

/* Primitive Types
byte    → 1 byte -> 2^8 = -128 ~ +127
short   → 2 bytes
int     → 4 bytes
long    → 8 bytes
float   → 4 bytes
double  → 8 bytes
char    → 2 bytes
boolean → true / false
*/

public class MortgageCalculator {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pyo's Mortgage Calculator 😎");

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualRate = scanner.nextFloat();
        float monthlyRate = annualRate/MONTHS_IN_YEAR/PERCENT;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;
        float monthlyPayment = principal *
                (float)((monthlyRate*Math.pow(1+monthlyRate,numberOfPayments))
                        /(Math.pow(1+monthlyRate,numberOfPayments)-1));
        // Math.pow(a,b) always returns DOUBLE value !!

//        System.out.println("Principal: "+principal);
//        System.out.println("Annual Interest Rate: "+annualRate);
//        System.out.println("Period: "+period);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setMinimumFractionDigits(2);
        currency.setMaximumFractionDigits(2);
        String result = currency.format(monthlyPayment);
        System.out.printf("Mortgage: " + result);

        /*
        Principal: 100000
        AIR : 3.92
        Period: 30
        Mortgage: $472.81
        01:31:00
         */
    }
}
