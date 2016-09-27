
// public class Circles --> we separate the driver/main functions from our methods & data fields

class Circle
{
	// first declare the data fields
	double radius = 1;
	double thickness = 1;
	
	Circle( ){ }	// default constructor --> will create circle with a radius of 1 and thickness of 1
	
	Circle(double newRadius) // this constructor will create a circle with a customizable radius
	{
		radius = newRadius;
		// not entirely sure but -- we need to change the value of radius 
	}
	
	double getArea()
	{
		return radius*radius*Math.PI;
	}
	double getPerimeter()
	{
		return 2*radius*Math.PI;
	}
	void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
}
	

