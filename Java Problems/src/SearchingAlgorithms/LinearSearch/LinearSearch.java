// Question: Implement Linear Search to find the index of a given key in an array.
// If the key is not present, return -1.
//
// Constraints:
// 1 <= n <= 10^5
// -10^9 <= arr[i], key <= 10^9

package SearchingAlgorithms.LinearSearch;

import java.util.Scanner;

public class LinearSearch {

    // Function to perform linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // key found at index i
            }
        }
        return -1; // key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for size of array
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Asking user for array elements
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Asking user for key to search
        System.out.println("Enter key to search: ");
        int key = sc.nextInt();

        // Performing linear search
        int idx = linearSearch(arr, key);

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
Time Complexity: O(n)
    - In the worst case, all elements are checked.
Space Complexity: O(1)
    - Only constant extra space used.
Optimization:
    - Binary Search (O(log n)) is better if the array is sorted.
    - Hashing can reduce average search time to O(1).
*/
