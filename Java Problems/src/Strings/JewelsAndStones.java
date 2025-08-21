package Strings;

import java.util.Scanner;

public class JewelsAndStones {

    // LeetCode 771: Jewels and Stones
    // Returns count of characters in 'stones' that also appear in 'jewels'
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);                // Take each stone character
            if (jewels.contains(ch + "")) {            // Check if it's a jewel
                count++;                               // Increase count if true
            }
        }

        return count;                                  // Return total jewel count
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter jewels string: ");
        String jewels = sc.nextLine();                 // Input: Jewel types

        System.out.print("Enter stones string: ");
        String stones = sc.nextLine();                 // Input: Stones you have

        int result = numJewelsInStones(jewels, stones);

        System.out.println("Number of jewels in stones: " + result);
    }
}
