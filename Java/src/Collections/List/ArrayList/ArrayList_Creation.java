package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Creation {
    public static void main(String[] args) {
        // Creating an empty ArrayList
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Initial Size: " + list.size());
        System.out.println("List: " + list);

        // Inbuilt capacity method is not available in ArrayList.
        // Creating with capacity 20
        ArrayList<String> list1 = new ArrayList<>(20);
        System.out.println("List with custom capacity (20): " + list1);

        // Creating ArrayList from an array
        Integer[] arr = {1, 2, 3, 4};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Array to ArrayList: " + list2);
    }
}
