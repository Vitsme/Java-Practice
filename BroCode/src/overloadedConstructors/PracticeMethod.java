package overloadedConstructors;

public class PracticeMethod {

		//Attributes
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	
	PracticeMethod()
	{
		
	}
	PracticeMethod(String bread)
	{
		this.bread = bread;
	}
	PracticeMethod(String bread,String sauce)
	{
		this.bread = bread;
		this.sauce = sauce;
		
	}
	PracticeMethod(String bread,String sauce,String cheese)
	{
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	PracticeMethod(String bread,String sauce,String cheese,String topping)
	{
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	
}
