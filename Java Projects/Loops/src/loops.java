import java.util.Scanner;

public class loops 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		
		double number1, number2, sum;
		boolean status = true;
		
		while(status) // the while loop is implemented to allow the user to re-input a option in case they entered an incorrect option
		{
			System.out.println("Please select" + '\n' + "(1) for addition" + '\n' + "(2) for subtaction" + '\n'  +"(3) for multiplication"+ '\n'  +"(4) for division");
			int option;
			option = input.nextInt();
			
			switch (option)
			{
				case 1: // This case is for addition
				{
				System.out.println("Enter the first integer: ");
				number1 = input.nextDouble();
				System.out.println("Enter the second integer: ");
				number2 = input.nextDouble();
				sum = number1 + number2;
				System.out.println("The result is: " + sum);
				status = false;
				break;
				}
				case 2: // this case is for subtraction
				{
					System.out.println("Enter the first integer: ");
					number1 = input.nextDouble();
					System.out.println("Enter the second integer: ");
					number2 = input.nextDouble();
					sum = number1 - number2;
					System.out.println("The result is: " + sum);
					status = false;
					break;
				}
				case 3: // this case is for multiplication 
				{
					System.out.println("Enter the first integer: ");
					number1 = input.nextDouble();
					System.out.println("Enter the second integer: ");
					number2 = input.nextDouble();
					sum = number1 * number2;
					System.out.println("The result is: " + sum);
					status = false;
					break;
				}
				case 4: // this case is for division
				{
					System.out.println("Enter the first integer: ");
					number1 = input.nextDouble();
					System.out.println("Enter the second integer: ");
					number2 = input.nextDouble();
					sum = number1 / number2;
					System.out.println("The result is: " + sum);
					status = false;
					break;
				}
				default : // default is used as an alternative if the user's option does not match any of the provided cases
				{
					System.out.println("Please enter a valid option");
					break;
				}
			}
		}
	}
}

// When you assigned the HW I was eager to start it, but should have known to initially switch-case
// However I have never used switch-case so I was hesitant to use it.
