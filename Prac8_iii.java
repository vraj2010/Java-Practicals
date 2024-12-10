// Practical No. -- 8 (iii)
// Remove Duplicate Lines from a file

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prac8_iii {
    public static void main(String[] args) {
        String inputfile = "Prac8_iii.txt";
        String outputfile = "Prac8_iiiOUTPUT.txt";
        
        try (FileInputStream fis = new FileInputStream(inputfile);
             FileOutputStream fos = new FileOutputStream(outputfile)) {
            
            StringBuilder currentline = new StringBuilder();
            int byteData;
            boolean isnewline = false;

            while ((byteData = fis.read()) != -1) {
                char character = (char) byteData;

                if (character == '\n') {
                    isnewline = true;

                    if (currentline.length() > 0) {
                        writeUniqueLine(fos, currentline.toString());
                        currentline.setLength(0);
                    }
                } else {
                    currentline.append(character);
                }
            }
            
            if (currentline.length() > 0) {
                writeUniqueLine(fos, currentline.toString());
            }

            System.out.println("Duplicate lines removed. Check the output file: " + outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeUniqueLine(FileOutputStream fos, String line) throws IOException {
        try (FileInputStream checkFis = new FileInputStream("Prac8_iiiOUTPUT.txt")) {
            StringBuilder existingLines = new StringBuilder();
            int byteData;
            boolean isDuplicate = false;

            while ((byteData = checkFis.read()) != -1) {
                existingLines.append((char) byteData);
            }

            // Check if the line already exists in existingLines
            if (!existingLines.toString().contains(line)) {
                fos.write((line + System.lineSeparator()).getBytes());
            }
        }
    }
}
