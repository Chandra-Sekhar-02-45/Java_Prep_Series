package Oops.Class_Objects;

// Class :
//A class is a user-defined blueprint or prototype from which objects are created.
// It represents a group of related properties (variables) and behaviours (methods).

//Objects :
// An object is a real-world instance of a class.
//It has its own state (data) and behavior (methods) as defined by the class blueprint.

public class Car {

    // Attributes (Fields / Properties)
    String brand;
    int topSpeed;

    // Behavior (Method)
    void display() {
        System.out.println( brand + " Car Top Speed is  " + topSpeed + " km/h." );
    }
}
