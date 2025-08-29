package Strings;

import java.util.Scanner; // Import the Scanner class

public class CamelCase {

    public static int camelcase(String s) {
        // Handle the edge case where the string is null or has no characters.
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // Initialize word count to 1, as a non-empty camelCase string always starts with one word.
        int wordCount = 1;

        // Iterate through each character of the string to find the start of new words.
        for (int i = 0; i < s.length(); i++) {
            // Get the character at the current position.
            char currentChar = s.charAt(i);
            // If the character is uppercase, it signifies the beginning of a new word.
            if (Character.isUpperCase(currentChar)) {
                wordCount++;
            }
        }
        // Return the final calculated word count.
        return wordCount;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a camelCase string: ");
        // Read the string input from the user.
        String userInput = scanner.nextLine();
        // Call the camelcase method with the user's input.
        int result = camelcase(userInput);
        System.out.println("Number of words: " + result);
        scanner.close();
    }
}