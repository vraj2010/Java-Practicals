// Practical No. -- 2 (iii)
// Write a program in to find maximum of three numbers using conditional operator.

import java.util.Scanner;
class Prac2_iii
{
    public static void main(String args[])
    {
        int i,a,b,c,x;

        Scanner sc=new Scanner(System.in);

        System.out.print("\nEnter Number 1 : ");
        a=sc.nextInt();

        System.out.print("\nEnter Number 2 : ");
        b=sc.nextInt();

        System.out.print("\nEnter Number 3 : ");
        c=sc.nextInt();

        x=((a>b)?((a>c)?a:c):(b>c)?b:c);

        System.out.print("\nMaximum Number : "+x);
        System.out.println("\n");
    }
}