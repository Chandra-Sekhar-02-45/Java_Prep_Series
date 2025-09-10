// Question: Check if the string "hackerrank" is a subsequence
// of a given string for multiple test cases.
//
// Constraints:
// 1 <= q <= 10^2
// 10 <= |s| <= 10^4
// String s contains only lowercase English letters.

package Strings.StringBuilderProblems;

import java.util.Scanner;

public class HckerRankString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String target = "hackerrank";

            System.out.print("Enter a string: ");
            String s = sc.nextLine();
            System.out.println(isSubsequence(s, target) ? "YES" : "NO");

        sc.close();
    }

    // Function to check if 'target' is a subsequence of 's'
    private static boolean isSubsequence(String s, String target) {
        int j = 0;  // pointer for target
        for (int i = 0; i < s.length() && j < target.length(); i++) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
        }
        return j == target.length();
    }
}

/*
Time Complexity: O(|s|) per test case
    - Each character is checked once.
Space Complexity: O(1)
    - Only integer counters are used.

Optimization:
    - Already optimal. Cannot do better than O(|s|) since we must scan the string.
*/
