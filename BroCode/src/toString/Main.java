package toString;

public class Main {

	public static void main(String[] args) {
		// toString() = special method that all object inherit,
		// 				that returns a string that"textually represents" an object.
		//				can be used both implicitly and explicitly
		
		Car car = new Car();
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.year);
		
		//what if we print without attribute
		System.out.println(car);//it shows the address of the computer memory
		System.out.println(car.toString());// it print same as the above address

	}

}
