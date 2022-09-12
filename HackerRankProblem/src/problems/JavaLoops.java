package problems;

import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table you want:");
		int N = sc.nextInt();
		
		for(int i = 1; i<=10;i++)
		{
			System.out.println(N+" x "+i+" = "+i*N);
		}
		
		

	}

}

class JavaLoop2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int a =sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			int x =1;
			for(int j=0; j<n;j++)
			{
				a=a+x*b;
				System.out.print(a+" ");
				x=x*2;
			}
			System.out.println();
		}
		sc.close();
	}
}