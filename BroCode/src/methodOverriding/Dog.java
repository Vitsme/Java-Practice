package methodOverriding;
//Step2 extends animal 
public class Dog extends Animal {
	
//Step 4 and run
	@Override  //Step 5 override annotation need to add for understand by others
	void speak()
	{
		System.out.println("The Dogs goes Bark");
	}
}
