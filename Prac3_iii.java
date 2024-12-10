// Practical No. -- 3 (iii)
// Write a program that implements two constructors in the class. We call the other constructor using ‘this’ pointer, from the default constructor of the class.

public class Prac3_iii {
    int a;
    int b;

    // Default constructor
    public Prac3_iii() {
	// Calling the parameterized constructor using 'this'
        this(10, 30); 
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public Prac3_iii(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Parameterized constructor called: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
	// Creating object using default constructor
        Prac3_iii obj = new Prac3_iii(); 
        System.out.println("Object created. Values after default constructor: a = " + obj.a + ", b = " + obj.b);
    }
}
