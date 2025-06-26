// Program to count how many candles have the maximum height

import java.util.*;

public class birthdayCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candles: ");
        int n = sc.nextInt();                               // Read number of candles

        List<Integer> candles = new ArrayList<>();          // Create list to store candle heights

        System.out.print("Enter " + n + " candle heights: ");
        for (int i = 0; i < n; i++) {
            candles.add(sc.nextInt());                      // Read each height into the list
        }

        int max = Integer.MIN_VALUE;                        // Initialize max to smallest possible value
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);                       // Find the tallest candle
            }
        }

        int count = 0;                                      // Counter to count how many candles are tallest
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == max) {
                count++;                                    // Increment count if height equals max
            }
        }

        System.out.println("Tallest candle count: " + count); // Output the result
    }
}
