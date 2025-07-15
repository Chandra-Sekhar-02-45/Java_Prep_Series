// Program to print a triangle pattern where each row contains the row number repeated

package PatternPrinting;                                           // Define package name

import java.util.*;                                                // Import utility package for Scanner

public class Triangle {

    // Method to print the number triangle pattern
    public static void nTriangle(int n) {
        for (int i = 1; i <= n; i++) {                             // Loop for each row
            for (int j = 1; j <= i; j++) {                         // Loop to print numbers in row
                System.out.print(i + " ");                         // Print row number
            }
            System.out.println();                                  // Move to next line after row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                       // Create Scanner object for input

        System.out.print("Enter the height of the triangle (n): ");
        int n = sc.nextInt();                                      // Read height of the triangle

        nTriangle(n);                                              // Call method to print the pattern
    }
}
