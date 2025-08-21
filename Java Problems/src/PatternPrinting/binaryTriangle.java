// Write a program to print a binary triangle pattern of size 'n'.

package PatternPrinting;

import java.util.Scanner;                                    // Importing Scanner for input

public class binaryTriangle {

    public static void nBinaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {                       // Loop through each row
            for (int j = 1; j <= i; j++) {                   // Loop through elements in the row
                if ((i + j) % 2 == 0) {                      // Condition for printing 1
                    System.out.print("1 ");                  // Print 1 if sum of indices is even
                } else {
                    System.out.print("0 ");                  // Print 0 otherwise
                }
            }
            System.out.println();                            // Move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                 // Creating Scanner object for input
        System.out.print("Enter the number of rows: ");      // Prompt user for input
        int n = sc.nextInt();                                // Read number of rows
        System.out.println("\nBinary Triangle Pattern:\n");  // Label for output
        nBinaryTriangle(n);                                  // Call pattern function
    }
}
