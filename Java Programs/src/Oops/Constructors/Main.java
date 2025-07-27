package Oops.Constructors;

public class Main {
    public static void main(String[] args) {
        defaultConstructor s1 = new defaultConstructor();
        s1.display();  // Output: Name: Unknown, Age: 0

        parametrizedConstructor s2 = new parametrizedConstructor("Arjun", 20);
        parametrizedConstructor s3 = new parametrizedConstructor("Bhavya", 22);
            s2.display();  // Output: Name is Arjun. And age is 20
            s3.display();  // Output: Name is Bhavya. And age is 22
    }
}
