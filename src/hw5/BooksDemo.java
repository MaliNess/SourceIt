package hw5;

import com.sun.xml.internal.ws.transport.http.DeploymentDescriptorParser;

public class BooksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String DEMOAUTHOR = "Stephenie Meyer";
		final String DEMOPRESS = "KM Books Publishing Group";
		final int DEMOYEAR = 2013;

		Book b = new Book();
		b.setName("Pride and Prejudice");
		b.setAuthors("Jane Austen");
		b.setCover("Soft");
		b.setPages(416);
		b.setPress("KM Books Publishing Group");
		b.setPrice(2.43);
		b.setYear(2015);

		Book b1 = new Book("Breaking dawn", "Stephenie Meyer", "Atom", 2010, 706, 10.48, "Paperback");
		Book b2 = new Book("Alice in the country of Hearts vol 1", "QuinRose, Riko Sakura", "Jason DeAngelis", 2015,
				230, 13.99, "Paperback ");
		Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "KM Books Publishing Group", 2015, 176, 2.06,
				"Paperback");
		Book b4 = new Book("Twilight", "Stephenie Meyer", "Atom", 2009, 480, 10.48, "Paperback");
		Book b5 = new Book("Death Note vol 1", "Tsugumi Ohba, Takeshi Obata", "ShonenJump Advanced", 2012, 200, 10.0,
				"Paperback");
		Book b6 = new Book("New Moon", "Stephenie Meyer", "Atom", 2009, 500, 10.48, "Paperback");
		Book b7 = new Book("Harry Potter and the cursed child", "J.K. Rowling, John Tiffany & Jack Thorne",
				"Little Brown", 2016, 344, 26.24, "Hardback");
		Book b8 = new Book("Eclipse", "Stephenie Meyer", "Atom", 2010, 564, 10.48, "Paperback");

		Book[] allBooks = { b, b1, b2, b3, b4, b5, b6, b7, b8 };

		System.out.println("Books:\n");
		for (int i = 0; i < allBooks.length; i++) {
			System.out.println(allBooks[i].toString());
			System.out.println();
		}

		System.out.println("=============================================");
		BookArrayCreator bac = new BookArrayCreator();
		Book[] sortByAuthor = bac.byAuthor(DEMOAUTHOR, allBooks);
		System.out.println("Sorted by author " + DEMOAUTHOR + ":\n");
		for (int i = 0; i < sortByAuthor.length; i++) {
			System.out.println("Book #" + (i + 1) + ":");
			System.out.println(sortByAuthor[i].toString());
			;
			System.out.println();
		}
		System.out.println("=============================================");
		Book[] sortByPress = bac.byPress(DEMOPRESS, allBooks);
		System.out.println("Sorted by press " + DEMOPRESS + ":\n");
		for (int i = 0; i < sortByPress.length; i++) {
			System.out.println("Book #" + (i + 1) + ":");
			System.out.println(sortByPress[i].toString());
			;
			System.out.println();
		}
		System.out.println("=============================================");
		Book[] sortByYear = bac.byYear(DEMOYEAR, allBooks);
		System.out.println("Sorted by published after year " + DEMOYEAR + ":\n");
		for (int i = 0; i < sortByYear.length; i++) {
			System.out.println("Book #" + (i + 1) + ":");
			System.out.println(sortByYear[i].toString());
			;
			System.out.println();
		}

	}

}
