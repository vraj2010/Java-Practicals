// Practical No. -- 7 (iv)
// Banking Application

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nDeposited: Rs. " + amount + " | Current Balance: Rs. " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawn: Rs. " + amount + " | Current Balance: Rs. " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class Prac7_iv {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0.00);

        try {
            account.deposit(1000.00);
            account.withdraw(400.00);
            account.withdraw(300.00);
            account.withdraw(500.00);  // This will throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
