// Question: Given N unit squares (1x1), find the number of different rectangles that can be formed using them.

package Problems;

import java.util.Scanner;

public class NumberOfRectangles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for N
        System.out.print("Enter the number of unit squares (N): ");
        int n = sc.nextInt();
        int count = 0;

        // Step 2: Loop for possible heights of rectangles
        for (int height = 1; height <= n; height++) {
            // Step 3: Loop for possible widths of rectangles
            for (int width = height; width <= n; width++) {
                // Step 4: Check if we have enough squares to form this rectangle
                if (height * width <= n) {
                    count++;
                } else {
                    break; // No need to check bigger widths for this height
                }
            }
        }

        // Step 5: Print the total count
        System.out.println("Number of different rectangles that can be formed: " + count);
    }
}
