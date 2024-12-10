// Practical No. -- 8 (i)
// Read a content from file: calculate number of sentences, words and characters from the file.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class Prac8_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input file name
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int characterCount = 0;
            int wordCount = 0;
            int sentenceCount = 0;
            StringBuilder fileContent = new StringBuilder();
            int i;

            // Read the file content
            while ((i = fis.read()) != -1) {
                char currentChar = (char) i;
                fileContent.append(currentChar);
                characterCount++;

                // Count words (assumes space as word separator)
                if (currentChar == ' ' || currentChar == '\n' || currentChar == '\r') {
                    wordCount++;
                }

                // Count sentences (assumes ., !, ? as sentence terminators)
                if (currentChar == '.' || currentChar == '!' || currentChar == '?') {
                    sentenceCount++;
                }
            }

            // Handle the last word if the file does not end with a space or newline
            if (fileContent.length() > 0) {
                wordCount++;
            }

            System.out.println("\nFile content:\n" + fileContent);
            System.out.println("\nNumber of characters: " + characterCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of sentences: " + sentenceCount);
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
