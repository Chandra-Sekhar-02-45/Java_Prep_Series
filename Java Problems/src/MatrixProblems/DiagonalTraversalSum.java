// Question: Given a square matrix of size n x n, print the sum of all diagonals
// starting from the last column of the first row and then from the rows of the first column.

package MatrixProblems;
import java.util.*;   // For Scanner, List, ArrayList

public class DiagonalTraversalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for number of test cases
        System.out.println("Enter number of test cases: ");
        int T = sc.nextInt();

        while (T-- > 0) {
            // Asking user for size of the matrix
            System.out.println("Enter size of the matrix (n): ");
            int n = sc.nextInt();

            int[][] mat = new int[n][n];

            // Asking user to input matrix elements
            System.out.println("Enter the elements of the matrix row by row: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            List<Integer> list = new ArrayList<>();

            // Traversing diagonals starting from the top-right corner moving left
            for (int col = n - 1; col >= 0; col--) {
                int sum = 0;
                int i = 0, j = col;
                while (i < n && j < n) {
                    sum += mat[i][j];
                    i++;
                    j++;
                }
                list.add(sum);
            }

            // Traversing diagonals starting from the first column moving down
            for (int row = 1; row < n; row++) {
                int sum = 0;
                int i = row, j = 0;
                while (i < n && j < n) {
                    sum += mat[i][j];
                    i++;
                    j++;
                }
                list.add(sum);
            }

            // Printing diagonal sums
            System.out.println("Diagonal sums: ");
            for (int k = 0; k < list.size(); k++) {
                System.out.print(list.get(k));
                if (k < list.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Time Complexity: O(n^2)
    - Each element is visited once while traversing diagonals.
Space Complexity: O(n)
    - For storing diagonal sums in the list.

Optimization:
    - The solution is already optimal as we must visit all elements at least once.
    - If we only needed sums without storing them, we could print directly to save O(n) space.
*/
