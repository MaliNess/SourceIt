package hw5;

public class Book {

	private int id;
	private String name;
	private String authors;
	private String press;
	private int year;
	private int pages;
	private double price;
	private String cover;
	
	private static int idCounter=0;
	private final int FIRSTBOOKYEAR = 868;
	private final int CURRENTYEAR = 2018;
	
	public Book() {
		idCounter++;
		this.id = idCounter;
	}

	public Book(String name) {
		if(name!=null) this.setName(name);
		idCounter++;
		this.id = idCounter;
	}
	
	public Book(String name, String authors) {
		if(name!=null) this.setName(name);
		if(authors!=null) this.setAuthors(authors);
		idCounter++;
		this.id = idCounter;
	}
	
	public Book(String name, String authors, String press) {
		this.setName(name);
		this.setAuthors(authors);
		this.setPress(press);
		idCounter++;
		this.id = idCounter;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		if(name==null) System.out.println("Name was not inputed!");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthors() {
		if(authors==null) System.out.println("Authors were not inputed!");
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String author) {
		if(author!=null) {
			if(this.authors==null) this.authors = author;
			else this.authors += " " + author;
		}
	}

	public String getPress() {
		if(press==null) System.out.println("Press was not inputed!");
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getYear() {
		if(year == 0) System.out.println("Year was not inputed!");
		return year;
	}

	public void setYear(int year) {
		if(year>=FIRSTBOOKYEAR && year<=CURRENTYEAR) 
			this.year = year;
		else System.out.println("Incorrect year!");
	}

	public int getPages() {
		if(pages == 0) System.out.println("Number of pages was not inputed!");
		return pages;
	}

	public void setPages(int pages) {
		if(pages > 0) this.pages = pages;
	}

	public double getPrice() {
		if(price == 0) System.out.println("Price was not inputed!");
		return price;
	}

	public void setPrice(double price) {
		if(price > 0) this.price = price;
	}

	public String getCover() {
		if(cover==null) System.out.println("Cover type was not inputed!");
		return cover;
	}

	public void setCover(String cover) {
		if(cover != null) this.cover = cover;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Book id: " + this.getId() +
											"\nName: " + this.getName() + 
											"\nAuthor(s): " + this.getAuthors() +
											"\nPress: " + this.getPress() +
											"\nYear: " + this.getYear() +
											"\nPages: " + this.getPages() +
											"\nPrice: " + this.getPrice() +
											"\nCover: " + this.getCover());
		return sb.toString();
	}
	
}
