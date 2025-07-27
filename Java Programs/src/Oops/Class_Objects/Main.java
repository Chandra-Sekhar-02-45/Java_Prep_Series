package Oops.Class_Objects;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();  // Creating an object of Car ,  Object 1
        car1.brand = "Toyota";
        car1.topSpeed = 320;

        Car car2 = new Car(); // Object 2
        car2.brand = "BMW";
        car2.topSpeed = 350;

        car1.display(); //Calling a method
        car2.display();
    }
}

