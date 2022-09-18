package utilityPackagesandInheritance;

class Parent
{
	public void msgA()
	{
		System.out.println("Method of class A");
	}
}

class Child extends Parent
{
	//Empty class B, inheritance msgA of parent class A
}

class Child2 extends Parent
{
	//Empty class c, inheritance msgA of parent class A
}

class Child3 extends Parent
{
	//Empty class D, inheritance msgA of parent class A
}

public class HierarchicalinheritanceExample 
{

	public static void main(String[] args) 
	{
		// Create the object of class B, class C, and Class D
		
		
			Child obj1 = new Child();
			Child2 obj2 = new Child2();
			Child3 obj3 = new Child3();
			
			//Calling inherited function from the base class.
			obj1.msgA();
			obj2.msgA();
			obj3.msgA();
			

	}

}
