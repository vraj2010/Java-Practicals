// Practical No. -- 2 (ii)
// Write a program to enter two numbers and perform mathematical operations on them.

import java.util.Scanner;

class Prac2_ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("\nEnter Number 1 : ");
        a = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        b = sc.nextInt();

        System.out.println("\nAddition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
    }
}
