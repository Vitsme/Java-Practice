package ifElse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num > 0)
		{
			System.out.println("Your number is positive");
		}
		else if(num == 0)
		{
			System.out.println("Your number is neutral");
		}
		else 
		{
			System.out.println("Your number is negative");
		}
		sc.close();

	}

}

class IfDemo
{
	public static void main(String[] args) 
	{
		int mark;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark of the Student: ");
		mark = sc.nextInt();
		
		if(mark >= 90)
		{
			System.out.println("A-Grade");
		}else if(mark <= 89 && mark >=80)//(mark >=80) - another simple method due to the upper boundary it cannot check
		{
			System.out.println("B-Grade");
		}else if(mark <= 79 && mark >=70)
		{
			System.out.println("C-Grade");
		}else if(mark <= 69 && mark >=60)
		{
			System.out.println("D-Grade");
		}else if(mark <= 59 && mark >=50)
		{
			System.out.println("E-Grade");
		}else
			System.out.println("Fail");
		
				
	}
}
