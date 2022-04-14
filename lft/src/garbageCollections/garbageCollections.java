package garbageCollections;



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
		this.breadth = breadth;
		this.height =height;
	}	
	int volume()
	{
		return length*breadth*height;
	}
	
	//void protected finalize()
	{
		//finalize will call when the garbage collection is find any dereference
		
	}
}
//methods
public class garbageCollections{
	public static void main(String[] args) 
	{
		Box blackBox = new Box(5,4,3);
		
		blackBox.setDim(20, 5, 4); 
				
		System.out.println("Your black box is "+ blackBox.volume());	
		
		
		blackBox =null; //1 dereference in garbage collection to delete unwanted memories
		
		
		Box woodBox = new Box(12,4,5);
		woodBox.length =10;
		woodBox.height =5;
		woodBox.breadth =2;		
		System.out.println("Volume of your wood box is " +woodBox.volume());
		
		//no more woodBox
		//now woodBox turned to blackBox 
		woodBox = blackBox;//2 dereference in garbage collection
	}
}

