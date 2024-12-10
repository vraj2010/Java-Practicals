// Practical No. -- 2 (i)
// You are developing a mathematical tool that requires generating a list of prime numbers. 
// How would you implement a Java program to generate the first n prime numbers?

import java.util.Scanner;
class Prac2_i
{
	public static void main(String arg[])	
	{
		int i, count, n;
		System.out.println("\n");
		System.out.print("Enter a Number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("\n");
		System.out.println("Prime Numbers between 1 to "+n+" : ");
		System.out.println("\n");
		for(int j=2;j<=n;j++)
		{
			count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
	   			{
	        		count++;
	   			}
			}
			if(count==2)
	       		System.out.print(j+"\t");
		}
		System.out.println("\n"); 
	}
}
