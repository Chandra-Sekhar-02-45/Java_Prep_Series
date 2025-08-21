// Question: Given an integer N, count the number of set bits (1s) in its binary representation.
// Do this for multiple test cases.

package BinaryOperations;
import java.util.Scanner;

public class CountSetBits {

    // Method to check if the ith bit of n is set
    public static boolean ithBitSet(long n, int i) {
        return ((n >> i) & 1) == 1;
    }

    // Method to count the number of set bits
    public static int countSetBits(long n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) { // Check all 32 bits of an integer
            if (ithBitSet(n, i)) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for number of test cases
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        // Step 2: Process each test case
        while (t-- > 0) {
            System.out.print("Enter a number: ");
            long n = sc.nextLong();

            // Step 3: Count set bits
            int count = countSetBits(n);

            // Step 4: Output result
            System.out.println("Number of set bits: " + count);
        }
        sc.close();
    }
}
