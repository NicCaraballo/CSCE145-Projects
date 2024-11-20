//Nicolas Caraballo
import java.util.Scanner;
public class ShipNavigator {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to ship navigator!");
		boolean cont = false;
		do {
			//asks for and stores the ships name
			System.out.println("Enter the name of your ship");
			String name = key.nextLine();
			
			//asks for and stores the ships launch date
			System.out.println("Enter its launch date (dd/mm/yyyy)");
			String date = key.nextLine();
			
			//checks for wheter or not the ship is a cruise ship, cargo ship, or an unclassified ship
			System.out.println("Is it a cruise ship, cargo ship, or neither? (enter cruise, cargo, or neither)");
			String shipType = key.nextLine();
			if(shipType.equalsIgnoreCase("cruise")){ //if the ship is a cruise ship
				//asks for and stores the passenger capacity
				System.out.println("Enter the ship's passenger capacity");
				int capacity = key.nextInt();
				
				//asks for and stores the crew size
				System.out.println("How many crew members are on the ship?");
				int crew = key.nextInt();
				
				//creates the cruise ship object
				System.out.println("Creating a cruise ship...");
				Ship cruise = new CruiseShip(name, date, capacity, crew);
				
				//prints info for the cruise ship
				System.out.println("Printing the ship's details");
				System.out.println(cruise.toString());
				key.nextLine();
				
			} else if (shipType.equalsIgnoreCase("cargo")) { //if the ship is a cargo ship
				//checks and stores the ships tonnage
				System.out.println("What is the ship's tonnage?");
				double tonnage = key.nextDouble();
				
				//checks and stores the ships maximum speed
				System.out.println("What is its Maximum speed?(mph)");
				double speed = key.nextDouble();
				
				//creates the cruise ship object
				System.out.println("Creating a cruise ship...");
				Ship cargo = new CargoShip(name, date, tonnage, speed);
				
				//prints info for the cruise ship
				System.out.println("Printing the ship's details");
				System.out.println(cargo.toString());
				key.nextLine();
				
			} else if (shipType.equalsIgnoreCase("neither")) {
				//creates an unclassified ship object
				System.out.println("Creating new unclassified ship...");
				Ship ship = new Ship(name, date);
				
				//prints the unclassified ship's info
				System.out.println("Printing the ship's details");
				System.out.println(ship.toString());
				
			} else {
				//input validation
				System.out.println("Invalid ship type entered!");
			}
			

			//check checks if the user wants to continue
			System.out.println("Would you like to create another ship? (enter yes/no)");
			String answer = key.nextLine();
			if(answer.equalsIgnoreCase("no")) {
				cont = false;
			} else {
				cont = true;
			}
			
		}while(cont == true);
		
		//farewell message
		System.out.println("enjoy the waves!");
	}

}
