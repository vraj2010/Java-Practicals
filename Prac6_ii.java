// Practical No. -- 6 (ii)
// Abstract Class - Employee

import java.util.Scanner;

abstract class Employee {
    abstract double sal();
    abstract void info(); 
}

class Manager extends Employee {
    private double base, bonus;

    Manager(double base, double bonus) {
        this.base = base;
        this.bonus = bonus;
    }

    @Override
    double sal() {
        return base + bonus;
    }

    @Override
    void info() {
        System.out.printf("Manager's Details:%nBase Salary: $%.2f%nBonus: $%.2f%nTotal Salary: $%.2f%n%n", base, bonus, sal());
    }
}

class Programmer extends Employee {
    private double base;
    private int proj;

    Programmer(double base, int proj) {
        this.base = base;
        this.proj = proj;
    }

    @Override
    double sal() {
        return base + 500 * proj;
    }

    @Override
    void info() {
        System.out.printf("Programmer's Details:%nBase Salary: $%.2f%nNumber of Projects: %d%nTotal Salary: $%.2f%n%n", base, proj, sal());
    }
}

public class Prac6_ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Manager:");
        System.out.print("Base Salary: $");
        double mBase = sc.nextDouble();
        System.out.print("Bonus: $");
        double mBonus = sc.nextDouble();
        Manager manager = new Manager(mBase, mBonus);

        System.out.println("\nEnter details for Programmer:");
        System.out.print("Base Salary: $");
        double pBase = sc.nextDouble();
        System.out.print("Number of Projects: ");
        int pProj = sc.nextInt();
        Programmer programmer = new Programmer(pBase, pProj);

        System.out.println("\nEmployee Details:");
        manager.info();
        programmer.info();

    }
}
