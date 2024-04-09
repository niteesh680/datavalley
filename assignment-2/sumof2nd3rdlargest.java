import java.util.Arrays;

public class SecondThirdLargestSum {

    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        Arrays.sort(values);
        int n = values.length;
        if(n<2){
            System.out.println("enter more than 2");
        }
        else{
            int secondLargest = values[n - 2];
            int thirdLargest = values[n - 3];
            int sum = secondLargest + thirdLargest;
            System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
        }
    }
}