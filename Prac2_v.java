// Practical No. -- 2 (v)
// Write an interactive program to print a string entered in a pyramid form.

import java.util.Scanner;

public class Prac2_v 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a String : ");
        String input = scanner.nextLine();
        int length = input.length();
        System.out.print("\n");
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < length - i - 1; j++)
            {   
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print(input.charAt(k) + " ");
            }
            System.out.println();
        }
    }
}

