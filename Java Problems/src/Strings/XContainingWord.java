// Question: LeetCode 2942 - Find Words Containing Character
// Given an array of words and a character x, return a list of indices
// of words that contain the character x.

package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XContainingWord {

    // Function to find indices of words containing the character x
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        // Loop through each word in the array
        for (int i = 0; i < words.length; i++) {
            // If the word contains the character x, add its index to the list
            if (words[i].indexOf(x) != -1) {
                list.add(i);
            }
        }
        return list;
    }

    // Main function with user instructions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of words:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] words = new String[n];
        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        System.out.println("Enter the character to search:");
        char x = sc.next().charAt(0);

        XContainingWord obj = new XContainingWord();
        List<Integer> result = obj.findWordsContaining(words, x);

        System.out.println("Indices of words containing '" + x + "': " + result);
    }
}
