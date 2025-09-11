package Collections.List.Vector;

import java.util.*;

public class Vector_General {
    public static void main(String[] args) {
        // 1. indexOf and lastIndexOf
        Vector<String> v1 = new Vector<>();
        v1.add("Apple");
        v1.add("Banana");
        v1.add("Orange");
        v1.add("Banana");
        v1.add("Grapes");

        System.out.println("Vector: " + v1);

        System.out.println("indexOf(Banana): " + v1.indexOf("Banana"));       // first occurrence
        System.out.println("lastIndexOf(Banana): " + v1.lastIndexOf("Banana"));// last occurrence
        System.out.println("firstElement(): " + v1.firstElement());           // first element
        System.out.println("lastElement(): " + v1.lastElement());             // last element

        // 2. Creating a Vector with initial capacity
        Vector<Integer> v2 = new Vector<>(20); // initial capacity = 20
        System.out.println("\nVector v2 created with capacity 20");
        System.out.println("Size: " + v2.size());
        System.out.println("Capacity: " + v2.capacity());

        // Adding a few elements (capacity won't grow until > 20)
        v2.add(1);
        v2.add(2);
        v2.add(3);
        System.out.println("v2 after adding: " + v2);
        System.out.println("Size: " + v2.size());
        System.out.println("Capacity: " + v2.capacity()); // still 20

        // 3. Creating Vector from Array using Arrays.asList()
        String[] arr = {"Red", "Green", "Blue"};
        Vector<String> v3 = new Vector<>(Arrays.asList(arr));
        System.out.println("\nCreated Vector v3 from Array: " + v3);

        // NOTE: here, capacity = size of array (3), NOT default 10
        System.out.println("Size: " + v3.size());
        System.out.println("Capacity: " + v3.capacity()); // 3
    }
}
