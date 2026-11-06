public class BankTest {
	public static void main(String[] args) {
		System.out.println("=== OPENING ACCOUNT ===");

		// Create a new account with an initial balance of 5000
		BankAccount myAccount = new BankAccount("ACC-001", "Alice Wanjiku", 5000.00);
		System.out.println("Account Number: " + myAccount.getAccountNumber());
		System.out.println("Account Holder: " + myAccount.getAccountHolder());
		System.out.println("Initial Balance: KSh " + myAccount.getBalance());

		System.out.println("\n=== DEPOSITING ===");
		myAccount.deposit(2500.50);
		myAccount.deposit(-100); // Should fail (negative amount)

		System.out.println("\n=== WITHDRAWING ===");
		myAccount.withdraw(2000);
		myAccount.withdraw(10000); // Should fail (insufficient funds)
		myAccount.withdraw(-50); // Should fail (negative amount)

		System.out.println("\n=== FINAL STATE ===");
		System.out.println("Final Balance: KSh " + myAccount.getBalance());
	}

	private static class BankAccount {
		private final String accountNumber;
		private final String accountHolder;
		private double balance;

		BankAccount(String accountNumber, String accountHolder, double initialBalance) {
			if (initialBalance < 0) {
				throw new IllegalArgumentException("Initial balance cannot be negative.");
			}
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
			this.balance = initialBalance;
		}

		String getAccountHolder() {
			return accountHolder;
		}

		String getAccountNumber() {
			return accountNumber;
		}

		double getBalance() {
			return balance;
		}

		void deposit(double amount) {
			if (amount <= 0) {
				System.out.println("Deposit amount must be positive.");
				return;
			}
			balance += amount;
		}

		void withdraw(double amount) {
			if (amount <= 0) {
				System.out.println("Withdrawal amount must be positive.");
			} else if (amount > balance) {
				System.out.println("Insufficient funds.");
			} else {
				balance -= amount;
			}
		}
	}
}
