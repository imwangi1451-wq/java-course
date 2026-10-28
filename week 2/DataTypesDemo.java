public class DataTypesDemo {

	public static void main(String[] args) {

		// ==========================================
		// INTEGER TYPES - used for whole numbers
		// ==========================================

		// byte: 8-bit integer
		byte studentAge = 20;

		// short: 16-bit integer
		short yearOfBirth = 2006;

		// int: used for whole numbers
		int population = 54000000; // Kenya's population

		// long: used for very large whole numbers
		long worldPopulation = 8000000000L;

		// ==========================================
		// DECIMAL TYPES - used for decimal numbers
		// ==========================================

		// float: decimal number with less precision
		float interestRate = 7.5f;

		// double: decimal number with more precision
		double accountBalance = 15000.75;

		// ==========================================
		// CHARACTER TYPE - used for single characters
		// ==========================================

		char grade = 'A';
		char currencySymbol = 'K';

		// ==========================================
		// BOOLEAN TYPE - true or false
		// ==========================================

		boolean isActive = true;
		boolean isVerified = false;

		// ==========================================
		// STRING TYPE - used for text
		// ==========================================

		String studentName = "Alice Wanjiku";
		String courseName = "Object-Oriented Programming";

		// ==========================================
		// PRINTING ALL VARIABLES
		// ==========================================

		System.out.println("=== INTEGER TYPES ===");
		System.out.println("Student Age (byte): " + studentAge);
		System.out.println("Year of Birth (short): " + yearOfBirth);
		System.out.println("Kenya Population (int): " + population);
		System.out.println("World Population (long): " + worldPopulation);

		System.out.println("\n=== DECIMAL TYPES ===");
		System.out.println("Interest Rate (float): " + interestRate + "%");
		System.out.println("Account Balance (double): KSh " + accountBalance);

		System.out.println("\n=== CHARACTER TYPE ===");
		System.out.println("Grade (char): " + grade);
		System.out.println("Currency Symbol (char): " + currencySymbol);

		System.out.println("\n=== BOOLEAN TYPE ===");
		System.out.println("Is Active (boolean): " + isActive);
		System.out.println("Is Verified (boolean): " + isVerified);

		System.out.println("\n=== STRING TYPE ===");
		System.out.println("Student Name (String): " + studentName);
		System.out.println("Course Name (String): " + courseName);
	}
}
