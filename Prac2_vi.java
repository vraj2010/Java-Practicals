// Practical No. -- 2 (vi)
// Java Program to Find Largest Number in an array.

import java.util.Scanner;

public class Prac2_vi
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("\nEnter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] > max) 
            {
                max = numbers[i];
            }
        }

        System.out.println("\nThe largest number in the array is: " + max);
    }
}



