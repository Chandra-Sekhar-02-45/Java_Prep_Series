// Question: Given a received signal string, count how many characters differ
// from the expected repeating pattern "SOS".
//
// Constraints:
// 1 <= |s| <= 99
// |s| is a multiple of 3
// String consists of only uppercase English letters.

package Strings;

import java.util.Scanner;

public class MarseExploratation {

    // Function to count differences from expected "SOS" pattern
    public static int marsExploration(String s) {
        String mess = "SOS";
        int diffc = 0;

        // Compare each character with expected SOS pattern
        for (int i = 0; i < s.length(); i++) {
            if (mess.charAt(i % 3) != s.charAt(i)) {
                diffc++;
            }
        }
        return diffc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for received signal
        System.out.println("Enter the received signal string: ");
        String s = input.nextLine();

        // Computing result
        int result = marsExploration(s);

        // Printing the number of altered characters
        System.out.println("Number of altered characters: " + result);

        input.close();
    }
}

/*
Time Complexity: O(n)
    - Each character in the string is checked once.
Space Complexity: O(1)
    - Only a few variables used.

Optimization:
    - Already optimal. Can't do better than O(n) since we must check each character.
*/
