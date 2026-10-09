package basics;

public class ForEach {
    public static void main(String[] args){
        String[] fruits = {"Apple", "Mango", "Orange"};

        for(int i=0; i< fruits.length; i++){
            System.out.println("i: " + i + "  ------->  " + fruits[i]);
        }

        int j=0;
        for (String fruit : fruits){// Take the elements of "fruits" one by one, from the first to the last, and store each one in "fruit"

            System.out.println(j);
            System.out.println(fruit);
            j++;
        }

        /* For Each Loop Limits:
            - it only moves forward; can't go backwards
            - No access to the index, but you can manually track down the index through declaring a variable and adding update statements.
            - You can't modify the elements in the array through the loop variable

            For-Each loop iterates once per element in the array.
            For fruits with 3 elements, it runs 3 times.
        */
    }
}
