// Question: Given an integer N, print its binary representation.
// Do this for multiple test cases.

package BinaryOperations;

import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for number of test cases
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        // Step 2: Process each test case
        while (t-- > 0) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            // Step 3: Convert to binary string
            String binary = Integer.toBinaryString(n);

            // Step 4: Output the binary representation
            System.out.println("Binary representation: " + binary);
        }

        sc.close();
    }
}
