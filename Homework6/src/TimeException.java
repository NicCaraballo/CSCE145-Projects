//Nicolas Caraballo
public class TimeException extends Exception{
	
	//prints a general exception for invalid times
	public TimeException(){
		super("EXCEPTION: Invalid time entered!");
	}
	
	//prints general exceptiosn from the exception class
	public TimeException(String msg) {
		super(msg);
	}

}
