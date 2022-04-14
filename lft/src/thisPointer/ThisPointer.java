package thisPointer;



//With Constructors
class Box
{
//attributes
	int length;//instance
	int breadth;
	int height;
	
	
	Box(int l,int b,int h)//Constructor
	{
		length =l;
		breadth = b;
		height =h;		
	}
	
	
	void setDim(int l,int b,int h) //this pointer
	{
		//this.length =length//for same name in ()
		this.length =l;
		this.breadth = b;
		this.height =h;
	}	
	int volume()
	{
		return length*breadth*height;
	}
}
//methods
public class ThisPointer{
	public static void main(String[] args) 
	{
		Box blackBox = new Box(5,4,3);
		
		blackBox.volume();	
		System.out.println("Your black box is "+ blackBox.volume());		
		Box woodBox = new Box(12,4,5);
		woodBox.length =10;
		woodBox.height =5;
		woodBox.breadth =2;		
		System.out.println("Volume of your wood box is " +woodBox.volume());
	}
}

