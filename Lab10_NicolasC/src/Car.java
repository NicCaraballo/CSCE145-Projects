//Nicolas Caraballo
//car class is a child of vehicle class
public class Car extends Vehicle{
	//instance variables
	private double gasMileage;
	private int passengers;
	
	//default constructor
	public Car() {
		//calls parent's defualt constructor
		super();
		this.gasMileage = 0;
		this.passengers = 0;
	}
	
	//parameterized constructor
	public Car(String xManufacturer, int xCylinders, String xOwner, double xGasMileage, int xPassengers) {
		//calls parent's parameterized constructor
		super(xManufacturer, xCylinders, xOwner);
		this.setMileage(xGasMileage);
		this.setPassengers(xPassengers);
		
	}
	
	//accessor for gas mileage variable
	public double getMileage() {
		return this.gasMileage;
	}
	
	//accessor for passenger variable
	public int getPassengers() {
		return this.passengers;
	}
	
	//mutator for gas mileage variable
	public void setMileage(double xMileage) {
		//input validation
		if(xMileage >= 0) {
			this.gasMileage = xMileage;
		} else {
			System.out.println("Invalid gas mileage entered!");
		}
	}
	
	//mutator for passenger variable
	public void setPassengers(int xPassengers) {
		//input validation
		if(xPassengers >= 0) {
			this.passengers = xPassengers;
		} else {
			System.out.println("Invalid passenger count entered!");
		}
	}
	
	//comparison function
	public boolean equals(Car car2) {
		//also checks parent's comparison function
		return super.equals(car2) && this.gasMileage == car2.gasMileage && this.passengers == car2.passengers;
	}
	
	//printing function
	public String toString() {
		//also prints parent's print function
		return super.toString() + "\nGas Mileage: "+this.gasMileage+"gallons\nPassengers:"+this.passengers;
	}
}
