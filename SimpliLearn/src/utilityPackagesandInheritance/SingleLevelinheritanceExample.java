package utilityPackagesandInheritance;



class parentclass
{
	//Declare an instance method
	public void methodA()
	{
		System.out.println("Parent class method is called");
	}
}

//Declare a derived class or subclass and extends class A
class childclass extends parentclass
{
	public void methodB()
	{
		System.out.println("Child class method is called");
	}
}

public class SingleLevelinheritanceExample 
{

	public static void main(String[] args) 
	{
		childclass obj = new childclass();
		
		obj.methodA(); // MethodA of B will be called because by default,
		//it is available in B.
		
		obj.methodB(); // methodB() of B will be called.

	}

}
