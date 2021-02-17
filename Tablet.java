package inheritance;

public class Tablet extends Medicine {

	public Tablet(double price, String expirydate) {
		super(price, expirydate);
		
	}

	@Override
	void displayLable() {
		System.out.println("Store in cool dry place");
		
		
	}
	
	
	
	

}
