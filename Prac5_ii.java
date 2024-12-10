// Practical No. -- 5 (ii)
// Write a program to compute if one string is a rotation of another. For example, pit is rotation of tip as pit has same character as tip.

import java.util.Scanner;

public class Prac5_ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        boolean isRotation = isRotation(str1, str2);
        System.out.println(str1 + " is a rotation of " + str2 + ": " + isRotation);

    }

    public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null) {
            System.out.println("One or both strings are null.");
            return false;
        }
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        String combined = str2 + str2;
        return combined.contains(str1);
    }
}

