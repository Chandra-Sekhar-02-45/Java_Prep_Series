package Collections.List.Vector;

import java.util.Vector;

public class Vector_Update {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("Apple");
        v1.add("Banana");
        v1.add("Orange");

        System.out.println("Original Vector: " + v1);

        // Replacing element at index 1
        v1.set(1, "Mango");   // replaces "Banana" with "Mango"
        System.out.println("After set(1, Mango): " + v1);

        // Update using remove + add
        v1.remove(0);         // removes "Apple"
        v1.add(0, "Grapes");  // inserts "Grapes" at index 0
        System.out.println("After replacing index 0 with Grapes: " + v1);

        // Updating using loop (like converting all elements to uppercase)
        for (int i = 0; i < v1.size(); i++) {
            v1.set(i, v1.get(i).toUpperCase());
        }
        System.out.println("After bulk update (uppercase): " + v1);
    }
}
