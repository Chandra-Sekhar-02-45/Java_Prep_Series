package Strings;

import java.util.Scanner;

public class LastWordLength {

    /**
     * Calculates the length of the last word in a given string.
     */

    public int lengthOfLastWord(String s) {
        // First, trim any leading or trailing whitespace from the string.
        s = s.trim();
        int length = 0;

        // Iterate backward from the end of the trimmed string.
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            // If the character is not a space, increment the length counter.
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        // Create an instance of the class to call the method.
        LastWordLength solution = new LastWordLength();
        // Calculate the length of the last word from the user's input.
        int result = solution.lengthOfLastWord(userInput);

        System.out.println("The length of the last word is: " + result);

        input.close();
    }
}