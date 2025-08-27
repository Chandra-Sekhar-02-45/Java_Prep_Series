// Question: Implement Selection Sort and print the index which gets swapped at each step.
package SortingAlgorithms;

import java.io.*;
import java.util.*;

public class SelectionSort_SwapIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            System.out.print("Enter the elements of the array: ");
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Swaped Indexes are : ");

            // We loop from the end of the array backwards. In each step, we place the largest
            // element of the unsorted part at the correct position at the end.
            for(int i = n - 1; i > 0; i--) {
                // Find the index of the maximum element in the unsorted prefix.
                int max_idx = 0;
                for(int j = 1; j <= i; j++) {
                    if(arr[j] > arr[max_idx]) {
                        max_idx = j;
                    }
                }

                // Swap the max element with the element at the end of the unsorted section.
                int temp = arr[max_idx];
                arr[max_idx] = arr[i];
                arr[i] = temp;

                // Print the original index of the max element that was swapped.
                System.out.print(max_idx + " ");
            }

            System.out.println();
        sc.close();
    }
}