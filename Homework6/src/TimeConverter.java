//Nicolas Caraballo
public class TimeConverter {
	
	//instance variable that will be used later
	private int hours;
	private int minutes;
	private int seconds;
	private boolean notPM;
	
	//default constructor
	public TimeConverter() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		this.notPM = true;
	}
	
	//parameterized constructor
	public TimeConverter(int xHours, int xMinutes, int xSeconds) {
		try {
			this.setHours(xHours);
			this.setMinutes(xMinutes);
			this.setSeconds(xSeconds);
		} catch (TimeException e){
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
	}
	
	//accesor for current objects hours
	public int getHours() {
		return this.hours;
	}
	
	//accesspr for current objects minutes
	public int getMinutes() {
		return this.minutes;
	}
	
	//accessor for current objects seconds
	public int getSeconds() {
		return this.seconds;
	}
	
	//accessor for current objects PM check
	public boolean getPM() {
		return this.notPM;
	}
	
	//mutator for the current objects hours
	public void setHours(int xHours) throws TimeException{
		//input validation
		if(xHours >= 0 && xHours <=23) {
			this.hours = xHours;
		} else {
			//exception throw
			throw new TimeException();
		}
	}
	
	//mutator for the current objects hours
	public void setMinutes(int xMinutes) throws TimeException{
		//input validation
		if(xMinutes >=0 && xMinutes <=59) {
			this.minutes = xMinutes;
		} else {
			//exception throw
			throw new TimeException();
		}
	}
	
	//mutator for the current objects seconds
	public void setSeconds(int xSeconds) throws TimeException{
		//input validation
		if(xSeconds >= 0 && xSeconds <= 59) {
			this.seconds = xSeconds;
		} else {
			//exception throw
			throw new TimeException();
		}
	}
	
	//method to update the time of the current object with integer inputs
	public void updateTime(int xHours, int xMinutes, int xSeconds) {
		//input validation
		if(xHours >= 12) {
			//exception test
			try {
				this.setHours(xHours - 12);
				this.setMinutes(xMinutes);
				this.setSeconds(xSeconds);
			} catch (TimeException e){
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				
			}
			//changes boolean to show that it is PM
			this.notPM = false;
		} else {
			//makes sure that the boolean shows it is AM
			this.notPM = true;
		}
		
	}
	
	//method to update the time from a [hours:minutes:seconds] string input
	public void updateTime(String time) {
		//exception test
		try {
			this.setHours(Integer.parseInt(time.substring(0,2)));
			this.setMinutes(Integer.parseInt(time.substring(3,5)));
			this.setSeconds(Integer.parseInt(time.substring(6,8)));
		} catch (TimeException e){
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
		//checks if the hours are over 12 (it is afternoon)
		if(this.hours >= 12) {
			//exception tester
			try {
				this.setHours(this.hours - 12);
			} catch (TimeException e){
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				
			}
			//sets boolean to show that it is PM
			this.notPM = false;
		} else {
			//sets boolean to show that it is AM
			this.notPM = true;
		}
		
	}
	
	//printing method
	public void displayTime() {
		//checks the boolean to make sure the correct section of the day is displayed
		if(this.notPM == true) {
			System.out.print(this.hours+":"+this.minutes+":"+this.seconds+"AM");
		} else {
			System.out.print(this.hours+":"+this.minutes+":"+this.seconds+"PM");
		}
	}
	
	
	

}
