// Program to print a right-angled triangle star pattern of height n with custom symbol

package PatternPrinting;                                           // Define package name

import java.util.*;                                                // Import utility package for Scanner

public class patternRightTrinagle {

    // Method to print the star triangle pattern with custom symbol
    public static void printTriangle(int n, String sp) {
        for (int i = 1; i <= n; i++) {                             // Loop for each row
            for (int j = 1; j <= i; j++) {                         // Loop to print increasing symbols
                System.out.print(sp + " ");                              // Print custom symbol
            }
            System.out.println();                                  // Move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                       // Create Scanner object for input

        System.out.print("Enter the height of the triangle (n): ");
        int n = sc.nextInt();                                      // Read the height of the triangle
        sc.nextLine();                                             // Consume the leftover newline

        System.out.print("Enter the symbol to print: ");
        String sp = sc.nextLine();                                 // Read the custom symbol

        printTriangle(n, sp);                                      // Call method to print the pattern
    }
}
