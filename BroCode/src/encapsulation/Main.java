package encapsulation;

public class Main {

	public static void main(String[] args) {
		// Encapsulation = attributes of a class will be hidden or private
		//					Can be accessed only through methods (getters & setters)
		//					You should make attributes private if you don't hava a reason to make them public/protected

		//Step 2
		Car car = new Car("Chevrolet","Camaro",2021);
		//System.out.println(car.make); //in step 2 make shows error due to private
		//Step 4
		//System.out.println(car.getMake());
		
		//Step 6 due to setters method we can able to change the value
		car.setYear(2022);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}

}
