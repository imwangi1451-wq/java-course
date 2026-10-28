import java.util.Scanner;

public class InteractiveCalculator {
	public static void main(String[] args) {
		// This program demonstrates user input using the Scanner class.
		// It creates an interactive calculator that performs basic operations.
		Scanner scanner = new Scanner(System.in);

		System.out.println("=========================================");
		System.out.println("          INTERACTIVE CALCULATOR         ");
		System.out.println("=========================================");

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("\nHello, " + name + "! Let's do some calculations.\n");

		System.out.print("Enter first number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = scanner.nextDouble();

		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;

		System.out.println("\n=========================================");
		System.out.println("       RESULTS FOR " + name.toUpperCase());
		System.out.println("=========================================");
		System.out.println("First Number: " + num1);
		System.out.println("Second Number: " + num2);
		System.out.println("-----------------------------------------");
		System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
		System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
		System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);

		if (num2 != 0) {
			System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
		} else {
			System.out.println("Division: Cannot divide by zero!");
		}

		int intNum1 = (int) num1;
		int intNum2 = (int) num2;
		if (intNum2 != 0) {
			System.out.println("Modulus: " + intNum1 + " % " + intNum2 + " = " + (intNum1 % intNum2));
		} else {
			System.out.println("Modulus: Cannot divide by zero!");
		}
		System.out.println("=========================================");

		double average = (num1 + num2) / 2;
		double square = num1 * num1;
		System.out.println("\n=== ADDITIONAL CALCULATIONS ===");
		System.out.println("Average of " + num1 + " and " + num2 + " = " + average);
		System.out.println("Square of " + num1 + " = " + square);

		scanner.close();
		System.out.println("\nThank you for using the calculator, " + name + "!");
	}
}
