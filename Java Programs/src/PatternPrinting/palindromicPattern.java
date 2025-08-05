// Program to print a palindromic character pattern

package PatternPrinting; // Package name

import java.util.*;

public class palindromicPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create scanner object

        System.out.print("Enter the number of rows: "); // Prompt for input
        int n = sc.nextInt();  // Read the number of rows

        for (int i = 0; i < n; i++) {  // Loop through each row
            int fix = (int) 'A';  // Starting ASCII value for 'A'

            for (int j = 0; j < 2 * i + 1; j++) {  // Loop through each column
                if (j < i) {  // For first half of the row
                    System.out.print((char) fix + " ");  // Print current character
                    fix++;  // Move to next character
                }
                else {  // For second half of the row
                    System.out.print((char) fix + " ");  // Print current character
                    fix--;  // Move to previous character
                }
            }

            System.out.println();  // Move to next line after each row
        }
    }
}
