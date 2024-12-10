// Practical No. -- 4 (iii)
// Write a java program for the use of super and this keyword.

class Parent {
    int value;

    public Parent(int value) {
        this.value = value;
        System.out.println("Parent constructor called. Value set to: " + value);
    }

    public void show() {
        System.out.println("Parent value: " + value);
    }
}

class Child extends Parent {
    int value;

    public Child(int parentValue, int childValue) {
	// Calling the parent class constructor
        super(parentValue);
	// Initializing the child class field 
        this.value = childValue; 
        System.out.println("Child constructor called. Parent value: " + parentValue + ", Child value: " + childValue);
    }

    @Override
    public void show() {
	// Calling the parent class method
        super.show(); 
        System.out.println("Child value: " + value);
    }
}

public class Prac4_iii {
    public static void main(String[] args) {
        System.out.println("Creating Child object...");
        new Child(20, 50).show();
    }
}
