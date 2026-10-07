package basics;

public class SimplifyingIf {
    public static void main(String[] args){
//        Original Code
//        int income = 120_000;
//        boolean hasHighIncome = false;
//        if (income > 100_000){
//            hasHighIncome = true;
//        } else {
//            hasHighIncome = false;
//        }
//        System.out.println(hasHighIncome);

//      Simplified Code
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
    }
}
