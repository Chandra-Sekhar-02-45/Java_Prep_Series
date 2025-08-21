// Program to find all pairs in an array whose sum is equal to k

package ArraysProblems;

import java.util.Scanner;

public class twoSumEqls_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();  // Target sum
        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        // Take array elements as input
        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Store user input in array
        }
        // Approach - 1
        // Find and print pairs whose sum equals k
//        System.out.println("Pairs whose sum equals " + k + ":");
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {   // Avoid repeating pairs
//                if (arr[i] + arr[j] == k) {
//                    System.out.println(arr[i] + " + " + arr[j] + " = " + k);
//                }
//            }
//        }

        // Approach - 2
        // Two Pointers Method
        for(int i = 0 ; i < n ; i ++){


        }


    }
}
