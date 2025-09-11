package Collections.List.Vector;

import java.util.Vector;

/* 1. Creation + Size vs Capacity
 * Size vs Capacity:
 * - Size = number of elements stored.
 * - Capacity = allocated storage space.
 *
 * Vector grows by 100% (doubles capacity) when size > capacity.
 * Example:
 *   Initial capacity = 10
 *   After 11th element → capacity = 20
 *   After 21st element → capacity = 40
 *   and so on...
 */

public class Vector_Creation {
    public static void main(String[] args) {

        // Creating a Vector (default capacity = 10)
        Vector<String> v1 = new Vector<>();

        // Initially empty, prints as [] because Vector overrides toString()
        System.out.println(v1);

        System.out.println("Initial Size: " + v1.size());       // 0
        System.out.println("Initial Capacity: " + v1.capacity());// 10
    }
}
