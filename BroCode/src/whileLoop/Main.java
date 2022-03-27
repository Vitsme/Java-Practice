package whileLoop;

import java.util.Scanner;

public class Main
{
	public static void main(String [] args)
	{
	//While loop =  execute a block of code as long as a it's condition remains true
		Scanner sc=new Scanner(System.in);
		String name="";
		
		do//while(name.isBlank())
		{
			System.out.println("Enter your name: ");
			name = sc.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello "+name);
		
	}
}