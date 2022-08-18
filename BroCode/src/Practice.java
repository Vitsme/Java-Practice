import java.util.Random;
import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

public class Practice {
	
	//Swap Two Variables
	public static void main(String[] args) 
	{
		String x = "Sigma";
		String y = "Male";
		String temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("The Value of x is:" +x);
		System.out.println("The Value of y is:" +y);
		

	}

}

//Scanner - Getting the User Input
class ScannerPractice
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your core:");
		String core = sc.nextLine();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(core);
		
		
	}
}

//Arithmethic Expressions
class Expression
{
	//Addition ++
	public static void main(String[] args)
	{
		int friends = 50;
		friends--;
		System.out.println(friends);
		
	}
}
//Arithmethic Expression Double
class ExpressionDouble
{
	public static void main(String[] args)
	{
		double friends = 80;
		friends = friends/3;
		
		System.out.println(friends);
	}
}
//math class
class math
{
	public static void main (String[] args)
	{
		double x = 5;
		double y = -7;
		
		double z = Math.max(x,y);// C
		double z1 = Math.min(x, y);// Comparing the two value to findout the min value
		double z2 = Math.sqrt(z);// sqrt the given value
		double z3 = Math.ceil(z);//To round the value in high
		double z4 = Math.floor(z);//To round the value in low
		double z5 = Math.abs(z1); // To change the sign negative to positive
		double z6 = Math.round(z2);
		
		System.out.println(z);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		System.out.println(z6);
	}
}

class hypertenuse
{
	public static void main (String[] args)
	{
		double x;
		double y;
		double z;
		
		Scanner sc = new Scanner(System.in);
		//For x value
		System.out.println("Enter value of x: ");
		x = sc.nextDouble();
		//For Y value
		System.out.println("Enter value of y: ");
		y = sc.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("Square root of the given value is "+z);
		
	}
}

class random
{
	public static void main(String[] args)
	{
		Random ra = new Random();
		
		int x = ra.nextInt(5)+0;
		System.out.println(x);
	}
}

class ifStatement
{
	public static void main(String[] args)
	{
		int x =18,y = 7;
		
		if(x>y)
		{
			System.out.println("You are greater than 18");
		}else
		{
			System.out.println("You are lesser than 18");
		}
		
	}
}

class ifStatementsystem
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age: ");
		int age = sc.nextInt();
		
		if(age<=18)
		{
			System.out.println("You are eligible to vote.....");
		}else if(age<18)
		{
			System.out.println("You are not eligible to vote...............");
		}else if(age>100)
		{
			System.out.println("Nice to meet you ancient one...........");
		}
		//need to add exception handling for if i add any alphabets in this arena
}
}

class switchcondition
{
	public static void main(String[] args)
	{
		//String day = "Wednesday";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day to show a LOL: ");
		String day = sc.nextLine();
		
		
		switch (day)
		{
		case "Monday" : System.out.println("Hey it's Monday!");
		break;
		case "Tuesday" : System.out.println("Hey it's Tuesda Puff!");
		break;
		case "Wednesday": System.out.println("Your Favourite day is here :)");
		break;
		default: System.out.println("You are from planet x");
		}
	}
}
	//Logical Operators = And/Or/Not
class logicalOperators
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Today's Temperature in Celcius: ");
		int temp = sc.nextInt();
		
		if(temp>=35)
		{
			System.out.println("Temperature in Celsius is "+ temp +" It's Very Hot Outside ");
		}
		else if(temp>18 && temp<=36)//And Condition Both condition need to be True &&
		{
			System.out.println("Temperature in Celsius is "+ temp +" It's Sunny Outside, Good weather Condition Do your work without hazzle");
		}else
		{
			System.out.println("Temperature in Celsius is "+ temp +" It's Cold outside, Beaware On Snowfall Region.....");
		}
	}
}

class logicalOR //Either one conditions need to be true ||
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Exit for q or Q? ");
		String request = sc.nextLine();
		
		if(request.equals("q") || request.equals("Q"))
		{
			System.out.println("You Exit the game!!!");
		}else
		{
			System.out.println("You are in the game..........");
		}
	}
}
class logicalNot //NotEqual !
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Exit for q or Q? ");
		String request = sc.nextLine();
		
		if(!request.equals("q") && !request.equals("Q"))
		{
			System.out.println("You are in the game..........");
		}else
		{
			System.out.println("You Exit the game!!!");
		}
	}
}
class whileLoop
{
	public static void main(String[] args)
	{
		int i =1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
	}
}
class whileLoopUserInput
{
	public static void main(String[] args)
	{
		String name = ""; // Reason behind the while loop "" due to name.isBlank() it needs the user input some value otherwise it will repeat asking the question
		Scanner sc =new Scanner(System.in);
		
		
		
		while(name.isBlank())
		{
			System.out.println("Enter Your Name: ");
			name = sc.nextLine();
		}
		System.out.println("Hello "+name);
	}
}

class forLoop
{
	public static void main(String[] args)
	{
		//int i;
		for(int i=0;i<=10;i++)
		{
			System.out.println(i +" sigma");
			
		}
	}
}
class forLoop1
{
	public static void main(String[] args)
	{
		for(int i=10;i>=0;i--)
		{
			System.out.println(i);
		}
	}
}
//nested loop
class nestedLoop1
{
	public static void main(String[] args)
	{
		int weeks = 3;
		int days = 7;
		
		for(int i=1;i<=weeks;++i)
		{
			System.out.println("Week: "+ i);
			for(int j=1;j<=days;++j)
			{
				System.out.println("Day: "+j);
			}
		}
	}
}
class loopinsideWhileLoop //nested loop
{
	public static void main(String[] args)
	{
		int weeks =3;
		int days = 7;
		int i =1;
		while(i<=weeks)
		{
			System.out.println("Weeks : "+i);
			for(int j = 1; j<=days; ++j)
			{
				System.out.println("Days : "+j);
			}
			++i;
		}
	}
}
class nestedLoop_Pattern //Upward Triangle
{
	public static void main(String[] args)
	{
		int rows =5;
		
		//outerloop
		for(int i =1; i<=rows; ++i)
		{
			//innerloop
			for(int j =1; j<=i; ++j)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}

class nestedLoop_Pattern1 //Downward Triangle
{
	public static void main(String[] args)
	{
		int rows =5;
		
		//outerloop
		for(int i =rows; i>=1; --i)
		{
			//innerloop
			for(int j =1; j<=i; ++j)
			{
				System.out.print(j+ " "); //System.out.print("*"+ " ");
			}
			System.out.println("");
		}
	}
}


class nestedLoop_TrianglePattern
{
	public static void main(String[] args)
	{
		int rows = 5;
		for(int i = 0; i<rows; i++)
		{
			System.out.print("");
			
			for(int j =0;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}





