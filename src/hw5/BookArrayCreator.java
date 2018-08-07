package hw5;

public class BookArrayCreator {

		public Book[] byAuthor(String author, Book... books) {
			Book[] resArray = new Book[books.length];
			int count = 0;
			for(int i = 0; i<books.length; i++) {
				if(books[i].getAuthors().matches(".*\\b" + author + "\\b.*")) {
					resArray[count] = books[i];
					count++;
				}
			}
			return resArray;
		}
		
		public Book[] byPress(String press, Book... books) {
			Book[] resArray = new Book[books.length];
			int count = 0;
			for(int i = 0; i<books.length; i++) {
				if(books[i].getPress().equals(press)) {
					resArray[count] = books[i];
					count++;
				}
			}
			return resArray;
		}
		
		public Book[] byYear(int year, Book... books) {
			Book[] resArray = new Book[books.length];
			int count = 0;
			for(int i = 0; i<books.length; i++) {
				if(books[i].getYear() > year) {
					resArray[count] = books[i];
					count++;
				}
			}
			return resArray;
		}


}
