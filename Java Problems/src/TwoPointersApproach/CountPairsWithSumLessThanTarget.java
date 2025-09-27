package TwoPointersApproach;

// Question: Given a 0-indexed integer array nums and an integer target,
// return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
//  LeetCode 2824
// Constraints:
// 1 <= nums.length <= 50
// -50 <= nums[i], target <= 50

import java.util.*;

public class CountPairsWithSumLessThanTarget {

    // Function to count pairs using two-pointer approach
    public static int countPairs(List<Integer> nums, int target) {
        // Sort the array to enable two-pointer method
        Collections.sort(nums);
        int count = 0;
        int i = 0, j = nums.size() - 1;

        while (i < j) {
            if (nums.get(i) + nums.get(j) < target) {
                // All elements between i and j form valid pairs with nums[i]
                count += j - i;
                i++;
            } else {
                // Sum too large, try smaller element by moving right pointer left
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Count pairs
        int result = countPairs(nums, target);

        // Print result
        System.out.println("Number of pairs with sum less than target: " + result);

        sc.close();
    }
}

/*
Time Complexity: O(n log n)
    - Sorting takes O(n log n), two-pointer traversal takes O(n)
Space Complexity: O(1) extra space (not counting input list)
Optimization:
    - Already optimal for small n (<= 50).
*/
