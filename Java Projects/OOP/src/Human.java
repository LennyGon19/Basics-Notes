
public class Human
{	//defining the characteristics for objects
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	public Human(String name, int age, int heightInInches, String eyeColor) 
	{
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}
	//create basic actions/behaviors
	public void speak()
	{
		System.out.println("Hello, my name is " + name);
		System.out.println("I am "+heightInInches+" inches tall");
		System.out.println("I am "+ age +" years old");
		System.out.println("My eye color is " + eyeColor);
	}
	public void eat()
	{
		System.out.println("eating...");
	}
	public void walk()
	{
		System.out.println("walking...");
	}
	public void work()
	{
		System.out.println("working...");
	}
	
	// classes contain instructions for how objects can be created 
	// as well as how objects can carry out certain behavior
	// lines 10-28 are the instructions for how humans will behave
	
	// but we need to create the ACTUAL HUMAN OBJECT --> the Constructor 
	
	// Constructors provide a special way to CONSTRUCT objects
	// So in this example -- we have class human -- therefore it will help CREATE OBJECTS OF TYPE HUMAN
}
