// Question: Write a program to print Pascal's Triangle up to 'n' rows.

package PatternPrinting;

import java.util.Scanner;

public class PascalsTriangle {

    // Function to print Pascal's Triangle
    static void printPascal(int n) {

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            int c = 1; // First element of each row is always 1

            // Inner loop for printing numbers in a row
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " "); // Print current element
                c = c * (i - j) / j;      // Compute next element using binomial coefficient
            }

            System.out.println(); // Move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User instruction
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = sc.nextInt();

        // Function call
        printPascal(n);

        sc.close();
    }
}
