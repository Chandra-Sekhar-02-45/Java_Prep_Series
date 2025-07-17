package PatternPrinting;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the triangle pattern: ");
        int n = sc.nextInt();  // Read input

        String star = "* ";  // Define the pattern to print

        // Outer loop for each row
        for (int i = 0; i < n; i++) {
            // Inner loop for printing stars in each row
            for (int j = 0; j < i + 1; j++) {
                System.out.print(star);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
