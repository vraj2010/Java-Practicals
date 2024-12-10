// Practical No. -- 3 (v)
// Write a program in Java to develop overloaded constructor. Also develop the copy constructor to create a new object with the state of the existing object.

public class Prac3_v {
    private int number;

    // Default constructor
    public Prac3_v() {
        this.number = 20;
        System.out.println("Default constructor: number = 20");
    }

    // Parameterized constructor
    public Prac3_v(int number) {
        this.number = number;
        System.out.println("Parameterized constructor: number = " + number);
    }

    // Copy constructor
    public Prac3_v(Prac3_v obj) {
        this.number = obj.number;
        System.out.println("Copy constructor: number = " + obj.number);
    }

    public void displayNumber() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        Prac3_v obj1 = new Prac3_v(); // Default constructor
        Prac3_v obj2 = new Prac3_v(10); // Parameterized constructor
        Prac3_v obj3 = new Prac3_v(obj2); // Copy constructor

        System.out.println("\nDisplaying numbers:");
        obj1.displayNumber(); 
        obj2.displayNumber(); 
        obj3.displayNumber(); 
    }
}
