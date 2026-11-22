// This program reads a CSV file of student marks, uses a Map to process the data,
// and writes a summary report to a new text file.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataProcessor {
	public static void main(String[] args) {
		Map<String, String> results = new HashMap<>();
		String inputFile = "students.csv";
		String outputFile = "report.txt";
		double totalMarks = 0;
		int studentCount = 0;

		try (Scanner scanner = new Scanner(new File(inputFile))) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split(",");

				if (parts.length == 3) {
					String name = parts[1].trim();
					int marks = Integer.parseInt(parts[2].trim());
					totalMarks += marks;
					studentCount++;
					results.put(name, marks >= 50 ? "PASSED" : "FAILED");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Input file not found.");
			return;
		} catch (NumberFormatException e) {
			System.out.println("Error: The file contains non-numeric marks.");
			return;
		}

		try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
			writer.println("=== EXAMINATION REPORT ===");
			writer.println("Total Students Processed: " + studentCount);
			writer.println("Class Average: " + (studentCount == 0 ? 0 : totalMarks / studentCount));
			writer.println("--------------------------------");

			for (Map.Entry<String, String> entry : results.entrySet()) {
				writer.println("Student: " + entry.getKey() + " | Result: " + entry.getValue());
			}

			System.out.println("Data processing complete! Check '" + outputFile + "' for results.");
		} catch (IOException e) {
			System.out.println("Error writing report file: " + e.getMessage());
		}
	}
}
