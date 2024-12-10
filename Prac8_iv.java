// Practical No. -- 8 (iv)
// Student Manager using FileInputStream and FileOutputStream.

import java.io.*; 
import java.util.ArrayList; 
import java.util.List; 

class Student implements Serializable { 
    private int id; 
    private String name; 
    private int age;

    public Student(int id, String name, int age) { 
        this.id = id; 
        this.name = name; 
        this.age = age; 
    } 

    public int getId() { 
        return id; 
    } 

    public String getName() { 
        return name; 
    } 

    public int getAge() { 
        return age; 
    } 

    public void displayInfo() { 
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age); 
    } 
} 

public class Prac8_iv { 
    private static final String FILE_PATH = "Prac8_iv.txt"; 

    public void saveStudents(List<Student> students) {
        try (FileOutputStream fileOut = new FileOutputStream(FILE_PATH); 
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) { 
            out.writeObject(students); 
            System.out.println("Student data saved successfully."); 
        } catch (IOException e) { 
            System.out.println("Error saving student data: " + e.getMessage()); 
        } 
    } 

    @SuppressWarnings("unchecked") 
    public List<Student> loadStudents() { 
        List<Student> students = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(FILE_PATH); 
             ObjectInputStream in = new ObjectInputStream(fileIn)) { 
            students = (List<Student>) in.readObject(); 
        } catch (FileNotFoundException e) { 
            System.out.println("No existing student data found. A new file will be created."); 
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading student data: " + e.getMessage()); 
        } 
        return students; 
    } 

    public void addStudent(Student student) { 
        List<Student> students = loadStudents(); 
        students.add(student); 
        saveStudents(students); 
    } 

    public void displayAllStudents() { 
        List<Student> students = loadStudents(); 
        if (students.isEmpty()) { 
            System.out.println("No student data found."); 
        } else { 
            System.out.println("Student List:"); 
            for (Student student : students) { 
                student.displayInfo(); 
            } 
        } 
    } 

    public static void main(String[] args) { 
        Prac8_iv manager = new Prac8_iv(); 
        manager.addStudent(new Student(1, "Vraj", 20)); 
        manager.addStudent(new Student(2, "Vidhi", 18)); 
        manager.displayAllStudents(); 
    } 
}
