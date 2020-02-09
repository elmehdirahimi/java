package partie2.exercice1;
import java.*;
import java.util.Scanner;
import java.util.Stack;

public class postfix {
	
	//static Stack<Double> operande = new Stack<Double>();
	static Stack<Character> operateur = new Stack<Character>();
	static Stack<String> myStack = new Stack<String>();
	static Stack<String> rMyStack = new Stack<String>();
	static Stack<Integer> finalStack = new Stack<Integer>();
	
	public static void main(String[] argv) {
		Scanner sn = new Scanner(System.in);
		myGetStack(sn.nextLine());
		stacCalcul();
	}
	public static void myGetStack(String arg) {
		

		String str = "";
		int i = 0;
	
		try {
			while (i < arg.length())
			{
				if (arg.charAt(i) == '+' || arg.charAt(i) == '-' || 
						arg.charAt(i) == '*' || arg.charAt(i) == '/' 
						|| arg.charAt(i) == '(' || arg.charAt(i) == ')')
				{
					if(arg.charAt(i) != '(' && arg.charAt(i) != ')')
					{
						operateur.push(arg.charAt(i));
					
					}
					if(arg.charAt(i) != '(')
					{
						if(str.length() > 0)
							myStack.push(str);
						str ="";
						}
					if(arg.charAt(i) == ')')
					{
						str+=operateur.pop();
						if(str.length() > 0)
							myStack.push(str);
						str="";
					}
					
				}
				else {
					str+=arg.charAt(i);
				}
					i++;
			}
			if(str.length() > 0)
				myStack.push(str);
			while(!operateur.empty())
			{
				str="";
				myStack.push(str+=operateur.pop());
			}
			System.out.println(myStack);
		}
		catch (Exception e) {
			System.out.println("please enter quelque chose");
		}
	}
	
	public static void stacCalcul() {
		String str;
		while(!myStack.empty())
		{
			rMyStack.push(myStack.pop());
		}
		while (!rMyStack.empty())
		{
			str = rMyStack.pop();
			if(str.contentEquals("+"))
			{
				finalStack.push(finalStack.pop() + finalStack.pop());
			}
			else {
				if(str.contentEquals("-"))
				{
					finalStack.push(finalStack.pop() - finalStack.pop());
				}
				else {
					if(str.contentEquals("*"))
					{
				
						finalStack.push(finalStack.pop() * finalStack.pop());
					}
					else {
						if(str.contentEquals("/"))
						{
							finalStack.push(finalStack.pop() / finalStack.pop());
						}
						else {
							int x = Integer.valueOf(str);
							if(x >= 0)
							finalStack.push(x);
			
						}
					}
				}
			}
		}
	System.out.println(finalStack.pop());
	}

}