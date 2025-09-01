// Question: Write a program to reverse the order of words in a given sentence.

package Strings;
import java.util.Scanner;

public class ReverseTheSentence {
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

/*
Time Complexity: O(n)
    - Splitting takes O(n)
    - Traversing words takes O(n)
Space Complexity: O(n)
    - For storing words array and StringBuilder

Optimization:
    - Current solution is optimal for this problem.
    - Can also be done using a stack, but complexity remains the same.
*/
