package Strings;

import java.util.Scanner;

/**
 * A utility class to determine the minimum number of characters to add to a
 * string to make it a strong password.
 */

public class StrongPassword {

    public static int minimumNumber(int n, String p) {
        // These act as flags. 1 means the category is missing, 0 means it's present.
        int missingUpper = 1;
        int missingLower = 1;
        int missingSpecial = 1;
        int missingNum = 1;

        // Iterate through the password to check for each character type.
        for (int i = 0; i < n; i++) {
            char ch = p.charAt(i);

            // Check character type and update the flag to 0 if found.
            if (ch >= 'A' && ch <= 'Z') {
                missingUpper = 0;
            } else if (ch >= 'a' && ch <= 'z') {
                missingLower = 0;
            } else if (ch >= '0' && ch <= '9') {
                missingNum = 0;
            } else {
                // Any other character is considered a special character.
                missingSpecial = 0;
            }
        }

        // Sum the flags to find the total number of missing character types.
        int missingTypes = missingUpper + missingLower + missingSpecial + missingNum;

        // The number of characters to add is the maximum of two requirements:
        // 1. The number of missing character types.
        // 2. The number of characters needed to meet the minimum length of 8.
        return Math.max(missingTypes, 8 - n);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read from the console.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the password: ");
        int n = input.nextInt();

        System.out.print("Enter the password: ");
        String password = input.next(); // .next() reads a single word/string.

        // Call the method and store the result.
        int answer = minimumNumber(n, password);

        // Print the final answer.
        System.out.println("Minimum characters to add: " + answer);

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}