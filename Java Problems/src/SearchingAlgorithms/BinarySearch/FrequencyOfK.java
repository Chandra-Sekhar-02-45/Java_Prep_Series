// Question: Given a sorted array and multiple queries,
// find the frequency of a number k in the array using binary search.
//
// Constraints:
// 1 <= n, Q <= 10^5
// -10^9 <= arr[i], k <= 10^9
// Array is sorted in non-decreasing order.

package SearchingAlgorithms.BinarySearch;

import java.util.*;

public class FrequencyOfK {

    // Function to find the first occurrence of q
    public static int firstOccurrence(int[] arr, int low, int high, int q) {
        int pos = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == q) {
                pos = mid;
                high = mid - 1; // keep searching left
            } else if (arr[mid] > q) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return pos;
    }

    // Function to find the last occurrence of q
    public static int lastOccurrence(int[] arr, int low, int high, int q) {
        int pos = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == q) {
                pos = mid;
                low = mid + 1; // keep searching right
            } else if (arr[mid] < q) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return pos;
    }

    // Function to count frequency of q in arr
    public static int frequencyOfK(int[] arr, int q) {
        int n = arr.length;
        int first = firstOccurrence(arr, 0, n - 1, q);
        if (first == -1) return 0; // element not found
        int last = lastOccurrence(arr, 0, n - 1, q);
        return last - first + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for size of array
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Asking user for sorted array elements
        System.out.println("Enter sorted array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Asking user for number of queries
        System.out.println("Enter number of queries: ");
        int Q = sc.nextInt();

        // Processing queries
        while (Q-- > 0) {
            System.out.println("Enter element to find frequency: ");
            int q = sc.nextInt();
            int freq = frequencyOfK(arr, q);
            System.out.println("Frequency of " + q + " = " + freq);
        }

        sc.close();
    }
}

/*
Time Complexity:
    - Each query: O(log n) (binary search for first + last occurrence).
    - For Q queries: O(Q log n).
Space Complexity: O(1)
    - Only a few variables used.

Optimization:
    - Already optimal for static sorted arrays.
    - If many queries are asked repeatedly, use a HashMap to preprocess counts in O(n).
*/
