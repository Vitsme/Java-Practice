package swapVariables;

import java.util.Scanner;

public class Method 
{
		private String name;
		private int age;
		public static String company ="Google";
		
		public void ReadData()
			{
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name: ");
			name = sc.nextLine();
			System.out.println("Enter your age: ");
			age = sc.nextInt();
			
			}
		public void PrintData()
		{
			
			System.out.println("name  "+name);
			System.out.println("age is "+age);
			System.out.println("company is "+company);
		}
		

}
