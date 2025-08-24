package Recursions;

import java.util.Scanner;

public class NumbersNTo1 {
    public void numbers(int i) {
        if(i == 0){
            return ;
        }
        System.out.print(i + " ");
        numbers(i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NumbersNTo1 obj = new NumbersNTo1();
        obj.numbers(n);
    }
}
