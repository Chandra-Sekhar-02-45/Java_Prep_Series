// Check if a word is easy to pronounce (NO if it has 4 or more consecutive consonants)

package Strings;
import java.util.*;

class EasyPronunciation {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // length of the string
            String str = sc.next(); // input string

            String vowels = "aeiou";
            int count = 0; // count consecutive consonants
            boolean valid = true; // assume string is easy to pronounce

            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);

                // If character is NOT a vowel → consonant
                if (!vowels.contains(String.valueOf(ch))) {
                    count++;

                    // If 4 or more consecutive consonants → hard to pronounce
                    if (count >= 4) {
                        valid = false;
                        break;
                    }
                } else {
                    count = 0; // reset when vowel appears
                }
            }

            // Output result
            System.out.println(valid ? "YES" : "NO");
        }
    }
}
