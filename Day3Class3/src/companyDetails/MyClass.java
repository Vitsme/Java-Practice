package companyDetails;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		//variable declaration
		String name;
		int age;
		float height;
		
		Scanner obj = new Scanner(System.in);
		//Read data from user
		System.out.println("Enter your name: ");
		name = obj.nextLine();
		System.out.println("Enter your age: ");
		age = obj.nextInt();
		System.out.println("Enter your height: ");
		height = obj.nextFloat();
		
		System.out.println("Your name is: "+name);
		System.out.println("Your age is: "+age);
		System.out.println("Your height is: "+height);

	}

}
