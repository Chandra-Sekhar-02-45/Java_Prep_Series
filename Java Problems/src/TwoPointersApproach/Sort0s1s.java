/*
Question:
Write a program to sort an array consisting only of 0s and 1s
using the two-pointer approach.
*/

package TwoPointersApproach;

import java.util.Scanner;

public class Sort0s1s {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elments : ");
            int n = sc.nextInt();  // size of array
            int arr[] = new int[n];

            // take array input
            System.out.print("Enter the elements of the array only 0's & 1's: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // two pointers: one at start, one at end
            int first = 0;
            int last = n - 1;

            // sort the array by swapping misplaced 0s and 1s
            while (first < last) {
                if (arr[first] == 0) {
                    first++;  // move forward if left is already 0
                } else if (arr[last] == 1) {
                    last--;   // move backward if right is already 1
                } else {
                    // swap 1 on left with 0 on right
                    int temp = arr[first];
                    arr[first] = arr[last];
                    arr[last] = temp;
                    first++;
                    last--;
                }
            }

            // print the sorted array
            System.out.println("The sorted array is: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
