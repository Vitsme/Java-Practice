package toString;

public class Car {

	
	String make = "Ford";
	String model ="Mustang";
	String color = "red";
	int year = 2021;
	
	//Adding method for those attribute to print value otherwise it shows address
	//From below we are using method overloading
	public String toString()
	{
		return make + "\n" + model + "\n" + color +"\n" + year;
	}
	
	
	
}
