// Program to toggle the case of each character in a given string

import java.util.*;                                               // Import utility package for Scanner

public class toggleCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                       // Create Scanner object for input

        System.out.print("Enter a string: ");                      // Prompt user to enter the string
        String word = sc.nextLine();                               // Read the input string
        String finish = "";                                         // Initialize the output string

        for (int i = 0; i < word.length(); i++) {                   // Loop through each character
            char ch = word.charAt(i);                              // Get the character at position i

            if (Character.isLowerCase(ch)) {                       // If character is lowercase
                finish += Character.toUpperCase(ch);                // Convert to uppercase
            }
            else if (Character.isUpperCase(ch)) {                   // If character is uppercase
                finish += Character.toLowerCase(ch);                // Convert to lowercase
            }
            else {                                                  // If character is not a letter
                finish += ch;                                       // Keep it as is
            }
        }

        System.out.println("Toggled string: " + finish);            // Print the final toggled string
    }
}
