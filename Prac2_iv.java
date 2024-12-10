// Practical No. -- 2 (iv)
// Write a program to accept a line and check how many consonants and vowels are there in line.

import java.util.Scanner;

public class Prac2_iv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a line of text : ");
        String line = sc.nextLine();

        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = Character.toLowerCase(line.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vCount++;
                } else {
                    cCount++;
                }
            }
        }

        System.out.println("\nNumber of Vowels: " + vCount);
        System.out.println("Number of Consonants: " + cCount);
    }
}
