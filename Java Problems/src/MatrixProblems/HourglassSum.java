package MatrixProblems;

import java.util.Scanner;

public class HourglassSum {
    // Function to calculate maximum hourglass sum
    public static int hourglassSum(int[][] arr) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {        // row limit = 6 - 2
            for (int j = 0; j < 4; j++) {    // col limit = 6 - 2
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];

        // User instructions
        System.out.println("Enter a 6x6 matrix of integers:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = hourglassSum(arr);
        System.out.println("Maximum Hourglass Sum: " + result);
        sc.close();
    }
}
