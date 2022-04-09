package inheritance;

public class Main {

	public static void main(String[] args) {
		// inheriance = the process where one class acquires, 
		// 				the attribute and methods of another.
		
		//Step 3 call the car and bicycle object
		
		Car car = new Car();
		car.go();
		Bicycle bike = new Bicycle();
		bike.brake();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		
		//step5
		System.out.println(car.doors);
		System.out.println(bike.pedals);
	}

}
