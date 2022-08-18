package patterns;
//Pattern Formation
/*
 * 
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 
 */

//Note: Combination of Pattern 1 and Pattern 2

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		
		//It Will Create Partial triangle pattern
		
		for(int i = 0; i<=rows-1;i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		
		
		//It will complete second half of the pattern
		for(int i=rows-1;i>=0;i--)
		{
			for(int j=0; j<=i-1;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
