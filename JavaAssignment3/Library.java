package JavaAssignment3;

public class Library {
	private Book[] books;
	private int numBooks;

	public Library(int capacity) {
		books = new Book[capacity];
		this.numBooks = 0;
	}

	public void addBook(Book book) {
		if (numBooks < books.length) {
			books[numBooks] = book;
			numBooks++;
			System.out.println("Book added successfully.");
		} else {
			System.out.println("Library is full. Cannot add more books.");
		}
	}

	public void removeBook(String title) {
		for (int i = 0; i < numBooks; i++) {
			if (books[i].getTitle().equals(title)) {
				for (int j = i; j < numBooks - 1; j++) {
					books[j] = books[j + 1];
				}
				books[numBooks - 1] = null;
				numBooks--;
				System.out.println("Book removed successfully.");
			}
		}
		System.out.println("Book not found in the library.");
	}

	public void displayBooks() {
		if (numBooks == 0) {
			System.out.println("Library is empty.");
		} else {
			System.out.println("Books in the library:");
			for (int i = 0; i < numBooks; i++) {
				System.out.println(books[i]);
			}
		}
	}
}
