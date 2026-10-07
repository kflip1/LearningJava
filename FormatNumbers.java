package basics;

import java.text.NumberFormat;

public class FormatNumbers {
    public static void main(String[] args){

        String result = NumberFormat.getPercentInstance().format(0.2);;
        System.out.println(result);
    }
}
