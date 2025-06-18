// Program to calculate and print the ratio of positive, negative, and zero elements in an array

import java.util.*;                                                   // Import utility package for Scanner

public class negPosZerRatio {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);                          // Create Scanner object for input

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();                                         // Read the size of the array

        int[] arr = new int[n];                                       // Declare an array of size n
        double posCount = 0, negCount = 0, zeroCount = 0;             // Counters for positives, negatives, and zeros
        double posRatio = 0, negRatio = 0, zeroRatio = 0;             // Ratios for each category

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                                    // Read each array element

            if (arr[i] > 0) {
                posCount++;                                           // Increment positive counter
            } else if (arr[i] == 0) {
                zeroCount++;                                          // Increment zero counter
            } else {
                negCount++;                                           // Increment negative counter
            }
        }

        posRatio = posCount / n;                                      // Calculate positive ratio
        negRatio = negCount / n;                                      // Calculate negative ratio
        zeroRatio = zeroCount / n;                                    // Calculate zero ratio

        System.out.printf("Positive Ratio: %.6f\n", posRatio);        // Print ratio of positive numbers
        System.out.printf("Negative Ratio: %.6f\n", negRatio);        // Print ratio of negative numbers
        System.out.printf("Zero Ratio    : %.6f\n", zeroRatio);       // Print ratio of zero elements
    }
}
