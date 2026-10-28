// This program simulates a simple M-Pesa agent menu using a switch statement.

import java.util.Scanner; // Import the Scanner class for user input.

public class MpesaMenu {
	public static void main(String[] args) {

		// Create a Scanner object to read input from the keyboard.
		Scanner scanner = new Scanner(System.in);

		// Display the menu options.
		System.out.println("=== M-PESA AGENT MENU ===");
		System.out.println("1. Check Balance");
		System.out.println("2. Send Money");
		System.out.println("3. Withdraw Cash");
		System.out.println("4. Exit");
		System.out.print("Enter your choice (1-4): ");

		// Read the user's choice as an integer.
		int choice = scanner.nextInt();

		// Use a switch statement to handle the choice.
		switch (choice) {
			// Case 1: Check Balance.
			case 1:
				System.out.println("Your balance is KSh 10,000.00");
				break;

			// Case 2: Send Money.
			case 2:
				System.out.println("Send Money selected.");
				break;

			// Case 3: Withdraw Cash.
			case 3:
				System.out.println("Withdraw Cash selected.");
				break;

			// Case 4: Exit.
			case 4:
				System.out.println("Thank you for using M-Pesa. Goodbye!");
				break;

			// Handle any input not matching 1-4.
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 4.");
				break;
		}

		// Close the scanner to free resources.
		scanner.close();
	}
}
