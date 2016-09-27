import java.util.*;

public class Stackz 
{
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();
		stack.push("Bottom");
		printStack(stack);
		stack.push("Middle");
		printStack(stack);
		stack.push("Top");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		
	}
	
	private static void printStack(Stack<String> s)
	{
		if(s.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.printf("%s TOP \n", s);
	}
}
