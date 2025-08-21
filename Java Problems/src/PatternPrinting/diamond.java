// Program to print a diamond-shaped star pattern of height n

package PatternPrinting;                                             // Define package name

import java.util.*;                                                  // Import utility package for Scanner

public class diamond {

    // Method to print the diamond star pattern
    public static void nStarDiamond(int n, String sym) {
        String space = " ";                                           // Define the space character

        // Upper half of diamond (including middle row)
        for (int i = 1; i <= n; i++) {                                // Loop for each row in upper half
            for (int j = 1; j <= n - i; j++) {                        // Print leading spaces
                System.out.print(space);
            }
            for (int j = 1; j <= 2 * i - 1; j++) {                     // Print increasing symbols
                System.out.print(sym);
            }
            System.out.println();                                     // Move to next line
        }

        // Lower half of diamond
        for (int i = 1; i <= n; i++) {                                // Loop for each row in lower half
            for (int j = 1; j <= i - 1; j++) {                         // Print leading spaces
                System.out.print(space);
            }
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {               // Print decreasing symbols
                System.out.print(sym);
            }
            System.out.println();                                     // Move to next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                          // Create Scanner object for input

        System.out.print("Enter the height of the diamond (n): ");
        int n = sc.nextInt();                                         // Read height of the diamond
        sc.nextLine();                                                // Consume leftover newline

        System.out.print("Enter the symbol to use in the diamond: ");
        String sym = sc.nextLine();                                   // Read custom symbol

        nStarDiamond(n, sym);                                         // Call method to print the pattern
    }
}
