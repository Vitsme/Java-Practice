package passingObject;

public class PossingObjectMain {
	
	static void increment(int a)//i can use this a variable only in this method
	{							//local variable
		a++;
	}

	public static void main(String[] args) {
		int  a = 10;
		increment(a);
		System.out.println(a);
		
	
		

	  }

}
