package ArraysProblems.LeetCode;
// LeetCode 1920: Build Array from Permutation
// Given a zero-based permutation array nums, build an array ans such that ans[i] = nums[nums[i]].

import java.util.Scanner;

public class BuildArrayFromPermutation {        // Main class name

    // Method to build array from permutation
    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];        // Create an array to store the result

        for (int i = 0; i < nums.length; i++) {  // Traverse each index
            arr[i] = nums[nums[i]];              // Build array using nums[nums[i]]
        }

        return arr;                              // Return the new array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Create Scanner object for user input

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();                    // Read array size

        int[] nums = new int[n];                 // Declare input array
        System.out.println("Enter " + n + " elements (0 to n-1, permutation array): ");

        for (int i = 0; i < n; i++) {            // Read array elements
            nums[i] = sc.nextInt();
        }

        int[] ans = buildArray(nums);            // Call the function

        System.out.print("The built array is: ");
        for (int i = 0; i < ans.length; i++) {   // Print the result array
            System.out.print(ans[i] + " ");
        }
    }
}
