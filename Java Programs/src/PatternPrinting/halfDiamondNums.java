package PatternPrinting;

import java.util.Scanner;

public class halfDiamondNums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the number of rows for the number half diamond: ");
        int n = sc.nextInt();  // Read input

        System.out.println("\nGenerated Number Half Diamond Pattern:\n");

        // Upper half of the pattern (including middle row)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        // Lower half of the pattern
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
