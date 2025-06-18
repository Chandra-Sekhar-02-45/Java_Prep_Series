// Program to print a right-aligned staircase pattern of '#' characters

import java.util.*;                                                      // Import utility package for Scanner

public class stairCasePattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);                             // Create Scanner object for input

        System.out.print("Enter the number of steps: ");
        int n = sc.nextInt();                                            // Read number of steps for the staircase

        for (int i = 1; i < n + 1; i++) {
            String space = " ".repeat(n - i);                            // Generate (n - i) spaces
            String hash = "#".repeat(i);                                 // Generate i '#' characters
            String row = space + hash;                                   // Combine space and hash

            System.out.println(row);                                     // Print the staircase row
        }
    }
}
