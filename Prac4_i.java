// Practical No. -- 4 (i)
// Write a program in Java to demonstrate single inheritance, multilevel inheritance, and hierarchical inheritance.

class Pr1_Parent 
{
	Pr1_Parent() 
	{
		System.out.println("\nParent class constructor called!");
	}
}

class Child extends Pr1_Parent 
{
	Child() 
	{
        	System.out.println("Child class constructor called! - Single Inheritance");
	}
}

class Child2 extends Pr1_Parent 
{
	Child2() 
	{
        	System.out.println("Child2 class constructor called! - Hierarchical Inheritance");
    	}
}

class Subchild extends Child 
{
	Subchild() 
	{
        	System.out.println("Subchild class constructor called! - Multilevel Ineheritance");
	}
}

public class Prac4_i 
{
	public static void main(String[] args) 
	{
		new Subchild();
    	}
}