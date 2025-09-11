package Collections.List.Vector;
import java.util.Vector;

// 3. Retrieving Elements
public class Vector_Retrieve {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("Apple");
        v1.add("Banana");
        v1.add("Orange");

        System.out.println("Element at index 0: " + v1.get(0)); // get
        System.out.println("First Element: " + v1.firstElement());
        System.out.println("Last Element: " + v1.lastElement());

        // Iteration
        for (int i = 0; i < v1.size(); i++) {
            System.out.println(i + " > " + v1.get(i));
        }
    }
}
