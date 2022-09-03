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









