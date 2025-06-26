// Program to find the minimum and maximum sum of 4 out of 5 integers

import java.util.*;                                                  // Import utility package for Scanner

public class minMaxSum {
    public static void main(String[] srgs) {

        Scanner sc = new Scanner(System.in);                         // Create Scanner object for input

        long total = 0;                                              // Variable to store total sum of all 5 numbers
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE, sum = 0;    // Initialize min & max sum limits

        int[] arr = new int[5];                                      // Declare array to store 5 integers

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();                                   // Read each integer
            total += arr[i];                                         // Add to total sum
        }

        for (int i = 0; i < arr.length; i++) {
            sum = total - arr[i];                                    // Calculate sum by excluding one element
            if (sum > max) max = sum;                                // Update max if sum is greater
            if (sum < min) min = sum;                                // Update min if sum is smaller
        }

        System.out.println("Minimum Sum (4 numbers): " + min);       // Print minimum sum
        System.out.println("Maximum Sum (4 numbers): " + max);       // Print maximum sum
    }
}
