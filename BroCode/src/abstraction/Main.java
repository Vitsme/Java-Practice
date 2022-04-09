package abstraction;

public class Main {

	public static void main(String[] args) {
		//abstract = abstract classes cannot be instantiated, but they can have a subclass
		// 			 abstract methods are declared without an implementation
		
		//Step 1
		//Vehicle vehicle = new Vehicle();  //instance  //Due to use of abstract in Vehicle unable to access here
		Car car = new Car();		//instance		
		
		car.go();

	}

}
