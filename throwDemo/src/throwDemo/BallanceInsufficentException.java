package throwDemo;

public class BallanceInsufficentException extends Exception{
	
	String message;
	public BallanceInsufficentException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.message;
	}
}
