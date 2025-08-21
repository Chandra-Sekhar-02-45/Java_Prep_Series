package ArraysProblems;
import java.util.*;
public class findingLengthManually {
    public static void main(String[] args) {
        int[] arr = { 1, 2 , 3 , 4 , 5 , 6 };

        // Approach - 1
        int n = arr.length;   // Built-in property
        System.out.println("Using Built-in Proprty :" + n);  // Output: 6

        // Approach - 2
        int count = 0;
        try {
            while (true) {
                int temp = arr[count]; // Access array until exception
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Using Try , Catch : " + count);
        }

        // Approach - 3
        long length = Arrays.stream(arr).count();
        System.out.println("Using Stream :" + length); // Output: 6


    }
}
