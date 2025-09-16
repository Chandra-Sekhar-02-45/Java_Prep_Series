// Question: Implement recursive binary search to find the index of a given key in a sorted array.
// Return -1 if the key is not found.
//
// Constraints:
// 1 <= n <= 10^5
// -10^9 <= arr[i], key <= 10^9
// Array must be sorted in non-decreasing order.

package SearchingAlgorithms.BinarySearch;

import java.util.Scanner;

public class BinarySearchRecursive {

    // Recursive function to perform binary search
    public static int binarySearch(int[] arr, int low , int high , int key) {
        if (low > high) return -1; // base case: key not found

        int mid = low + (high - low) / 2; // prevent overflow

        if (arr[mid] == key) {
            return mid; // key found
        } else if (arr[mid] < key) {
            return binarySearch(arr, mid + 1 , high , key); // search right half
        } else {
            return binarySearch(arr, low , mid - 1, key); // search left half
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for size of array
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Asking user for sorted array elements
        System.out.println("Enter sorted array elements: ");
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        // Asking user for key to search
        System.out.println("Enter key to search: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1;

        // Performing binary search
        int idx = binarySearch(arr, low , high , key);

        // Printing result
        if (idx == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + idx);
        }

        sc.close();
    }
}

/*
Time Complexity: O(log n)
    - Each recursive call halves the search space.
Space Complexity: O(log n)
    - Due to recursive stack frames.
Optimization:
    - Iterative version reduces space complexity to O(1).
*/
