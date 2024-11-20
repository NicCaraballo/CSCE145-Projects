//Nicolas Caraballo
import java.util.Scanner;
public class ClockTimeDemo {
	public static void main(String[] args) throws TimeException {
		//creates scanner object
		Scanner key = new Scanner(System.in);
		
		//boolean that will determine whether to continue the loop or not
		boolean cont = true;
		do {
			//first time converter object made
			TimeConverter t1 = new TimeConverter();
			//asking the user to enter the hours they want to convert
			System.out.println("Enter the current hours (in military time)");
			//attempts to assign the user's input to the first object's hours, but catches and continues the program if an invalid resposne is given
			try {
				t1.setHours(key.nextInt());
			} catch (TimeException e){
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				
			}
			
			//asks the user to enter the current minutes
			System.out.println("Enter the current minutes");
			//attempts to assign the user's input to the first object's minutes, but catches and continues if the input is invalid
			try {
				t1.setMinutes(key.nextInt());
			} catch (TimeException e){
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				
			}
			//asks the user to enter the current seconds
			System.out.println("Enter the current seconds");
			//attempts to assign the user's input the the first object's seconds, but catches and continues if the input is invalid
			try {
				t1.setSeconds(key.nextInt());
			} catch (TimeException e){
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				
			}
			
			//updates the time of the first time object
			t1.updateTime(t1.getHours(), t1.getMinutes(), t1.getSeconds());
			System.out.print("12 hour time --> ");
			t1.displayTime();
			System.out.println();
			key.nextLine();
			
			//creates a second time object
			TimeConverter t2 = new TimeConverter();
			//asks the user to enter the time in a [hours:minutes:seconds] format
			System.out.println("Enter the current time (using military time, format [hours:minutes:seconds]");
			//updates the time entered by the user
			t2.updateTime(key.nextLine());
			System.out.print("12 hour time --> ");
			t2.displayTime();
			System.out.println();
			
			//asks the user if they wish to continue and records the response
			System.out.println("Would you like to continue? (enter true/false)");
			cont = key.nextBoolean();
		//above code repeats while the user wants to continue
		}while(cont == true);
		
		//farewell message
		System.out.println("Enjoy your time!");
	}
}
