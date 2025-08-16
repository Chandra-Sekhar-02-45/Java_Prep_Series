// Program to implement Selection Sort

package SortingAlgorithms;
import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User guidance
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " integers (array elements):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort Algorithm
        for (int i = 0; i < n; i++) {
            int mini = i;   // Assume current index is minimum

            // Find index of minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }

            // Swap current element with minimum element
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Time Complexity:
    Best Case: O(n^2)   // Still compares all elements
    Average Case: O(n^2)
    Worst Case: O(n^2)

Space Complexity:
    O(1)   // In-place sorting, uses only constant extra space
*/
