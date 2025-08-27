// Question: Implement Insertion Sort
// In Insertion Sort, iteratively inserting each element of an unsorted list
// into its correct position in a sorted portion of the list.
// It is like sorting playing cards in your hands.


package SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {

    // Function to perform Insertion Sort
    public int[] insertionSort(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int j = i;
            // Shift elements until the correct position is found
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    // Main function to take user input and print sorted array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertionSort sort = new InsertionSort();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort.insertionSort(n, arr);

        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

/*
Time Complexity:
- Best Case (Already Sorted): O(n)
- Worst Case (Reverse Sorted): O(n^2)
- Average Case: O(n^2)

Space Complexity:
- O(1) → In-place sorting, no extra space required.
*/