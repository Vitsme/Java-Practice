package oop.method.welcomer;

public class MethodParameters 
{
	//SubMethod
	static void sayHello(String name)
	{
		System.out.println("Your Name is: " +name);
	}
	//MainMethod
	public static void main(String[] args)
	{
		sayHello("Vignesh");
		sayHello("Vitsmeon");
	}
	

}
