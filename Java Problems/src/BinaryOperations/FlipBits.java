// Question: You are given two numbers A and B.
// Count the number of bits that need to be flipped to convert A into B.
// Flipping a bit means changing it from 0 → 1 or from 1 → 0.

package BinaryOperations;

import java.util.Scanner;

public class FlipBits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for number of test cases
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        // Step 2: Process each test case
        while (t-- > 0) {
            System.out.print("Enter A: ");
            int a = sc.nextInt();

            System.out.print("Enter B: ");
            int b = sc.nextInt();

            // Step 3: XOR finds differing bits between a and b
            int xor = a ^ b;

            // Step 4: Count set bits in XOR result
            int count = Integer.bitCount(xor);

            // Step 5: Output result
            System.out.println("Number of bits to flip: " + count);
        }

        sc.close();
    }
}
