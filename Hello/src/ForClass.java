import java.util.Scanner;

public class ForClass {

	public static void main(String[] args) 
	
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name you like to print number of times: ");
		String name = sc.next();
		System.out.println("Enter number of times to print: ");
		int num = sc.nextInt();
		//Condition i<=num;
		for(int i=1; i<=num; i++)
		{
			System.out.println(name);
		}

	}

}

class forLoopInt
{
	public static void main(String[] args) 
	{
		//for(int i = 0; i<=10; i++)
		for(int i = 0; i<=10; i+=2)
		{
			System.out.println(i);
		}
	}
}

class forLoopDecrement
{
	public static void main(String[] args) 
	
	{
		for(int i=10; i>=0; i--)
		{
			System.out.println(i);
		}
	}
}

