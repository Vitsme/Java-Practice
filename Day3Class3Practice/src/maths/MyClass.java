package maths;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{	
		int n, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		n=sc.nextInt();
		System.out.println("Enter r value: ");
		r=sc.nextInt();
		Maths obj = new Maths();
		System.out.println(obj.nCr(n, r));

	}

}
