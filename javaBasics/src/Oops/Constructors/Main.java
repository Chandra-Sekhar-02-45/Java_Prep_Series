package Oops.Constructors;

public class Main {
    public static void main(String[] args) {

        defaultConstructor s1 = new defaultConstructor();
            s1.display();  // Output: Name: Unknown, Age: 0

        parametrizedConstructor s2 = new parametrizedConstructor("Arjun", 20);
        parametrizedConstructor s3 = new parametrizedConstructor("Bhavya", 22);
            s2.display();  // Output: Name is Arjun. And age is 20
            s3.display();  // Output: Name is Bhavya. And age is 22

        copyConstructor s4 = new copyConstructor("Alice", 20); // original object
        // Creating a new object 's5' using copy constructor
        // This copies the details of s4 into s5
        copyConstructor s5 = new copyConstructor(s4); // copy object using copy constructor
            s4.display(); // Output: Name: Alice, Age: 20
            s5.display(); // Output: Name: Alice, Age: 20


        constructorOverloading s6 = new constructorOverloading();               // Calls default constructor
        constructorOverloading s7 = new constructorOverloading("Alice", 21);    // Calls 2nd constructor
        constructorOverloading s8 = new constructorOverloading("Bob");          // Calls 3rd constructor
                s6.display(); // Output: Name: Unknown, Age: 0
                s7.display(); // Output: Name: Alice, Age: 21
                s8.display(); // Output: Name: Bob, Age: 18
    }
}
