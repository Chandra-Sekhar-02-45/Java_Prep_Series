package ArraysProblems;

import java.util.Scanner;

public class reversingAnArray {

    public static void swap(int[] arr , int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }

        // Approach - 1
//        System.out.print("The reversed array is : ");
//        for(int i = n - 1  ; i >= 0 ; i--){
//            System.out.print(arr[i]+" ");
//        }

        // Approach - 2
//        int temp;
//        for (int i = 0; i < n / 2 ; i++) {
//            temp = arr[i];
//            arr[i] = arr[n - i - 1];
//            arr[n - i - 1] = temp;
//        }
//
//        System.out.print("The reversed array is : ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // Approach - 3
        int first = 0;
        int last = n - 1;
        for(int i = 0 ; i < n ; i++) {
            if (first < last){
                swap(arr , first , last);
                first ++ ;
                last -- ;
            }
            else {
                break;
            }
        }

        System.out.println("The reversed array is : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
