package oop.method.welcomer;

import java.util.Scanner;

public class Welcomer2000 
{
	//Main Method
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of people:");
		
		int numberOfPeople = sc.nextInt();
		
		for(int i= 0; i<numberOfPeople;i++)
		{
			welcome();
		}
		

	}
	
	//Sub Method
	public static void welcome()
	{
		System.out.println("Welcome!");
	}

}
