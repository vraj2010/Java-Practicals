// Practical No. -- 8 (v)
// Student Manager using BufferedReader and BufferedWriter

import java.io.*; 
import java.util.ArrayList; 
import java.util.List; 

class Student { 
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

    @Override
    public String toString() { 
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}"; 
    } 
} 

public class Prac8_v { 
    // Write student data to a file 
    public static void writeStudentsToFile(List<Student> students, String fileName) { 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) { 
            for (Student student : students) { 
                writer.write(student.getId() + "," + student.getName() + "," + student.getAge()); 
                writer.newLine(); // Add a new line for each student 
            } 
            System.out.println("Student data saved to file.");
        } catch (IOException e) { 
            System.out.println("Error writing to file: " + e.getMessage()); 
        } 
    } 

    // Read student data from a file 
    public static List<Student> readStudentsFromFile(String fileName) { 
        List<Student> students = new ArrayList<>(); 
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { 
            String line; 
            while ((line = reader.readLine()) != null) { 
                String[] parts = line.split(","); 
                if (parts.length == 3) { 
                    try { 
                        int id = Integer.parseInt(parts[0]); 
                        String name = parts[1]; 
                        int age = Integer.parseInt(parts[2]); 
                        students.add(new Student(id, name, age)); 
                    } catch (NumberFormatException e) { 
                        System.out.println("Error parsing student data: " + e.getMessage()); 
                    } 
                } else { 
                    System.out.println("Skipping invalid line: " + line); 
                } 
            } 
            System.out.println("Student data loaded from file."); 
        } catch (IOException e) { 
            System.out.println("Error reading from file: " + e.getMessage()); 
        } 
        return students; 
    } 

    public static void main(String[] args) { 
        List<Student> students = new ArrayList<>(); 
        students.add(new Student(1, "Vraj Patel", 20)); 
        students.add(new Student(2, "Vidhi Dave", 18));
        String fileName = "Prac8_v.txt"; 

        // Write students to file 
        writeStudentsToFile(students, fileName); 

        // Read students from file 
        List<Student> loadedStudents = readStudentsFromFile(fileName); 
        System.out.println("Loaded Students:"); 
        for (Student student : loadedStudents) { 
            System.out.println(student); 
        } 
    } 
}
