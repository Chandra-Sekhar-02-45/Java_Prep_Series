package PatternPrinting;

import java.util.Scanner;

public class halfDiamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the height of the half diamond: ");
        int n = sc.nextInt();  // Read height
        String star = "*";

        System.out.println("\nGenerated Half Diamond Pattern:\n");

        // Upper half of the diamond (including the middle line)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println(); // Move to next line after each row
        }

        // Lower half of the diamond (excluding the middle line)
        for (int i = 1; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print(star);
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
