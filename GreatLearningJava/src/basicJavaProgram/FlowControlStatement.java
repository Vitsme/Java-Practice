package basicJavaProgram;

public class FlowControlStatement 
{

	public static void main(String[] args) 
	{
		//if statement
		if(20>18)
		{
			System.out.println("20 is greater than 18");
		}
		
		
		//if else statement
		
		int x = 20;
		int y = 18;
		if (y>x)
		{
			System.out.println("y is greater than x");
		}
		else
		{
			System.out.println("x is greater than y");
		}

	}
 
}

class IfElseIf
{
	public static void main(String[] args) 
	{
	int marks =101;
	
	if(marks<50)
	{
		System.out.println("fail");
	}
	else if(marks>=50 && marks<60)
	{
		System.out.println("D grade");
	}
	else if(marks>=60 && marks<75)
	{
		System.out.println("C grade");
	}
	else if (marks>=75 && marks<90)
	{
		System.out.println("B grade");
	}
	
	else if (marks>=90 && marks<=100)
	{
		System.out.println("A+ grade");
	}
	else
	{
		System.out.println("Invalid!");
	}
		
}
}

 class IfElseIf1
 {
	 public static void main(String[] args)
	 {
		 int number = -13;
		 if(number>0)
		 {
		System.out.println("Positive");
		
		 }
		 else if (number<0)
		 {
		 System.out.println("Negative");
		 }
		 else
		 {
		 System.out.println("Neutral");
		 }
		 
	 }
 }



