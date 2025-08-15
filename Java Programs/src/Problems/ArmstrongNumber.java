// Question: Check whether a given number N is an Armstrong number or Narcissistic Number.
// An Armstrong number is one whose sum of its digits each raised to the power of the number of digits equals the number itself.
// Example: 153 → 1³ + 5³ + 3³ = 153 → Armstrong.

package Problems;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for input
        System.out.print("Enter a number (N): ");
        int N = sc.nextInt();
        sc.close();

        // Step 2: Find number of digits
        int numDigits = String.valueOf(N).length();

        // Step 3: Calculate sum of each digit raised to the power numDigits
        int temp = N;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10; // Extract last digit
            sum += Math.pow(rem, numDigits); // Add rem^numDigits to sum
            temp /= 10; // Remove last digit
        }

        // Step 4: Check if Armstrong number
        if (sum == N) {
            System.out.println("Yes, " + N + " is an Armstrong number.");
        } else {
            System.out.println("No, " + N + " is not an Armstrong number.");
        }
    }
}
