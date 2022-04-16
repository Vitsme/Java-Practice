package passingObject;


class Box
{
	int length; //Instance variable
	int height;
	int breadth;
	static int boxCount; //When class is loaded / common to all method // static means without object
	
	
	static { //static
		System.out.println("From the Static Block");
		boxCount =0;
	}
	Box(int l,int h, int b) //constructor
	{
		length = l;
		breadth = b;
		height = h;
		boxCount++;
	}
	
	boolean isEqual(Box b)
	{
		b.length++;
		if(length == b.length && breadth ==b.breadth && height == b.height)
			return true;
		return false;
	}
	
	Box doubleBox() //Created this method for returning object
	{
		Box temp = new Box(2*length,2*breadth,2*height);
		boxCount++;
		return temp;
		
	}
	static void displayBoxCount()//static
	{
		System.out.println("Box count is: "+boxCount);
	}
}

public class PossingObjectMain2 {

	static void increment(int a)//i can use this a variable only in this method
	{							//local variable
		a++;
	}

	public static void main(String[] args) {
		System.out.println("main starts here..........");
		Box blackBox;
		System.out.println("before creating box obj");
		blackBox =new Box(5,3,4);
		System.out.println("after creating box obj");
		int  a = 10;
		increment(a);
		System.out.println(a);
		
		Box  b1 =new Box(5,3,4);
		Box  b2 =new Box(5,3,4);
		
		Box b3 = b1.doubleBox();//returning object
		System.out.println(b1.length);
		
		System.out.println(b1.isEqual(b2));
		System.out.println(b2.length);
		System.out.println(b3.length);
		
		System.out.println(Box.boxCount);//static
		Box.displayBoxCount(); //static
	
		

	  }

}
