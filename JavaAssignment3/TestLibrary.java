package JavaAssignment3;

public class TestLibrary {

	public static void main(String[] args) {

		Library library = new Library(5);

		library.addBook(new Book("Adventures of Tom Sawyer", "Mark Twain", 1994));
		library.addBook(new Book("Time Machine", "H.G. Wells", 1997));
		library.addBook(new Book("Anna Karenina", "Leo Tolstoy", 2001));
		library.addBook(new Book("Ben Hur", "Lewis Wallace", 2003));

		library.displayBooks();

		library.removeBook("Anna Karenina");

		library.displayBooks();
	}

}
