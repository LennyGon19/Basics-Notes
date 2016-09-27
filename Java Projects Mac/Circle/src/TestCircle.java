// It's here that we will test everything from our Circle Class
// our data fields
// our methods

public class TestCircle 
{
	public static void main(String[] args)
	{
		
		Circle circle1 = new Circle(); 
	
		// syntax *Class name* *object name* = new *Class name*
	
		System.out.println("The area of the circle with radius " + circle1.radius + " is " + circle1.getArea());
		
		Circle circle2 = new Circle(25);
		
		System.out.println("The area of the circle with radius " + circle2.radius + " is " + circle2.getArea());
		
		Circle circle3 = new Circle();
		
		circle3.setRadius(125);
		
		System.out.println("The area of the circle with radius " + circle3.radius + " is " + circle3.getArea());
	}
}
