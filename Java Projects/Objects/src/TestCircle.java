
public class TestCircle
{
	public static void main(String[] args) 
	{
		Circle circle1 = new Circle(); // looks a lot like when declare Scanner
	  // Scanner input = new Scanner(System.in)
	 // This is saying that we want to create a "scanner class object" -- in the same way that we want to create a "circle class object"
	// the name of that object is = circle1  -- or input -- then we have new Circle and new Scanner
   // In the case of our constructor it doesnt come with an argument -- Scanner comes with an argument of : System.in (where to take input from) and assigns it to the variable input
		System.out.println("The area of the circle with radius: " + circle1.radius + " is " + circle1.getArea());
		// we use dot to access information
		Circle circle2 = new Circle(25); // the Constructor with an agrument is already expecting a double value so we can enter w.e we want for the radius
		System.out.println("The area of the circle with radius: " + circle2.radius + " is " + circle2.getArea());
		
		// basic syntax
		// Class_name object_name = new Class_name(); this will create an object with the default data fields set in the class Circle
		
		Circle circle3 = new Circle(); // we can modify the radius even with a default constructor but you shouldnt really do it this way... always know what you want the value to be
		circle3.setRadius(125);
		System.out.println("The area of the circle with radius: " + circle3.radius + " is " + circle3.getArea());
		circle3.thickness = 4; // here we are modifying the data field of thickness -- default is one but we're changing it to 4
		System.out.println("The thickness of circle 3 is : " + circle3.thickness);
		// YOU DONT WANT DATA FIELDS TO BE MODIFIED FROM OUTSIDE CLASSES
	} 
}

// After that allusion to Scanner --> first java looks for Circle class and then creates a NEW CIRCLE object using the default no argument constructor
// then using the default values we initialized the variables with --> it assigns those values to: circle1
// then we can start using the methods while using the object: circle1