package methodOverloading;

public class MethodOverloading2 {
	
	static void test()
	{
		System.out.println("test method with no argument");
	}
	static void test(int a)
	{
		System.out.println("test method with 1 argument");
	}
	static void test(int a, int b)
	{
		System.out.println("test method with2 argument");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test(3,4);
		test(10);
		
		
	}

}
