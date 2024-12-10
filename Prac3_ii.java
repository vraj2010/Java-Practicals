// Practical No. -- 3 (ii)
// Write a program to show the difference between public and private access specifiers.

public class Prac3_ii 
{
    public static void main(String[] args) 
    {
        // Public access demonstration
        Person person = new Person("Vraj", 18);
        System.out.println("Person name: " + person.getName());

        // Primitive data type (passed by value)
        int number = 10;
        System.out.println("Primitive before: " + number);
        modifyPrimitive(number);
        System.out.println("Primitive after: " + number);

        // Object (passed by reference)
        Person newPerson = new Person("Vidhi", 17);
        System.out.println("Object before: " + newPerson.getName());
        modifyObject(newPerson);
        System.out.println("Object after: " + newPerson.getName());

        // Final keyword usage
        final int constantValue = 100;
        System.out.println("Final constant: " + constantValue);
    }

    public static void modifyPrimitive(int value) {
        value = 20;
    }

    public static void modifyObject(Person person) {
        person.setName("Dharmil");
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
