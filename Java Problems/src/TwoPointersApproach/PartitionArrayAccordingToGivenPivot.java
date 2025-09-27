// Question: Given an array and a pivot value, rearrange the array such that:
// 1. All elements less than the pivot appear first.
// 2. All elements equal to the pivot appear in the middle.
// 3. All elements greater than the pivot appear at the end.
// Leet_Code 2161
// Constraints:
// 1 <= arr.length <= 10^5
// -10^9 <= arr[i], pivot <= 10^9

package TwoPointersApproach;

import java.util.Scanner;
import java.util.Arrays;

public class PartitionArrayAccordingToGivenPivot {

    // Function to partition array around pivot
    public static int[] pivotArray(int[] arr, int pivot) {
        int[] result = new int[arr.length];
        int first = 0, last = arr.length - 1;

        // Place elements less than pivot at the beginning
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot) {
                result[first] = arr[i];
                first++;
            }
        }

        // Place elements greater than pivot at the end
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] > pivot) {
                result[last] = arr[j];
                last--;
            }
        }

        // Fill remaining positions with pivot
        while (first <= last) {
            result[first] = pivot;
            first++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input pivot
        System.out.print("Enter pivot value: ");
        int pivot = sc.nextInt();

        // Partitioning array
        int[] partitioned = pivotArray(arr, pivot);

        // Printing result
        System.out.println("Array after partitioning around pivot:");
        System.out.println(Arrays.toString(partitioned));

        sc.close();
    }
}

/*
Time Complexity: O(n)
    - Each element is processed at most twice.
Space Complexity: O(n)
    - Extra array used to store result.
Optimization:
    - Can be done in-place using three-way partition (Dutch National Flag) to reduce space to O(1).
*/
