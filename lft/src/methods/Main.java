 package methods;
//Methods carries out a specific task
//method input - parameters/arguments
public class Main 
{
	static int boxVolume(int length, int breadth, int height)
{
		//int vol;
		//vol =length*breadth*height;
		//return vol;
	return length*breadth*height; //usually return method is follows
}
	static void printline() //in this method we are calling w/o arguments
	{
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) 
	{
		printline();
		int volume = boxVolume(10,4,6);//passing arguments
		System.out.println(volume);
		System.out.println(boxVolume(10,4,6));//i can also directly call here
		printline();
	}

}


//with void without return
class Main1
{
	static void boxVolume(int length, int breadth, int height)
{
		int vol;
		vol =length*breadth*height;
		System.out.println("vol is "+vol);
	
}

	public static void main(String[] args) 
	{
		System.out.println("Hello");
	boxVolume(10,4,6);//passing arguments
	boxVolume(45,2,3);
	
		

	}

}
