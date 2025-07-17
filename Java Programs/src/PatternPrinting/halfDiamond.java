package PatternPrinting;

import java.util.Scanner;

public class halfDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter the height of the half diamond pattern: ");
        int n = sc.nextInt();   // Read input value for height of the pattern

        String star = "*";

        System.out.println("\nGenerated Half Diamond Pattern:\n");

        // Upper half of the diamond (including middle row)
        for (int i = 0; i < n; i++) {                  // Loop for each row
            for (int j = 0; j < i + 1; j++) {          // Print increasing stars
                System.out.print(star);
            }
            System.out.println();                      // Move to next line
        }

        // Lower half of the diamond (excluding middle row)
        for (int i = n - 2; i >= 0; i--) {             // Start from n-2 to avoid repeating middle row
            for (int j = 0; j < i + 1; j++) {          // Print decreasing stars
                System.out.print(star);
            }
            System.out.println();                      // Move to next line
        }
    }
}
