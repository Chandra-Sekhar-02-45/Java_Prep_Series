// Write a program to print a hollow rectangle pattern using '*'.

package PatternPrinting.HallowPatterns;

import java.util.Scanner;                                        // Importing Scanner for input

public class hallowRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                     // Creating Scanner object

        System.out.print("Enter the width of the rectangle: ");  // Prompt for width
        int w = sc.nextInt();                                    // Read width

        System.out.print("Enter the length of the rectangle: "); // Prompt for length
        int l = sc.nextInt();                                    // Read length

        System.out.println("\nHollow Rectangle Pattern:\n");     // Output label

        for (int i = 1; i <= l; i++) {                            // Loop for each row
            for (int j = 1; j <= w; j++) {                        // Loop for each column
                if (i == 1 || i == l || j == 1 || j == w) {       // Check if border
                    System.out.print("*");                        // Print star on borders
                } else {
                    System.out.print(" ");                        // Print space inside
                }
            }
            System.out.println();                                 // Move to next line
        }
    }
}
