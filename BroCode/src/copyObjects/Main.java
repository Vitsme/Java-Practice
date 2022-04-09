package copyObjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Chevrolet","Camaro",2021);
		//Car car2 = new Car("Ford","Mustang",2022); hide for method 2
		
		
		//Step1 I want to copy the car1 object to the car 2 don't use car 2 = car1 because address need to be different memory
		//car2.copy(car1); hide for method 2
		
		//Step1 method 2 using overloaded method
		Car car2=new Car(car1); // similar car but different location
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}

}
