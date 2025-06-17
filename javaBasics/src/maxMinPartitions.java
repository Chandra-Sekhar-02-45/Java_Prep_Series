// Program to find the minimum absolute difference between adjacent elements in a sorted array

import java.util.*;

public class maxMinPartitions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                     // Create Scanner object for input

        int n = sc.nextInt();                                     // Read the size of the array
        int[] arr = new int[n];                                   // Declare array of size n
        int min_diff = Integer.MAX_VALUE;                         // Initialize minimum difference to max possible value

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                                // Read array elements
        }

        Arrays.sort(arr);                                         // Sort the array in ascending order

        for (int i = 1; i < n; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);             // Calculate absolute difference between adjacent elements
            min_diff = Math.min(diff, min_diff);                  // Update minimum difference if current diff is smaller
        }

        System.out.println(min_diff);                             // Print the minimum adjacent difference
    }
}
