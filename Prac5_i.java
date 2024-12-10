// Practical No. -- 5 (i)
// Write a program that implements simple example of Runtime Polymorphism with multilevel inheritance.

// Base class for different animals.
class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class that extends Animal and overrides sound method.
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

// Further derived class that extends Cat and overrides sound method.
class Dog extends Cat {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

// Main class to demonstrate runtime polymorphism with multilevel inheritance.
public class Prac5_i {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        System.out.print("Animal reference holding Dog object: ");
        myAnimal.sound(); // Calls Dog's sound method

        Cat myCat = new Dog();
        System.out.print("Cat reference holding Dog object: ");
        myCat.sound(); // Calls Dog's sound method

        Dog myDog = new Dog();
        System.out.print("Dog reference holding Dog object: ");
        myDog.sound(); // Calls Dog's sound method
    }
}
