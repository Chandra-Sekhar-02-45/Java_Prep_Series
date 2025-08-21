package TwoPointersApproach;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumSortedArray {
    // LeetCode 167: Two Sum II - Input Array Is Sorted
    public static int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            int sum = numbers[first] + numbers[last];
            if (sum > target) {
                last--;
            } else if (sum < target) {
                first++;
            } else {
                return new int[]{first + 1, last + 1}; // 1-based index
            }
        }
        return new int[]{}; // fallback (not needed for LeetCode)
    }

    // Test with main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instructions
        System.out.println("Enter the size of the sorted array:");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        int[] result = twoSum(numbers, target);

        if (result.length == 0) {
            System.out.println("No two numbers found that add up to the target.");
        } else {
            System.out.println("Indices (1-based): " + Arrays.toString(result));
        }
    }
}
