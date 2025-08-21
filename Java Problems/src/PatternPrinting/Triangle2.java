// Program to print a centered pyramid pattern of height n with custom symbol

package PatternPrinting;                                             // Define package name

import java.util.*;                                                  // Import utility package for Scanner

public class Triangle2 {

    // Method to print the centered pyramid pattern with custom symbol
    public static void nStarTriangle(int n, String sym) {             // Accept height and custom symbol
        String space = " ";                                           // Define the space character

        for (int i = 1; i <= n; i++) {                                // Loop for each row
            for (int j = 1; j <= n - i; j++) {                        // Loop to print leading spaces
                System.out.print(space);                              // Print space
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {                   // Loop to print symbols
                System.out.print(sym);                                // Print custom symbol
            }

            System.out.println();                                     // Move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                          // Create Scanner object for input

        System.out.print("Enter the height of the pyramid (n): ");
        int n = sc.nextInt();                                         // Read height of the pyramid
        sc.nextLine();                                                // Consume leftover newline

        System.out.print("Enter the symbol to print: ");
        String sym = sc.nextLine();                                   // Read custom symbol

        nStarTriangle(n, sym);                                        // Call method to print the pattern
    }
}
