package methods;



class Box
{
//attributes
	int length;//instance
	int breadth;
	int height;
	
	int volume()
	{
		return length*breadth*height;
	}
}
//methods
public class InvokingMethods {
	public static void main(String[] args) 
	{
		Box blackBox = new Box();
		blackBox.length =5;  //Usually we don't allow outside the method to access check constructors
		blackBox.height = 2;
		blackBox.breadth =8;		
		blackBox.volume();	//invoke - We are calling the method with object which means invoke the method using volume
		//if i want to store the  object use int v =blackBox.volume()
		System.out.println("Your black box is "+ blackBox.volume());		
		Box woodBox = new Box();
		woodBox.length =10;
		woodBox.height =5;
		woodBox.breadth =2;		
		System.out.println("Volume of your wood box is " +woodBox.volume());
	}
}
