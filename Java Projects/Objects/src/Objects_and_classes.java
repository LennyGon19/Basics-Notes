
// main method tells the Java VM where to start reading therefore we 
// do not need it because they just contain information which does not
// need to be read by the program

// public class Objects_and_classes
	// we wont write the driver function in the same class as our Circle class is cause it'll look sloppy and crowded
	// ITS merely so that programmers dont get confused when looking for problems

class Circle
{
	double radius = 1;
	double thickness = 1;
	
	Circle(){ } // this will create a circle with default values given above
	
	Circle(double newradius) // this constructor will create a circle that will be able to take in a new radius
						// we declare newradius variable within the constructor
	{
		radius = newradius; // we access the data field radius through here, which will allow us to alter the radius
	}
	
	double getArea() // here we are defining our method
	{
		return radius*radius* Math.PI; //constructors will not return anything 
	}
	double getPerimeter()
	{
		return 2*radius*Math.PI;
	}
	void  setRadius(double newradious) // this method changes the value of the radius for this specific object
	{
	radius = newradious; // this will just allow you to re-define the radius
	}
}

/*   class called Circle
*	 After the class name we have our data fields
*
* radius: double  --> our data field radius is of type double
* thickness: double --> data type
*  -----------------------------------------------------------
* After the data fields we're going to list the Constructors and the Methods
* 
* 	--> Constructors and methods define the behavior of the class
* 
*	Circle(); this is will create a default circle -- it is also known as a constructor -- it also accepts no arguments hence the empty parenthesis
* 
*	To utilize the constructor you either invoke it in the MAIN method or another Method or another class and that class can use/modify the circle
*
*	Circle(newRadius : double) this accepts the argument of circle -- creating a circle with a specific radius -- this is an argumented constructor 
*
* 	getArea();double (returns a double)  -- this method will allow the calling class to get the area of the circle object it created
* 										 -- Allows specify the return type which is why we added double at the end of the semicolon
* 	
* 	getPerimeter();double (returns a double) -- this method will allow the calling class to get the permiter of the circle it created
* 
* 	setRadius(newRadius: double): void  -- every single constructor will never return any type of data type 
*	
*	We indicate our object as such:
*
*			lets say our calling class wants to create 3 circles we do:
* 	
* 	declaration 						   	 circle1:Circle								               circle2:Circle									circle3:Circle
* 	it needs a data type therefore			 radius = 1;											   radius = 25;									    radius = 125;
* 	this full fills other data type 		 thickness = 1;											   thickness = 1;									thickness = 4;
* 																								
* modifying a data field in one object will NOT modify the data field in another object
*/