public class BookTest {
	private static class Book {
		private final String title;
		private final String author;
		private double price;
		private boolean borrowed;

		Book(String title, String author, double price) {
			this.title = title;
			this.author = author;
			setPrice(price);
		}

		void setPrice(double price) {
			if (price >= 0) {
				this.price = price;
			} else {
				System.out.println("Price cannot be negative.");
			}
		}

		void displayBookInfo() {
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("Price: " + price);
			System.out.println("Borrowed: " + borrowed);
		}

		void borrowBook() {
			if (!borrowed) {
				borrowed = true;
			} else {
				System.out.println("Book is already borrowed.");
			}
		}

		void returnBook() {
			if (borrowed) {
				borrowed = false;
			} else {
				System.out.println("Book was not borrowed.");
			}
		}
	}

	public static void main(String[] args) {
		Book myBook = new Book("Java Programming", "John Doe", 1500.00);

		myBook.displayBookInfo();

		System.out.println("Attempting to change price to -500...");
		myBook.setPrice(-500);

		System.out.println("\nBorrowing the book...");
		myBook.borrowBook();
		myBook.displayBookInfo();

		System.out.println("Returning the book...");
		myBook.returnBook();
		myBook.displayBookInfo();
	}
}
