// This program determines a student's grade based on marks.
// It uses nested if-else to first validate the marks, then assign a grade.

public class StudentGrade {
	public static void main(String[] args) {
		// Declare an integer variable for marks and assign it the value 75.
		int marks = 65;

		// Check whether marks are within the valid range (0 to 100).
		if (marks >= 0 && marks <= 100) {
			// Determine the grade using nested if-else statements.
			if (marks >= 70) {
				System.out.println("Grade: A");
			} else if (marks >= 60) {
				System.out.println("Grade: B");
			} else if (marks >= 50) {
				System.out.println("Grade: C");
			} else if (marks >= 40) {
				System.out.println("Grade: D");
			} else {
				System.out.println("Grade: F (Fail)");
			}
		} else {
			System.out.println("Invalid marks! Please enter a value between 0 and 100.");
		}
	}
}
