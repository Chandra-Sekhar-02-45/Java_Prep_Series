// Program to print a number triangle pattern of height n (1 to i in each row)

package PatternPrinting;                                             // Define package name

import java.util.*;                                                  // Import Scanner for input

public class nTriangles {

    // Method to print the number triangle pattern
    public static void nTriangle(int n) {
        for (int i = 0; i < n; i++) {                                 // Loop for each row
            int count = 0;                                            // Reset count for every row
            for (int j = 0; j <= i; j++) {                            // Loop to print numbers in row
                count ++;                                           // Increment count
                System.out.print(count + " ");                        // Print current number
            }
            System.out.println();                                     // Move to next line after row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                          // Create Scanner object for input

        System.out.print("Enter the height of the triangle (n): ");
        int n = sc.nextInt();                                         // Read height

        nTriangle(n);                                                 // Call method to print pattern
    }
}
