package loops;

import java.util.Scanner;

//Jump Statements - break
//Problem
// For a given n, find the nearest number divisible by 10 that is less than or equal to  n

public class LoopsControlStatement {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		while(n>=0)
		{
			if(n%10==0)
			{
				System.out.println(n);
				break;
			}
			n--;
		}

	}

}

//Find the sum of all input numbers entered
class LoopsControlStatement1 {

	public static void main(String[] args) {
		double n, sum =0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: Enter a negative number to stop: \n");
		while(true)
		{
		n=sc.nextDouble();
		if(n<0.0)
		{
			break;
		}
		sum += n;
		}
		System.out.println("Sum is "+sum);
		

	}

}



class NestedLoopsProblem {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5; j++)
			{
				if(i == 3 && j == 3)
					break;
				System.out.print("$");
			}
			{
				System.out.println();
			}
		}

	}

}


class NestedLoopsProblem1 {

	public static void main(String[] args) 
	{
		outerloop:  //Label
		for(int i=1;i<=5;i++)
		{
			innerloop:
			
			for(int j=1;j<=5; j++)
			{
				if(i == 3 && j == 3)
					break outerloop;
				System.out.print("$");
			}
			{
				System.out.println();
			}
		}

	}

}
class LoopContinue
{
	public static void main(String[] args)
	{
		for(int i = 1;i<=10;i++)
		{
			if(i == 7)
			continue;
			System.out.println(i);
		}
	}
}

class NestedLoopsContinue {

	public static void main(String[] args) 
	{
		outerloop:  //Label
		for(int i=1;i<=5;i++)
		{
			innerloop:
			
			for(int j=1;j<=5; j++)
			{
				if(i == 3 && j == 3)
					continue outerloop;
				System.out.print("*"); //put i in bracket to know how it works
			}
			{
				System.out.println();
			}
		}

	}

}
