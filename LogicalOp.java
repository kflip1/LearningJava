package CodeWithMosh;

public class LogicalOp {
    public static void main(String[] args){
//        int temperature =12;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = true;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);

    }
}
