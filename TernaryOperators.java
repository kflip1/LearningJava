package basics;

public class TernaryOperators {
    public static void main(String[] args){
        int income = 120_000;
        // condition ? True : False
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
    }
}
