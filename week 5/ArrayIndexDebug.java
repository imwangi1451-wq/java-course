// This program contains array index errors. Can you find and fix them?

public class ArrayIndexDebug {
	public static void main(String[] args) {

		// Declare an array of 5 elements.
		int[] numbers = {10, 20, 30, 40, 50};

		// ==========================================================
		// BUG 1 FIX: Changed <= to < so the loop stops at length - 1 (index 4)
		// ==========================================================

		System.out.println("=== BUG 1 ===");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}

		// ==========================================================
		// BUG 2 FIX: Replaced hardcoded index [5] with [numbers.length - 1]
		// ==========================================================

		System.out.println("\n=== BUG 2 ===");

		// Access the last element safely.
		System.out.println("Last element: " + numbers[numbers.length - 1]);

		// ==========================================================
		// BUG 3 FIX: Replaced negative index [-1] with [0]
		// ==========================================================

		System.out.println("\n=== BUG 3 ===");

		// Access the first element safely.
		System.out.println("First element: " + numbers[0]);

	}
}
