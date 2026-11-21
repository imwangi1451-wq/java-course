// This program demonstrates how to create and use custom exceptions
// in a real-world banking scenario.

// A checked exception that reports how much a withdrawal exceeds the balance.
class InsufficientFundsException extends Exception {
    private final double shortfall;

    public InsufficientFundsException(String message, double shortfall) {
        super(message);
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientFundsException(
                "Withdrawal failed. Insufficient funds.", shortfall
            );
        }

        balance -= amount;
        System.out.println("Successfully withdrew: KSh " + amount);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0);
        System.out.println("Current Balance: KSh " + account.getBalance());

        try {
            System.out.println("\nAttempting to withdraw KSh 10,000...");
            account.withdraw(10000.0);
        } catch (InsufficientFundsException e) {
            System.out.println("TRANSACTION DECLINED!");
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("You are short by: KSh " + e.getShortfall());
        }

        System.out.println("\nChecking final balance: KSh " + account.getBalance());
    }
}