package hw5;

public class BooksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Books:\n");
		
		Book b = new Book("Pride and Prejudice");
		b.setAuthors("Jane Austen");
		b.setCover("Soft");
		b.setPages(416);
		b.setPress("KM Books Publishing Group");
		b.setPrice(65.00);
		b.setYear(2015);
		System.out.println(b.toString());
		System.out.println();
		
		Book b1 = new Book("Pride and Prejudice1");
		b1.setAuthors("Jane Austen");
		b1.setCover("Soft");
		b1.setPages(416);
		b1.setPress("KM Books Publishing Group1");
		b1.setPrice(65.00);
		b1.setYear(2016);
		System.out.println(b1.toString());
		System.out.println();
		
		Book b2 = new Book("Pride and Prejudice2");
		b2.setAuthors("Jane Austen2");
		b2.setCover("Soft");
		b2.setPages(416);
		b2.setPress("KM Books Publishing Group");
		b2.setPrice(65.00);
		b2.setYear(2016);
		System.out.println(b2.toString());
		System.out.println();
		
		System.out.println();
		BookArrayCreator bac = new BookArrayCreator();
		Book[] sortByAuthor = bac.byAuthor("Jane Austen",b,b1,b2);
		System.out.println("Sorted by author Jane Austen:\n");
		for (int i = 0; i < sortByAuthor.length; i++) {
			if(sortByAuthor[i] == null) break;
			System.out.println("Book #" + (i+1) + ":");
			System.out.println(sortByAuthor[i].toString());;
			System.out.println();
		}
		
		Book[] sortByPress = bac.byPress("KM Books Publishing Group",b,b1,b2);
		System.out.println("Sorted by press KM Books Publishing Group:\n");
		for (int i = 0; i < sortByPress.length; i++) {
			if(sortByPress[i] == null) break;
			System.out.println("Book #" + (i+1) + ":");
			System.out.println(sortByPress[i].toString());;
			System.out.println();
		}
		
		Book[] sortByYear = bac.byYear(2015,b,b1,b2);
		System.out.println("Sorted by year 2015:\n");
		for (int i = 0; i < sortByPress.length; i++) {
			if(sortByPress[i] == null) break;
			System.out.println("Book #" + (i+1) + ":");
			System.out.println(sortByYear[i].toString());;
			System.out.println();
		}
		
	}

}
