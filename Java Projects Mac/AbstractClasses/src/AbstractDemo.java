
public class AbstractDemo 
{
	public static void main(String[] args)
	{ 
		Salary s = new Salary("Eddy Simk", "New York, New York",0, 3600.00);
		// Employee is the name of the class and e is the name of the object
		//Employee e = new Employee("Lenny Gonzalez", "Astoria, New York", 20);
		Employee e = new Salary("Lenny Gonzalez", "Astoria, New York", 0, 24000.00);
		// Abstract class won't allow you to create new instances of it
		// So you need to create a sub-class, which we'll call salary, to implement the Abstract Class: Employee
		s.mailCheck();
		System.out.println("\nCall mailCheck using Employee referrence --");
		e.mailCheck();
	}
}
