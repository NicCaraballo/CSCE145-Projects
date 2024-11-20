//Nicolas Caraballo
//truck is a child of vehicle class
public class Truck extends Vehicle{
	//instance varialbes
	private double loadCapacity;
	private double towingCapacity;
	
	//default constuctor
	public Truck() {
		//calls parent's default constructor
		super();
		this.loadCapacity = 0;
		this.towingCapacity = 0;
	}
	
	//parameterized constructor
	public Truck(String xManufacturer, int xCylinders, String xOwner, double xLoad, double xTowing) {
		//calls parent's parameterized constructor
		super(xManufacturer, xCylinders, xOwner);
		this.setLoad(xLoad);
		this.setTowing(xTowing);
	}
	
	//accessor for load capacity variable
	public double getLoad() {
		return this.loadCapacity;
	}
	
	//accessor for towing capacity variable
	public double getTowing() {
		return this.towingCapacity;
	}
	
	//mutator for load capacity variable
	public void setLoad(double xLoad) {
		//input validation
		if(xLoad >= 0) {
			this.loadCapacity = xLoad;
		} else {
			System.out.println("Invalid load capacity entered!");
		}
	}
	
	//mutator for towing capacity variable
	public void setTowing(double xTowing) {
		//input validation
		if(xTowing >= 0) {
			this.towingCapacity = xTowing;
		} else {
			System.out.println("Invalid towing capacity entered!");
		}
	}
	
	//comparison function
	public boolean equals(Truck truck2) {
		//also checks parent's comparison function
		return super.equals(truck2) && this.loadCapacity == truck2.loadCapacity && this.towingCapacity == truck2.towingCapacity;
	}
	
	//printing function
	public String toString() {
		//also returns parents print function
		return super.toString() + "\nLoad capacity: "+this.loadCapacity+"\nTownig capacity:"+this.towingCapacity;
	}
}
