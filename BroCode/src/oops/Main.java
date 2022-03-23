package oops;

public class Main {

	public static void main(String[] args) 
	{
		//object = an instance of a *class* that may contain attributes(characteristic) and methods
		//example: (phone, desk, computer, coffee cup)
		//example for attribute(characters) coffee cup --------- String color ="white"; double temp = 20.0; boolean empty = true;
		//example for methods(action)  coffee cup ------------ drink() {System.out.print("you drink the coffee")}; 
		//												------ spill() {System.out.print("you spill the coffee:(")}; 
		
		Cars myCar = new Cars();
		// note - if i want to create multiple cars use myCar1 /myCar2 similar that we learned in employee
		
		//To display characteristic of cars attributes
		System.out.println(myCar.model);
		System.out.println(myCar.make);
		
		//To display method of the cars
		myCar.drive();
		myCar.brake();
	}

}
