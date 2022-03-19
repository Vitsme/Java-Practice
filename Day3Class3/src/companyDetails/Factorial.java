package companyDetails;

public class Factorial 
{
	//this one is bad method for factorial 
	public static void main(String[] args) 
	{
		int n1 = 5, i, fact1 =1;
		int n2 = 7, fact2 =1;
		int n3 = 4, fact3 =1;
		
		for(i = 1; i <= n1; i++)
			fact1 = fact1 * i;
		
		for(i=1; i<=n2; i++)
			fact2 = fact2*i;
		
		for(i=1; i<=n3; i++)
			fact3 = fact3*i;
	
		System.out.println(fact1);
		System.out.println(fact2);
		System.out.println(fact3);

	}

}
