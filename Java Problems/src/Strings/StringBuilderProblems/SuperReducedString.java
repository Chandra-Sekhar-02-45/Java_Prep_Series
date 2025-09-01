// QUESTION: Reduce a string by repeatedly removing adjacent duplicate characters.
// If the final string is empty, print "Empty String", else print the reduced string.

package Strings.StringBuilderProblems;

import java.util.Scanner;
public class SuperReducedString {

    // Function to reduce the string by removing adjacent duplicates
    public static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder();  // Using StringBuilder for efficient string modification

        // Loop through every character in the string
        for (char c : s.toCharArray()) {
            int len = sb.length();  // Get current length of StringBuilder

            // If last character is same as current -> remove it (pair canceled out)
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);  // delete last character
            }
            // Else add current character to StringBuilder
            else {
                sb.append(c);
            }
        }

        // If StringBuilder is empty, return "Empty String"
        return sb.length() == 0 ? "Empty String" : sb.toString();
    }

    // Main function (Program starts here)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Scanner to take input from user

        // Asking user to enter the string
        System.out.println("Enter a string to reduce (only lowercase letters): ");
        String input = sc.nextLine();  // Read full line as input

        // Call the function and print the result
        String result = superReducedString(input);

        // Display the reduced string to the user
        System.out.println("Reduced String: " + result);

        sc.close();  // Close scanner (good practice)
    }

    public static class ReverseTheSentence {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Asking user to enter a sentence
            System.out.println("Enter a sentence: ");
            String sentence = sc.nextLine().trim();  // Taking input and removing leading/trailing spaces

            // Splitting the sentence into words based on spaces
            // "\\s+" ensures multiple spaces are handled correctly
            String[] words = sentence.split("\\s+");

            // Using StringBuilder for efficient string concatenation
            StringBuilder result = new StringBuilder();

            // Traversing words array from last to first to reverse the sentence
            for (int i = words.length - 1; i >= 0; i--) {
                result.append(words[i]).append(" ");
            }

            // Printing the reversed sentence after trimming extra space at the end
            System.out.println("Reversed sentence: " + result.toString().trim());

            sc.close();
        }
    }
}
