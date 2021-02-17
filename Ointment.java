package inheritance;

public class Ointment extends Medicine {

	public Ointment(double price, String expirydate) {
		super(price, expirydate);
		
	}

	@Override
	void displayLable() {
		System.out.println("for external use only");
	
		
	}
	
	

}
