// Program to print a reverse number triangle pattern of height n

package PatternPrinting;                                             // Define package name

import java.util.*;                                                  // Import utility package for Scanner

public class rverseNumberTriangle {

    // Method to print the reverse number triangle pattern
    public static void nNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {                               // Loop for each row
            int count = 0;                                            // Reset count for each row
            for (int j = 1; j <= n - i + 1; j++) {                    // Loop to print decreasing numbers
                count++;                                              // Increment count
                System.out.print(count + " ");                        // Print number
            }
            System.out.println();                                     // Move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                          // Create Scanner object for input

        System.out.print("Enter the height of the triangle (n): ");
        int n = sc.nextInt();                                         // Read height of the triangle

        nNumberTriangle(n);                                           // Call method to print the pattern
    }
}
