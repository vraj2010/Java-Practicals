// Practical No. -- 8 (ii)
// Read content from a file convert it to uppercase and save it into another file.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prac8_ii {

    public static void main(String[] args) {
        // Specify the input and output file names
        String inputFile = "Prac8_ii.txt";
        String outputFile = "Prac8_ii_UC.txt";

        // Call the method to convert the file content to uppercase
        convertToUppercase(inputFile, outputFile);
    }

    public static void convertToUppercase(String inputFile, String outputFile) {
        // Using try-with-resources to automatically close resources
        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream = new FileOutputStream(outputFile)) {

            int byteRead;

            // Read each byte from the input file
            while ((byteRead = inputStream.read()) != -1) {
                // Convert to uppercase if it's a lowercase letter
                if (byteRead >= 'a' && byteRead <= 'z') {
                    byteRead -= 32; // Convert lowercase to uppercase
                }
                // Write the byte to the output file
                outputStream.write(byteRead);
            }

            System.out.println("Conversion to UPPERCASE completed successfully!");

        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
        }
    }
}
