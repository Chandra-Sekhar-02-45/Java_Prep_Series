// Program to print a reverse right-angled triangle star pattern of height n with custom symbol

package PatternPrinting;                                             // Define package name

import java.util.*;                                                  // Import utility package for Scanner

public class seeding {

    // Method to print the reverse right-angled triangle pattern with custom symbol
    public static void seeding(int n, String sp) {                    // Method with custom symbol parameter
        for (int i = 0; i < n; i++) {                                 // Loop for each row
            for (int j = 0; j < n - i; j++) {                         // Loop to print decreasing symbols
                System.out.print(sp + " ");                                 // Print custom symbol
            }
            System.out.println();                                     // Move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                          // Create Scanner object for input

        System.out.print("Enter the height of the triangle (n): ");
        int n = sc.nextInt();                                         // Read height of the triangle
        sc.nextLine();                                                // Consume leftover newline

        System.out.print("Enter the symbol to print: ");
        String sp = sc.nextLine();                                    // Read custom symbol

        seeding(n, sp);                                               // Call method to print the pattern
    }
}
