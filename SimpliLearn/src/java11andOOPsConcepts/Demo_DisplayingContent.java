package java11andOOPsConcepts;
import java.util.Scanner;

public class Demo_DisplayingContent {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//factorial programme
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to print: ");
		int n = sc.nextInt();
		int fact =1;
		for(int i =1;i<=n;i++)
		{
			fact =fact*i;
		}
		System.out.println(fact);

	}

}
//above factorial program using while loop
class Demo_DisplayingContent2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//factorial programme
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to print: ");
		int n = sc.nextInt();
		int fact=1;
		int i =1;
		while(i<=n)
		{
			fact*=i;
			i++;
		}
		System.out.println(fact);

	}

}
