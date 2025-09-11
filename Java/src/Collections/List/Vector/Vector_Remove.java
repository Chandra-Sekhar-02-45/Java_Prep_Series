package Collections.List.Vector;

import java.util.Vector;

// 4. Removing Elements
public class Vector_Remove {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("Apple");
        v1.add("Banana");
        v1.add("Orange");
        v1.add("Banana");

        System.out.println("Original: " + v1);

        v1.remove(1);          // remove by index
        System.out.println("After removing index 1: " + v1);

        v1.remove("Orange");   // remove by object
        System.out.println("After removing 'Orange': " + v1);

        Vector<String> v2 = new Vector<>();
        v2.add("Banana");
        v1.removeAll(v2);      // remove all from another collection
        System.out.println("After removeAll: " + v1);

        v1.clear();            // clear everything
        System.out.println("After clear(): " + v1);
    }
}
