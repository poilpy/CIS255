import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack
{
	public static Stack reverseStack()
	{
		boolean repeat = true;
		Scanner input = new Scanner(System.in);
		Stack stack = new Stack();
		
		do
		{
			System.out.println("Enter a word or 'end' to quit: ");
			String response = input.nextLine();
			if(response.equals("end"))
				repeat = false;
			else
				stack.push(response);
			
		}while(repeat);
		
		if(!stack.isEmpty())
		{
			int length = stack.size();
			
			ArrayList temp = new ArrayList();
			for(int i = 0; i < length; i++)
			{
				temp.add(stack.pop());
			}
			
			for(int i = 0; i < length; i++)
			{
				stack.push(temp.get(i));
			}
		}
		
		return stack;
	}
	
	public static void main(String[] args)
	{
        reverseStack();
	}

}
