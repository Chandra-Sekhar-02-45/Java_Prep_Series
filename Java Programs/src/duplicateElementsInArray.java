// Program to print duplicate elements in an array

import java.util.*;                                             // Import utility classes

public class duplicateElementsInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                    // Create Scanner object for input

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();                                   // Read the size of the array

        int[] arr = new int[n];                                 // Declare array of size n
        boolean[] vis = new boolean[n];                         // Boolean array to mark visited elements

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                              // Read array elements
        }

        System.out.print("Duplicate elements are: ");
        for (int i = 0; i < n; i++) {
            if (vis[i]) continue;                               // Skip if already visited

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;                                    // Count occurrences of arr[i]
                    vis[j] = true;                              // Mark as visited
                }
            }

            if (count > 1) {
                System.out.print(arr[i] + " ");                 // Print if element is a duplicate
            }
        }
    }
}

