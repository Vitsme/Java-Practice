package overLoadedMethods;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = add(2,3);
		System.out.println(a);
		
		
		

	}
		static double add(double x, double y)
		{
			System.out.println("This is overloaded method #1");
			return x + y;
		}
		static int add(int x, int y)
		{
			System.out.println("This is overloaded method #2");
			return x + y;
		}
		static int add(int x, int y, int z)
		{
			System.out.println("This is overloaded method #3");
			return x + y + z;
		}

}
