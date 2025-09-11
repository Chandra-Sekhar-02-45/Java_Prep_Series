package Collections.List.Vector;

import java.util.Vector;

// 2. Adding Elements
public class Vector_Add {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();

        // Adding elements
        v1.add("Apple");
        v1.add("Banana");
        v1.add("Orange");
        System.out.println("After adding elements: " + v1);

        // Adding an element at a specific index
        v1.add(0, "Grapes");      // add at index
        // Internally, existing elements are shifted to the right
        System.out.println("After adding at index 0: " + v1);

        Vector v2 = new Vector();
        v2.add("Red");
        v2.add("Green");

        // Adding all elements of v2 into v1 (at the end)
        v1.addAll(v2);
        System.out.println("After adding all from v2: " + v1);

        // Adding all elements of v2 into v1 from index 0
        v1.addAll(0, v2);         // addAll at specific index
        System.out.println("After adding v2 at index 0: " + v1);
    }
}

