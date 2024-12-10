// Practical No. -- 3 (iv)
// Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values.


class Parent {
    String name;

    Parent(String name) {
        this.name = name;
        System.out.println("Parent class constructor called.");
    }

    void display() {
        System.out.println("Name in Parent class: " + name);
    }
}

class Child extends Parent {
    String name;

    Child(String parentName, String childName) {
        super(parentName); // Invoking the superclass constructor
        this.name = childName;
        System.out.println("Child class constructor called.");
    }

    @Override
    void display() {
        super.display(); // Calling the superclass display method
        System.out.println("Name in Child class: " + this.name);
    }
}

public class Prac3_iv {
    public static void main(String[] args) {
        System.out.println("Creating Child object...");
        Child obj = new Child("ParentName", "ChildName");
        System.out.println("Displaying values:");
        obj.display();
    }
}
