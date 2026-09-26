package CodeWithMosh;

import java.text.NumberFormat;
import java.util.Scanner;

// Monthly Paymen
/*
byte    → 1 byte
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
        System.out.println("Pyo's Mortgage Calculator 😎");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualRate = scanner.nextFloat()/1200;
        System.out.print("Period (Years): ");
        int period = scanner.nextInt() * 12;
        float monthlyPayment = principal * (float)((annualRate*Math.pow(1+annualRate,period))/(Math.pow(1+annualRate,period)-1));
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
