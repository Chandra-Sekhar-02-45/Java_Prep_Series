package DSA.Strings;

import java.util.Scanner;

public class compressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            String str = sc.next();

            StringBuilder sb = new StringBuilder();

            int length = 1 ;
            for(int i = 0; i < str.length() - 1; i++) {
                if(str.charAt(i) == str.charAt(i + 1)) {
                    length++;
                }
                else {
                    sb.append(str.charAt(i)).append(length);
                    length = 1;
                }
            }
            sb.append(str.charAt(str.length() - 1)).append(length);
            System.out.println(sb.toString());
        }
    }

}
