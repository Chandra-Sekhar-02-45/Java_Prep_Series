// Q: Read an array of size n and sort it using Bubble Sort, also print number of passes.

package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User instructions
        System.out.println("=== Bubble Sort Program ===");

        // Taking array size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int passes = 0;  // counter for passes with swaps

        // Bubble sort algorithm
        for (int i = n - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            passes++; // one pass completed
            if (!swapped) break; // optimization: exit if no swaps occurred
        }

        // Printing results
        System.out.println("\nNumber of passes: " + passes);
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
