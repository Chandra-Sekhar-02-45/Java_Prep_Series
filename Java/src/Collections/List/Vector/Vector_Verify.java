package Collections.List.Vector;
import java.util.Vector;

// 5. Verification / Searching
public class Vector_Verify {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("Apple");
        v1.add("Banana");

        System.out.println("Contains 'Banana'? " + v1.contains("Banana"));
        System.out.println("Is Empty? " + v1.isEmpty());

        Vector<String> v2 = new Vector<>();
        v2.add("Apple");
        v2.add("Banana");

        System.out.println("ContainsAll v2? " + v1.containsAll(v2));
    }
}
