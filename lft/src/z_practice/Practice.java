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







