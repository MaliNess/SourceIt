package hw5;

import java.util.Arrays;

public class BookArrayCreator {

		public Book[] byAuthor(String author, Book... books) {
			return Arrays.stream(books).filter(book -> book.getAuthors().matches(".*\\b" + author + "\\b.*")).toArray(Book[]::new);
		}
		
		public Book[] byPress(String press, Book... books) {
			return Arrays.stream(books).filter(book -> book.getPress().equals(press)).toArray(Book[]::new);
		}
		
		public Book[] byYear(int year, Book... books) {
			return Arrays.stream(books).filter(book -> book.getYear() > year).toArray(Book[]::new);
		}


}
