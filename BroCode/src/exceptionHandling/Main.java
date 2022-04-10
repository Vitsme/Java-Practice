package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//exception = an event that occurs during the execution of a program that,
		// 			  disrupts the normal flow of instructions
		
		//Step2
		Scanner sc = new Scanner (System.in);
		try
		{
			//Step1
			//Scanner sc = new Scanner (System.in); need to open scanner above try to recognize finally block
			System.out.println("Enter a whole number to divide: ");
			int x = sc.nextInt();
			System.out.println("Enter a whole number to divide by: ");
			int y = sc.nextInt();
		 
			int z = x/y;
			System.out.println("result: "+z);
			//Running the above the one  5 divide 0 it shows error in Arithmetic Exception
			//We need to handle this exception called as exception handeling
			//So, Create try and catch block while using catch handle those exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("You can't divide by zero! IDIOT!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter a number OMFG!!!");
		}
		catch(Exception e)//This can handle all type of exception but best practice do it individually
		{
			System.out.println("Something went wrong");
		}
		finally
		{
			System.out.println("This will always print");
			sc.close();
		}
	}

}
