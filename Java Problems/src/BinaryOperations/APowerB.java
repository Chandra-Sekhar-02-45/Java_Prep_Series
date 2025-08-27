package BinaryOperations;
import java.util.*;

public class APowerB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t -- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long m = (int)(1e9 + 7);

            long ans = 1 ;
            while(b > 0){
                if((b & 1) == 1){
                    ans = (1L * ans * a)%m ;
                }
                a = (a*a)%m ;
                b >>= 1;
            }
            System.out.println(ans);

        }

    }
}