// This program demonstrates how to read data from a file line-by-line.
// It uses Scanner to read the file and handles missing file errors.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
	public static void main(String[] args) {
		// Read the file created in Task 2.
		String fileName = "transactions.txt";

		try {
			File file = new File(fileName);

			// Read from the file rather than from System.in.
			try (Scanner fileScanner = new Scanner(file)) {
				System.out.println("=== READING FILE: " + fileName + " ===");

				while (fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					System.out.println(line);
				}

				System.out.println("=== FILE READING COMPLETE ===");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: The file '" + fileName + "' was not found.");
		}
	}
}
