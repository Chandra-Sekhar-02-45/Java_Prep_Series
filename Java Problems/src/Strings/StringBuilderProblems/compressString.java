// Program to compress a string using counts of consecutive characters
// Example: input = "aaabbc" -> output = "a3b2c1"

package Strings.StringBuilderProblems;
import java.util.Scanner;

public class compressString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to compress: "); // Prompt user input
        String input = sc.nextLine();                     // Read the input string

        StringBuilder result = new StringBuilder();       // To store compressed string
        int freq = 1;                                     // Frequency counter for each character

        // Loop through the string
        for (int i = 0; i < input.length(); i++) {
            // Check if next character is same as current
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                freq++;                                   // Increment frequency
            } else {
                result.append(input.charAt(i)).append(freq); // Append char and its frequency
                freq = 1;                                // Reset frequency for next character
            }
        }

        System.out.println("Compressed string: " + result); // Display compressed string
    }
}
