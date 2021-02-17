package inheritance;

abstract class Medicine {
	double price;
	String expirydate;
	public Medicine(double price, String expirydate) {
		super();
		this.price = price;
		this.expirydate = expirydate;
	}
	abstract void displayLable();
	void getDetails()
	{
		System.out.println("price of drug is :"+price+" expiry date is :"+expirydate);
	}
	

}
