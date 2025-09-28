// Question: Given an array of n integers and a target value k,
// check whether there exists a subset of the array whose sum is exactly k.
//
// Constraints:
// 1 <= n <= 20     (since we use bitmasking with 2^n possibilities)
// -10^5 <= arr[i] <= 10^5
// -10^5 <= k <= 10^5

package SubSets;

import java.util.Scanner;

public class SumOfSubsetIsK {

    // Function to check if the 'bit'-th bit of 'num' is set
    public static boolean checkBit(int num, int bit) {
        return ((num >> bit) & 1) == 1;
    }

    // Function to check if any subset sums to target
    public static boolean sumK(int[] arr, int target, int n) {
        // Total number of subsets = 2^n
        int upTo = 1 << n;  // equivalent to (int) Math.pow(2, n)

        for (int mask = 0; mask < upTo; mask++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                // If j-th bit is set, include arr[j] in subset sum
                if (checkBit(mask, j)) {
                    sum += arr[j];
                }
            }
            if (sum == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        // Input target sum
        System.out.print("Enter target sum (k): ");
        int k = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if subset exists
        boolean exists = sumK(arr, k, n);
        System.out.println("Subset with sum " + k + " exists: " + exists);

        sc.close();
    }
}

/*
Time Complexity: O(n * 2^n)
    - For each of the 2^n subsets, we may check up to n elements.
Space Complexity: O(1)
    - Only variables used, no extra space.

Optimization:
    - For larger n (up to 40), we can use Meet-in-the-Middle technique (splitting array into halves).
    - For very large constraints, use DP (subset sum problem, O(n*k)).
*/
