
public class Literals 
{
	public static void main(String[] args)
	{
		int numberofyears = 52;
		double mass = 0.305;
		long numberofyears1 = numberofyears; 
		// there is no error because any value that is a integer value
		// Can automatically be stored in a long value, since the long value is bigger
		// this is called IMPLICIT CASTING
		// You go from a LOWER data type to a LARGER data type
		
		System.out.println(0B11111);
		System.out.println(0XFFFF);
		System.out.println(0171);
		
		float x1 = 1;
		double x2 = x1; // NO error because any possible float value can be a double variable
		
		System.out.println(1.0/3.0);
		System.out.println(1.0F / 3.0F); // this indicates we want 1.0 & 3.0 to be considered as floating point values
		// therefore the first print statement will display 16 significant figures
		// whereas the second print statement will display 08 significant figures
		
		//CASTING
		// Is useful when you want to change something from 1 data type to another data type
		// mostly used for numeric casting
		
		int x =5; // want this to become a double
		double y = x; // this is called implicit casting --> bc any possible integer value can fit in a double value
		
		// explicit casting
		double x5 = 5;
		// int y 1 = x 5; // wont allow it bc double hold much 64 bits while int only holds 32 -- even tho the double is 5 the complier wont allow it
		// SO we used explicit casting 
		int y1 = (int)x; 
		double z1 = 150;
		byte a1 = (byte) z1; // turn z1 into a byte value --> we just change the display
		int b1 = (int) z1;  // we cast double z1 into int type
		
		System.out.println(z1);
		System.out.println(b1);
		
		
	}
}
