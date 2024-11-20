//Nicolas Caraballo
public class CruiseShip extends Ship{
	//instance varaibles
	private int capacity;
	private int crewSize;
	
	//default constructor
	public CruiseShip() {
		super();
		this.capacity = 1;
		this.crewSize = 1;
	}
	
	//parameterized constructor
	public CruiseShip(String xName, String xLaunchDate, int xCapacity, int xCrewSize) {
		super(xName, xLaunchDate);
		this.setCapacity(xCapacity);
		this.setCrewSize(xCrewSize);
	}
	
	//accessor methods
	public int getCapacity() {
		return this.capacity;
	}
	
	public int getCrewSize() {
		return this.crewSize;
	}
	
	//mutator methods
	public void setCapacity(int xCapacity) {
		if(xCapacity > 0) {//input validation
			this.capacity = xCapacity;
		} else {
			System.out.println("Invalid passenger capacity entered");
		}
	}
	
	public void setCrewSize(int xCrewSize) {
		if(xCrewSize > 0) {//input validation
			this.crewSize = xCrewSize;
		} else {
			System.out.println("Invalid crew size entered");
		}
	}
	
	//printing method
	public String toString() {
		return super.toString()+"\nPassenger Capacity: "+this.capacity+"\nCrew Size: "+this.crewSize;
	}
}
