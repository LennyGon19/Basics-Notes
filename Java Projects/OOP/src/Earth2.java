// Hard coded values for all the objects 
public class Earth2 
{
	public static void main(String[] args)
	{
		Human human1 = new Human("Barry Allen", 20, 76, "Blue");
		Human human2 = new Human("Bruce Banner", 25, 80, "Green");
		Human human3 = new Human("Flash Gordon", 30, 90, "Brown");
		
		human1.speak();
		System.out.println("---------------------");
		human2.speak();
		System.out.println("---------------------");
		human3.speak();
		
		/*
		 * Although they print out the exact same thing
		 * 
		 * they are still 3 different objects --> because they've all been given a value of ==>  new Human()
		 */
	}
}
