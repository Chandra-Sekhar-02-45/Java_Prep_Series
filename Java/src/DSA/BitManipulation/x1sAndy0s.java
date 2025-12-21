package DSA.BitManipulation;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class x1sAndy0s {
    //Given two numbers X and Y, find the number whose binary representation has X 1's followed by Y 0's.

    //    Input :
    //   Test Cases : 3
    //        4 3
    //        2 5
    //        10 15

    //    Output :
    //        120
    //        96
    //        33521664

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T =  sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int result = (((1 << x) - 1 ) * (1 << y)) ;

            System.out.println(result);
        }
    }
}
