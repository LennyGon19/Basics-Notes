
public class Animals 
{
	int age;
	String gender;
	int weightInLbs;
	
	public Animals(int age, String gender, int weightInLbs) 
	{
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	
	public void eat()
	{
		System.out.println("Eating...");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping...");
	}
	
	public void fly()
	{
		System.out.println("Flying....");
	}
}
