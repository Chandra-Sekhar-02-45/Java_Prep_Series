// Program to print a solid square star pattern of size n x n with custom symbol

package PatternPrinting;                                         // Define package name

import java.util.*;                                              // Import utility package for Scanner

public class squarePattern {

    // Method to print the solid square pattern with custom symbol
    public static void printSquare(int n, String sp) {
        for (int i = 1; i <= n; i++) {                           // Loop for each row
            for (int j = 1; j <= n; j++) {                       // Loop for each column
                System.out.print(sp + " ");                            // Print custom symbol
            }
            System.out.println();                                // Move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                     // Create Scanner object for input

        System.out.print("Enter the size of the square (n): ");
        int n = sc.nextInt();                                    // Read the size of the square
        sc.nextLine();                                           // Consume the leftover newline

        System.out.print("Enter the symbol to print: ");
        String sp = sc.nextLine();                               // Read the custom symbol

        printSquare(n, sp);                                       // Call method to print the pattern
    }
}
