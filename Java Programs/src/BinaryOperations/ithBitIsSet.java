// Question: Given a number N and a position i, check if the ith bit of N is set (1) or not (0).

package BinaryOperations;

import java.util.Scanner;

public class ithBitIsSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for inputs
        System.out.print("Enter the number (N): ");
        int n = sc.nextInt();

        System.out.print("Enter the bit position (i): ");
        int i = sc.nextInt();

        // Step 2: Check if ith bit is set
        // (n >> i) shifts the ith bit to the least significant position
        // & 1 checks if that bit is 1
        if (((n >> i) & 1) == 1) {
            System.out.println("The " + i + "th bit is SET (1).");
        } else {
            System.out.println("The " + i + "th bit is NOT set (0).");
        }
    }
}
