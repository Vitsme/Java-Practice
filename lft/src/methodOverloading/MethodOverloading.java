package methodOverloading;

public class MethodOverloading {
	
	static int max(int a, int b)
	{
		return a>b? a:b; //ConditionalOperator
	}
	static double max(double a, double b)
	{
		return a>b? a:b;
	}
	static char max(char a, char b)
	{
		return a>b?a:b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(5,7));
		System.out.println(max(5.5,8.2));
		System.out.println(max('p','c'));
		
		//Math.abs is the inbuild method overload by java it will convert negative number to positive
		System.out.println(Math.abs(-4.5));//passing double 
		System.out.println(Math.abs(10));//passing integer
		

	}

}
