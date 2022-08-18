package patterns;

import java.util.Scanner;

public class Pattern2 
{

	public static void main(String[] args) 
	{
		int rows = 5;
		
		for(int i =rows; i>=1; --i)
		{
			for(int j=1; j<=i; ++j)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}

//Getting Data from user

class Pattern2User
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Symbol to Print? ");
		String symbol =sc.nextLine();
		System.out.println("Enter Number of Rows to Print? ");
		int rows = sc.nextInt();
		
		for(int i = rows; i>=1; --i)
		{
			for(int j = 1; j<=i; ++j)
			{
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
	}
}
