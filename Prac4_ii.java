// Practical No. -- 4 (ii)
// Java Program to demonstrate the real scenario (e.g., bank) of Java Method Overriding where three classes are overriding the method of a parent class. Creating a parent class.

class BankAccount {
    public void calculateInterest() {
        System.out.println("Generic interest calculation.");
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void calculateInterest() {
        System.out.println("Interest for Savings Account.");
    }
}

class CheckingAccount extends BankAccount {
    @Override
    public void calculateInterest() {
        System.out.println("Interest for Checking Account.");
    }
}

class BusinessAccount extends BankAccount {
    @Override
    public void calculateInterest() {
        System.out.println("Interest for Business Account.");
    }
}

public class Prac4_ii {
    public static void main(String[] args) {
        System.out.println("Calculating interests:");
        
        BankAccount savings = new SavingsAccount();
        BankAccount checking = new CheckingAccount();
        BankAccount business = new BusinessAccount();
        
        savings.calculateInterest();
        checking.calculateInterest();
        business.calculateInterest();
    }
}
