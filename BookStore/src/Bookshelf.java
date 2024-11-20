
public class Bookshelf {
	private Book[] books;
	
	public static final int MAX = 50;
	
	public Bookshelf() {
		books = new Book[MAX];
	}
	
	public Bookshelf(int count) {
		if(count > 0) {
			books = new Book[count];
		}
	}
	
	//method that returns an array of type Book
	public Book[] getBooks() {
		return this.books;
		
	}
	
	public void insertBook(String xTitle, String xGenre, String xAuthor, double xPrice) {
		for(int i = 0; i<books.length; i++) {
			if(books[i] == null) {
				books[i] = new Book(xTitle, xGenre, xAuthor, xPrice);
				break;
			} else if((i+1) == books.length) {
				System.out.println("Bookshelf is full, cannot add a new book");
			}
		}
	}
	
	public void deleteBook(Book bk) {
		for(int i = 0; i < books.length; i++) {
			if(books[i] != null && books[i].equals(bk)) {
				books[i] = null;
				break;
			} else if((i+1) == books.length){
				System.out.println("book not found");
			}
		}
	}
	
	public boolean equals(Bookshelf shelf) {
		for(int i = 0; i < books.length; i++) {
			if((books[i] == null && shelf.getBooks()[i] != null) || books[i].equals(shelf.getBooks()[i]) == false) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i<books.length; i++){
			if(books[i] != null) {
				result += books[i].toString()+"\n";
			}
		}
		return result;
	}
}
