/*
    ❓ Question: Set Matrix Zeroes (Brute Force Approach)
    -----------------------------------------------------
    You are given an n x m matrix. If any element in the matrix is 0,
    then set the entire row and column of that element to 0.

    Approach (Brute Force):
    1. Traverse the matrix.
    2. Whenever a cell with value `0` is found:
       - Mark its entire row with `-1` (only non-zero elements).
       - Mark its entire column with `-1` (only non-zero elements).
    3. After traversal, convert all `-1` values into `0`.

    ⚡ Time Complexity:
       - For every 0 found, marking row = O(m), marking column = O(n).
       - Worst case, for all elements → O(n * m * (n + m)) - O(n^3).

    ⚡ Space Complexity:
       - No extra matrix used, only in-place changes with marker (-1).
       - So, O(1) extra space.
*/

package MatrixProblems;

import java.util.*;   // Required for Scanner

public class SetMatrixZeroesBF {

    // Helper function to mark entire row with -1
    public int[][] markRows(int[][] arr , int i , int m){
        for(int j = 0 ; j < m ; j++){
            if(arr[i][j] != 0){     // Avoid overwriting existing zero
                arr[i][j] = -1;
            }
        }
        return arr;
    }

    // Helper function to mark entire column with -1
    public int[][] markCols(int[][] arr , int j , int n){
        for(int i = 0 ; i < n ; i++){
            if(arr[i][j] != 0){     // Avoid overwriting existing zero
                arr[i][j] = -1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SetMatrixZeroesBF obj = new SetMatrixZeroesBF();

        // Input: matrix size
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        // Input: matrix elements
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: Traverse and mark rows/cols where zero is found
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(arr[i][j] == 0) {
                    arr = obj.markRows(arr , i , m);
                    arr = obj.markCols(arr , j , n);
                }
            }
        }

        // Step 2: Convert all -1 into 0
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }

        // Output the final matrix
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Close scanner
    }
}
