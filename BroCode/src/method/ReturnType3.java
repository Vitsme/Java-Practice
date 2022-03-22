package method;

public class ReturnType3 {

	public static void main(String[] args) {
		int x = 3;
		int	y = 4;
							//local variable --- add method not recognize int z  so we can change int a or anything it doesn't matter.
		//int z = add(x,y);  // we are using these in main method as well as add method -technically legal
		
		System.out.println(add(x,y)); // passing value in console too.
	}
	
	static int add(int x , int y) // we are not using void here because we are returning the value so we use int to add value
	{
		
		//int a =x+y;  // we can use any value here so i use  *a* 
		
		return x+y; // we could change here too , delete in a = x+y
	}

}
