// Question: Given a sorted array of distinct integers and a target value,
// return the index if the target is found. If not, return the index
// where it would be inserted in order.
// (This is the "Search Insert Position" problem.)
//
// Constraints:
// 1 <= n <= 10^4
// -10^9 <= arr[i], target <= 10^9
// Array is sorted in strictly increasing order.

package SearchingAlgorithms.BinarySearch;

import java.util.Scanner;

public class InsertPosition {

    // Iterative Binary Search to find target or insertion position
    public int binarySearch(int[] arr, int low, int high, int k) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return mid; // target found
            } else if (arr[mid] > k) {
                high = mid - 1; // search in left half
            } else {
                low = mid + 1; // search in right half
            }
        }
        // At this point, 'low' is the correct insertion position
        return low;
    }

    // Wrapper function
    public int searchInsert(int[] arr, int k) {
        int n = arr.length;
        return binarySearch(arr, 0, n - 1, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertPosition obj = new InsertPosition();

        // Asking user for size of array
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Asking user for sorted array elements
        System.out.println("Enter sorted array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Asking user for target element
        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        // Getting search or insert position
        int pos = obj.searchInsert(arr, target);

        // Printing result
        System.out.println("Target should be at index: " + pos);

        sc.close();
    }
}

/*
Time Complexity: O(log n)
    - Binary search halves the search space each iteration.
Space Complexity: O(1)
    - Constant extra space used.
Optimization:
    - Already optimal for this problem.
*/
