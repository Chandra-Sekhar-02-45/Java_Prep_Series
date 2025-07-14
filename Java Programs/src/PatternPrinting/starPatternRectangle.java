// Program to print a solid square star pattern of size n x n

package PatternPrinting;                                        // Define package name
import java.util.*;                                             // Import utility package for Scanner

public class starPatternRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    // Create Scanner object for input

        System.out.print("Enter the size of the square (n): ");
        int n = sc.nextInt();                                   // Read the size of the square

        String star = "* ";                                     // Define the star pattern to print

        for (int i = 1; i <= n; i++) {                          // Loop for each row
            for (int j = 1; j <= n; j++) {                      // Loop for each column
                System.out.print(star);                         // Print star
            }
            System.out.println();                               // Move to next line after each row
        }
    }
}
