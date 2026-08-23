package mindcraft.Assignment_19;

public class Account {

    private double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }

    // Withdraw method
    public void withdraw(double amount)
            throws OverLimitException, InsufficientBalanceException {

        // Check transaction limit
        if (amount > 15000) {
            throw new OverLimitException(
                    "You cannot withdraw more than Rs.15000 in one transaction."
            );
        }

        // Check balance
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance."
            );
        }

        balance = balance - amount;

        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}