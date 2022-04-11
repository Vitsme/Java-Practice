package overLoadedMethods;

public class Main {

	public static void main(String[] args) {
		//overloaded methods = methods that share the same name but have different parameters
		//method name + parameters = method signature
		
		//int x = add(1,2); // if i put only 2 values it will ended up with overload method #1
		//int x = add(1,2,3,4);
		double x = add(1.0,2.0,3.0,4.0);		
		System.out.println(x);
	}		
	static int add(int a, int b)
	{
		System.out.println("This is overloaded method #1");
		return a+b;
	}
	//static int add(int a, int b) // if i put the same here from the above it will duplicate and error
	// we will resolve this in 2 type 
	//static int sum(int a, int b) changing the method name is not the way here so we will change the parameter
	static int add(int a, int b, int c)
	{
		System.out.println("This is overloaded method #2");
		return a+b+c;
	}
	static int add(int a, int b, int c, int d)
	{
		System.out.println("This is overloaded method #3");
		return a+b+c+d;
	}
	
	//changing int to double
	static double add(double a, double b)
	{
		System.out.println("This is overloaded method #4");
		return a+b;
	}
	
	static double add(double a, double b, double c)
	{
		System.out.println("This is overloaded method #5");
		return a+b+c;
	}
	
	static double add(double a, double b, double c, double d)
	{
		System.out.println("This is overloaded method #6");
		return a+b+c+d;
	}
	

}
