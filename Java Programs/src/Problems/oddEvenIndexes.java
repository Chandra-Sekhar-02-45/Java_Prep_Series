package Problems;

// Problem Statement:
// Given a string, separate characters at odd and even indices.
// Concatenate the odd-indexed characters first, followed by even-indexed characters.


import java.util.*;                           // Importing utility package for Scanner

public class oddEvenIndexes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object to take input

        System.out.print("Enter a word or string: "); // Prompt for input
        String word = sc.nextLine();          // Reading the full line input

        String row = "";                      // Final result string
        String rowEve = "";                   // String to store even-indexed characters
        String rowOdd = "";                   // String to store odd-indexed characters

        for (int i = 0; i < word.length(); i++) {     // Loop through each character
            if (i % 2 == 0) {                         // If index is even
                rowEve += word.charAt(i);             // Append to even string
            } else {
                rowOdd += word.charAt(i);             // Append to odd string
            }
        }

        row = rowOdd + rowEve;                // Concatenate odd followed by even
        System.out.println("Rearranged string (odd+even): " + row);  // Output the result
    }
}
