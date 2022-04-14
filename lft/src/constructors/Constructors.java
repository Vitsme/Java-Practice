package constructors;

//Without Constructors
class Box
{
//attributes
	int length;//instance
	int breadth;
	int height;
	
	
	void setDim(int l,int b,int h) //Method created for assigning the values
	{
		length =l;
		breadth = b;
		height =h;
	}	
	int volume()
	{
		return length*breadth*height;
	}
}
//methods
public class Constructors{
	public static void main(String[] args) 
	{
		Box blackBox = new Box();
		
		blackBox.setDim(20, 5, 4); //we are using method to use control
		
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