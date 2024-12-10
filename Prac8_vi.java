// Practical No. -- 8 (vi)
// Manipulate the information from files by using the Reader and Writer class.

import java.io.*; 

public class Prac8_vi { 
    public static void main(String[] args) { 
        try { 
            // Create a FileReader to read from a file 
            FileReader reader = new FileReader("Prac8_vi.txt"); 
            // Create a FileWriter to write to a file 
            FileWriter writer = new FileWriter("Prac8_viOUTPUT.txt"); 

            // Read and manipulate data 
            int character; 
            while ((character = reader.read()) != -1) { 
                // Convert lowercase letters to uppercase 
                if (Character.isLowerCase(character)) { 
                    character = Character.toUpperCase(character); 
                } 
                // Write the manipulated character to the output file 
                writer.write(character); 
            } 

            // Close the reader and writer 
            reader.close(); 
            writer.close(); 
            System.out.println("File manipulation complete."); 
            
        } catch (IOException e) { 
            System.out.println("An error occurred: " + e.getMessage()); 
        } 
    } 
}
