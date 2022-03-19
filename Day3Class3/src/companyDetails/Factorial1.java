package companyDetails;

public class Factorial1 
{
	//method
	//factorial
	//function definition
	static int factorial(int n) //int is a function type int n is a function parameter value
	{   //function body
		int i,fact = 1;
		for(i=1; i<=n; i++)
			fact=fact*i;
		return fact;
		
	}

	public static void main(String[] args) 
	{
		int n1 = 4, n2 =5, n3 =7;
		System.out.println(factorial(n1));
		System.out.println(factorial(n2));
		System.out.println(factorial(n3));

	}

}
