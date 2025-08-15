// Question: Given an integer N, count the number of set bits (1s) in its binary representation 
// for multiple test cases using an optimal approach (Brian Kernighan's Algorithm).

package BinaryOperations;

import java.util.Scanner;

public class CountSetBitsOptimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for number of test cases
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        // Step 2: Process each test case
        while (t-- > 0) {
            System.out.print("Enter a number: ");
            long n = sc.nextLong(); // Using long for larger values
            int count = 0;

            // Step 3: Count set bits using Brian Kernighan’s Algorithm
            while (n > 0) {
                n &= (n - 1); // Removes the lowest set bit or removing right most bit .
                count++;
            }

            // Step 4: Output result
            System.out.println("Number of set bits: " + count);
        }

        sc.close();
    }
}
