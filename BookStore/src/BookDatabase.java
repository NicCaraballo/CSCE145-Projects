import java.util.Scanner;
public class BookDatabase {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		Bookshelf bk = new Bookshelf();
		
		boolean quit = false;
		
		while(quit == false) {
			System.out.println("Welcome to the Gamecock Library! "
					+ "\nEnter 1 to add a book "
					+ "\nEnter 2 to remove a book "
					+ "\nEnter 3 for the book list in the library "
					+ "\nEnter 4 to exit the library");
			int choice = key.nextInt();
			key.nextLine();
			
			switch(choice) {
				case 1: //adds a book
					//asks for and stores the book's title
					System.out.println("Enter the title of the book");
					String title = key.nextLine();
					
					//asks for and stores the book's genre
					System.out.println("Enter the genre of the book");
					String genre = key.nextLine();
					
					//asks for and stores the book's author
					System.out.println("Enter the author of the book");
					String author = key.nextLine();
					
					//asks for and stores the book's price
					System.out.println("Enter the price of the book");
					double price = key.nextDouble();
					key.nextLine();
					
					//ceates the book and inserts it into the booksehlf
					bk.insertBook(title, genre, author, price);
					break;
				case 2: //deletes a book
					//asks for and stores the book's title
					System.out.println("Enter the title of the book");
					title = key.nextLine();
					
					//asks for and stores the book's genre
					System.out.println("Enter the genre of the book");
					genre = key.nextLine();
					
					//asks for and stores the book's author
					System.out.println("Enter the author of the book");
					author = key.nextLine();
					
					//asks for and stores the book's price
					System.out.println("Enter the price of the book");
					price = key.nextDouble();
					key.nextLine();
					
					//deletes a book matching the description entered by the user
					bk.deleteBook(new Book(title, genre, author, price));
					break;
				case 3: //view the library
					//prints all the books on the booksehfl
					System.out.println(bk.toString());
					break;
				case 4:
					//ends the code
					quit = true;
					break;
				default:
					//input validation
					System.out.println("Invalid choice!");
			} //end of switch case
		} //end of while loop
		System.out.println("Enjoy your books!");
	} //end of main method

} //end of class
