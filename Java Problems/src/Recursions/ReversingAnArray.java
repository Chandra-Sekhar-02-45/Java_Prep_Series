package Recursions;

import java.util.Scanner;

public class ReversingAnArray {

    // Function to swap two elements in the array at indices i and j
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Recursive function to reverse the array in-place.
     *
     * @param arr the input array
     * @param i   the current index from the left side
     * @param n   the total length of the array
     * @return    the same array, but reversed
     */
    public int[] reverse(int[] arr, int i, int n) {
        // Base case: stop when we reach the middle
        if (i >= n / 2)
            return arr;

        // Swap elements at symmetric positions: i (from left) and (n - i - 1) (from right)
        swap(arr, i, n - i - 1);

        // Recursive call for the next pair
        return reverse(arr, i + 1, n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking input size of array
        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        // Taking input elements of array
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        ReversingAnArray obj = new ReversingAnArray();

        // Reverse array using recursion (no extra memory needed,
        // since Java passes array by reference)
        int[] reversed = obj.reverse(arr, 0, n);

        // Printing reversed array
        System.out.println("Reversed array: ");
        // In  for-each, 'i' represents the element itself, not the index
        for (int i : reversed) {
            System.out.print(i + " ");
        }
    }
}
