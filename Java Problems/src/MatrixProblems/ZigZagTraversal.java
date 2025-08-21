package MatrixProblems;
import java.util.*;
// Given a matrix of size N x M, print the matrix in zig-zag order.
public class ZigZagTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.println("Enter matrix elements:");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("ZigZag Traversal:");
        for(int row = 0; row < n; row++){
            if(row % 2 == 0){
                // left to right
                for(int col = 0; col < m; col++){
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                // right to left
                for(int col = m - 1; col >= 0; col--){
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}
