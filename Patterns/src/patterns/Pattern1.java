package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int rows = 6;
		
		for(int i =1;i<=rows; ++i) //Outside loop
		{
			for(int j=1;j<=i;++j) //Inner loop
			{
				System.out.print(j + " ");//System.out.print(" $ ");
			}
			System.out.println("");
		}
	}

}

//Getting Number of rows from the user input |_\
class Pattern1User
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the symbol to create a pattern? ");
		String symbol = sc.nextLine();
		System.out.println("Enter Number of Rows?");
		int rows =sc.nextInt();
		
		for(int i=1; i<=rows; ++i)
		{
			for(int j=1;j<=i; ++j)
			{
				System.out.print(symbol + " ");
			}
			System.out.println("");
		}
	}
}




