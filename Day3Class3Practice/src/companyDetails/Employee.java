package companyDetails;

import java.util.Scanner;

public class Employee 
{
		private String name;
		private int age;
		public static String company="Microsoft";
		
		void readData()
		{
			Scanner obj =  new Scanner(System.in);
			System.out.println("Enter your name: ");
			name =  obj.nextLine();
			System.out.println("Enter your age: ");
			age = obj.nextInt();
		}
		
		void printData()
		{
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("company: "+company);
		}
	
	
	
	
	
	
	
}
