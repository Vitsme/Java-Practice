package constructors1;

//With Constructors
class Box
{
//attributes
	int length;//instance
	int breadth;
	int height;
	
	
	Box(int l,int b,int h)//Constructor this method is defined as the name of class is constructor
	{
		length =l;
		breadth = b;
		height =h;		
	}//there is no return type for constructor
	
	
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
public class WithConstructor{
	public static void main(String[] args) 
	{
		Box blackBox = new Box(5,4,3);//Constructor we can set the dimension while creating a object in constructor
		//if we want to change the value above use below one to change value
		//blackBox.setDim(20, 5, 4); //we are using method to use control
		
		blackBox.volume();	//invoke - We are calling the method with object which means invoke the method using volume
		//if i want to store the  object use int v =blackBox.volume()
		System.out.println("Your black box is "+ blackBox.volume());		
		Box woodBox = new Box(12,4,5);
		woodBox.length =10;
		woodBox.height =5;
		woodBox.breadth =2;		
		System.out.println("Volume of your wood box is " +woodBox.volume());
	}
}
