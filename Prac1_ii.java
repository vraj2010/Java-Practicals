// Practical No. -- 1 (ii)
// Write a Java program to print the sum of two numbers.

import java.util.Scanner;

class Prac1_ii
{
	public static void main(String args[])
	{
		int a,b,x;

		Scanner sc=new Scanner(System.in);

		System.out.println("\n");
		System.out.println("Enter Number 1 : ");
		a=sc.nextInt();

		System.out.println("\n");
		System.out.println("Enter Number 2 : ");
		b=sc.nextInt();

		x = a+b;
		System.out.println("\n");
		System.out.println("Sum of Number 1 and Number 2 : "+x);

	}
}
