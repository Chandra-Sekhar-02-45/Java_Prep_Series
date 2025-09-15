// Question: Implement iterative binary search to find the index of a given key in a sorted array.
// Return -1 if the key is not found.
//
// Constraints:
// 1 <= n <= 10^5
// -10^9 <= arr[i], key <= 10^9
// Array must be sorted in non-decreasing order.

package SearchingAlgorithms.BinarySearch;

import java.util.Scanner;

public class BinarySearchIterative {

    // Function to perform iterative binary search
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // prevents overflow

            if (arr[mid] == key) {
                return mid; // key found
            } else if (arr[mid] < key) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for size of the array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Asking user to input sorted array elements
        System.out.println("Enter sorted array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Asking user for key to search
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        // Performing binary search
        int idx = binarySearch(arr, key);

        // Printing result
        if (idx != -1) {
            System.out.println("Key found at index: " + idx);
        } else {
            System.out.println("Key not found in array.");
        }

        sc.close();
    }
}

/*
Time Complexity: O(log n)
    - Each iteration halves the search space.
Space Complexity: O(1)
    - Only a few variables used.

Optimization:
    - Already optimal for searching in a sorted array.
    - Recursive version possible but less memory-efficient (O(log n) stack space).
*/
