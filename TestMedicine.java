package inheritance;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		
		//Medicine m[]=new Medicine[4];
		double a=Math.random()*4;
		int b=(int)a;
		
		System.out.println(b);
		
		switch(b)
		{
		case 1:
			
			Medicine m=new Syrup(34.4,"4563");
			 break;
			 
		case 2:
			Medicine m1=new Ointment(34.4,"04-01-2021");
			 break;
			 
		case 3:
			Medicine m2=new Tablet(4.4,"4563");
			 break;
		
			
			
			
		}
		

	}

}
