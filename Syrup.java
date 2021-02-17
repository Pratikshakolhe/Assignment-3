package inheritance;

public class Syrup extends Medicine {
	
	public Syrup(double price , String expirydate)
	{
		super(price , expirydate);
		
		
	}

	@Override
	void displayLable() {
		System.out.println("Syrup for dry cough");
	
		
	}
	

}
