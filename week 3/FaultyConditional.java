public class FaultyConditional {
	public static void main(String[] args) {

		// Declare a variable for the user's age.
		int age = 20;

		// Check if age is between 18 and 65 (inclusive).
		if (age >= 18 && age <= 65) {
			System.out.println("You are of working age.");
		} else {
			System.out.println("You are not of working age.");
		}
	}
}
