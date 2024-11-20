
public class Book {
	private String title;
	private String genre;
	private String author;
	private double price;
	
	public Book() {
		this.title = "unknow";
		this.genre = "Unclassified";
		this.author = "anonymous";
		this.price = 1;
	}
	
	public Book(String xTitle, String xGenre, String xAuthor, double xPrice) {
		this.setTitle(xTitle);
		this.setGenre(xGenre);
		this.setAuthor(xAuthor);
		this.setPrice(xPrice);
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setTitle(String xTitle) {
		this.title = xTitle;
	}
	
	public void setGenre(String xGenre) {
		this.genre = xGenre;
	}
	
	public void setAuthor(String xAuthor) {
		this.author = xAuthor;
	}
	
	public void setPrice(double xPrice) {
		this.price = xPrice;
	}
	
	public boolean equals(Book bk) {
		return this.title.equalsIgnoreCase(bk.getTitle()) && this.author.equalsIgnoreCase(bk.getAuthor()) && this.genre.equalsIgnoreCase(bk.getGenre()) && this.price == bk.getPrice();
	}
	
	public String toString() {
		return "Title: "+this.title+"\nGenre: "+this.genre+"\nAuthor: "+this.author+"\nPrice: "+this.price;
	}
}
