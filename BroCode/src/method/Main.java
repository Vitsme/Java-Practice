package method;

public class Main {

	public static void main(String[] args) 
	{
		// method = a block of code that is executed whenever it is called upon

		//What ever thing i type here is belongs to main method
		
		//step5
		String name = "Bro";
		//step7
		int age =21;
		
		//step6 & 8 adding age for step 8
		hello(name,age);
		
		//step 2
	//	hello();
		//step4 - how many times we types it will replicate to the console
		//hello();
		//hello();
	}
	//creating new method
	
	//step 1                  
	//static void hello(String name)      //step 3 we need to add static otherwise unable to make a static to non static method
	static void hello(String title,int age)  //step 6 & step 9 adding String name in bracket we can use any word in the name
	{
		//In this area belongs to hello method
		System.out.println("Hello "+title);
		//step10
		System.out.println("Your age is "+age);
	}

}
