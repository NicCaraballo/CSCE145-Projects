//Nicolas Caraballo
public class Ship {
	//instance varaibles
	private String name;
	private String launchDate;
	
	//default constructor
	public Ship() {
		this.name = "none";
		this.launchDate = "01/01/1990";
	}
	
	//parameterized constructor
	public Ship(String xName, String xLaunchDate) {
		this.setName(xName);
		this.setLaunchDate(xLaunchDate);
	}
	
	//accessor methods
	public String getName() {
		return this.name;
	}
	
	public String getLaunchDate() {
		return this.launchDate;
	}
	
	//mutator methods
	public void setName(String xName) {
		this.name = xName;
	}
	
	public void setLaunchDate(String xLaunchDate) {
		int year = Integer.parseInt(xLaunchDate.substring(6));
		if(year >= 1990 && year <= 2019) {//input validation
			this.launchDate = xLaunchDate;
		} else {
			System.out.println("Invalid year entered!");
		}
	}
	
	//printing method
	public String toString() {
		return "Ship Name: " + this.name+"\nLaunch Date: "+this.launchDate;
	}
	
}
