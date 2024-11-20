//Nicolas Caraballo
public class CargoShip extends Ship{
	//instance variables
	private double tonnage;
	private double maxSpeed;
	
	//default constructor
	public CargoShip() {
		super();
		this.tonnage = 1;
		this.maxSpeed = 1;
	}
	
	//parameterized constructor
	public CargoShip(String xName, String xLaunchDate, double xTonnage, double xSpeed) {
		super(xName, xLaunchDate);
		this.setTonnage(xTonnage);
		this.setMaxSpeed(xSpeed);
	}
	
	//accessor methods
	public double getTonnage() {
		return this.tonnage;
	}
	
	public double getMaxSpeed() {
		return this.maxSpeed;
	}
	
	//mutator methods
	public void setTonnage(double xTonnage) {
		if(xTonnage > 0) {//input validation
			this.tonnage = xTonnage;
		} else {
			System.out.println("Invalid tonnage entered!");
		}
	}
	
	public void setMaxSpeed(double xSpeed) {
		if(xSpeed > 0) {//input validation
			this.maxSpeed = xSpeed;
		} else {
			System.out.println("Invalid speed entered!");
		}
	}
	
	//printing method
	public String toString() {
		return super.toString()+"\nTonnage: "+this.tonnage+"\nMax Speed: "+this.maxSpeed;
	}
}
