package Oops.Constructors;

public class parametrizedConstructor {
    String name;
    int age;

    // Parameterized constructor
    parametrizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name is " + name + ". And age is " + age);
    }
}


//    public static class Main {
//        public static void main(String[] args) {
//            parametrizedConstructor s2 = new parametrizedConstructor("Arjun", 20);
//            parametrizedConstructor s3 = new parametrizedConstructor("Bhavya", 22);
//
//            s2.display();  // Output: Arjun, 20
//            s3.display();  // Output: Bhavya, 22
//        }
//    }
