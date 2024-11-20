//Nicolas Caraballo
public class Vehicle {
	//instance variables
	private String manufacturerName;
	private int cylinders;
	private String ownerName;
	
	//default constructor
	public Vehicle() {
		this.manufacturerName = "none";
		this.cylinders = 1;
		this.ownerName = "none";
	}
	
	//paremeterized constructor
	public Vehicle(String xManufacturer, int xCylinders, String xOwner) {
		this.setManufacturer(xManufacturer);
		this.setCylinders(xCylinders);
		this.setOwner(xOwner);
	}
	
	//accessor for manufacturer variable
	public String getManufacturer() {
		return this.manufacturerName;
	}
	
	//accessor for cylinder variable
	public int getCylinders() {
		return this.cylinders;
	}
	
	//accessor fro owner variable
	public String getOwner() {
		return this.ownerName;
	}
	
	//mutator for manufacturer variable
	public void setManufacturer(String xManufacturer) {
		this.manufacturerName = xManufacturer;
	}
	
	//mutator for cylinder variable
	public void setCylinders(int xCylinders) {
		//input validation
		if(xCylinders > 0) {
			this.cylinders = xCylinders;
		} else {
			System.out.println("Invalid cylinder amount entered!");
		}
	}
	
	//mutator for owner variable
	public void setOwner(String xOwner) {
		this.ownerName = xOwner;
	}
	
	//comparrison method
	public boolean equals(Vehicle vehicle2) {
		return this.manufacturerName.equalsIgnoreCase(vehicle2.manufacturerName) && this.cylinders == vehicle2.cylinders && this.ownerName.equalsIgnoreCase(vehicle2.ownerName);
	}
	
	//printing method
	public String toString() {
		return "Menufacturer name: "+this.manufacturerName+"\nCylinders: "+this.cylinders+"\nOwner name: "+this.ownerName;
	}
}
