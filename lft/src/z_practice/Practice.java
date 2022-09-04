package z_practice;

import java.util.Scanner;

//Hello World Program
public class Practice 
{

	public static void main(String[] args) 
	{
		//Hello World Program
		System.out.println("Hello World");
	}

}

//Variable and Datatype additionally i used Scanner class for getting user input
class variablesDatatypes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Price of the Ticket?  ");
		int ticketPrice = sc.nextInt();
		boolean paid = true;
		char c ='$';
		
		System.out.println("Paid amount for the Ticket is: "+ticketPrice);
		System.out.println(paid);
		System.out.println(c);
	}
}
//Getting input from the user Seperate scanner class
class userInput
{
	public static void main(String[] args)
	{
		//Getting Data's from user
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String username = obj.nextLine();
		System.out.println("Enter your password: ");
		int password =obj.nextInt();
		System.out.println("Enter your email: ");
		String email = obj.next();
		
		//Print the user data
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		System.out.println("Recovery Email: "+email);
	}
}
//Arithmetic Operator - (+ _ * / %)

class arithmeticOperator
{
	public static void main(String[] args)
	{
		int a = 12, b= 7, c;
		c= a+b;
		
		double a1 = 25, b1 =8, c1;
		c1 =a1/b1;
		
		System.out.println(c);
		System.out.println(c1);		
	}
}

//Arithmetic Operator = Compound Assignment
class compoundAssignment
{
	public static void main(String[] args)
	{
		int a = 5;
		a += 3; //Compounding the value
		System.out.println(a);
	}
}

//Arithmetic Operator =Increment and Decrement

class incrementOrDecrementOperator
{
	public static void main(String[] args)
	{
		int a = 23;
		
		//increment
		a++;//Post increment  //24
		++a;//Pre increment   //25
		System.out.println(a); //25
		//decrement
		
		a--;  //post decrement //24
		--a;  //pre decrement  //23
		System.out.println(a);  //23
		
		
		int x =14;
		x = x++ + ++x;  // 14 + 16 = 30
		System.out.println(x);		
	}
}
//Relational Operator 
// <, <=, >, >=, ==,!=
class relationalOperator
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 15;
		System.out.println(a>b); //false
		System.out.println(a>=b);//false
		System.out.println(a<b);//true
		System.out.println(a == b);//false
		System.out.println(a != b);//true
	}
}
//ShortCircuit and Operator precedence

class shortCircuitOperator // && , ||
{
	public static void main(String[] args)
	{
		int a =23;
		System.out.println(a>20 && a<20); //false
		System.out.println(a>20 || a<20); //true
	}
}
class OperatorPrecedence
{
	public static void main(String[] args)
	{
		int a = 21, b=25;
		double c = a*b-10/a;
		System.out.println(c);
	}
}

//Ifelse
class ifElse
{
	public static void main(String[] args)
	{
		int num = 45;
		if(num>0)
		{
			System.out.println("Your number is positive");
		}else if(num == 0)
		{
			System.out.println("Your number is neutral");
		}else
		{
			System.out.println("Your number is negative");
		}
				
	}
}
//If else Conditional Operator - ternary condition
class conditionalOperator
{
	public static void main(String[] args)
	{
		int a =45, b=79;
		int max;
		
		max =(a>b)?a:b;
		System.out.println(max);
	}
}

//Switch
class s_witch
{
	public static void main(String[] args)
	{
		String day ="Boyka";
		
		switch(day)
		{
		case "Monday":
			System.out.println("Monday");
			break;
			
		case "Tuesday":
			System.out.println("Tuesday");
			break;
			
		case "Wednesday":
			System.out.println("Wednesday");
			break;
			
		case "Thursday":
			System.out.println("Thursday");
			break;
			
		case "Friday":
			System.out.println("Friday");
			break;
			
		case "Saturday":
			System.out.println("Saturday");
			break;
			
		case "Sunday":
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("You are in another planet");
			break;
		
		}
	}
	
}
//Array
class Arrays
{
	public static void main(String[] args)
	{
		int marks[] = {95, 76, 86, 54, 79};
		System.out.println(marks[4]);
	}
}
//Loops - ForLoop
class forLoop
{
	public static void main(String[] args)
	{
		int i;
		for(i =1; i<=5; i++)
		{
			System.out.println(i);
		}
		//System.out.println(" "+i);
	}
}
//Loops - WhileLoop
class whileLoop
{
	public static void main(String[] args)
	{
		int i =2;
		while(i<=6)
		{
			System.out.println(i);
			i++;
		}
		
	}
}
//Loops - Nested Loops
class nestedLoops
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
				System.out.print("$");
			{
				System.out.println();
			}
		}
	}
}

//Loops - LoopControlStatement
//Jump statement -break,continue;

//For a given n, find the nearest number divisible by 10 that is less than or equal to n

class loopBreakstatement
{
	public static void main(String[] args)
	{
		int n = 46;
		
		while(n>=0)
		{
			if(n%10 == 0)
			{
				System.out.println(n);
				break;
			}
			n--;
		}
	}
}
//Find the sum of all input numbers entered and negative numbers to exit the entered value
class loopBreakStatement1
{
	public static void main(String[] args)
	{
		double n, sum =0.0;
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter the numbers: Enter a negative number to stop: ");
				while(true)
				{
					n=sc.nextDouble();
					if(n<0.0)
					{
						break;
					}
					sum += n;
				}
		System.out.println("Sum is "+sum);
	}
}
//Loop Break Label
class breakLabelNestedLoop
{
	public static void main(String[] args)
	{
		outerloop: //Label
			for(int i=1; i<=5; i++)
			{
				innerloop:
					for(int j=1; j<=5; j++)
					{
						if(i == 3 && j==3)
							break outerloop;
						System.out.print("$");
					}
				{
					System.out.println();
				}
			}
	}
}
class continueLabelLoop
{
	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			if(i == 7)
			
				continue;
				System.out.println(i);
			
			
		}
	}
}







