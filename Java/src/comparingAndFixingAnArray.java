import java.util.HashMap;
import java.util.Scanner;

public class comparingAndFixingAnArray {
    public static void main(String[] args) {
        int[] arr = {14 , 15 , 1 , 22 , 3, 6};
        int[] arr2 = {1 , 22 , 3 , 14 , 15, 6};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                arr2[i] = map.get(arr2[i]);
            }
        }


    }
}
