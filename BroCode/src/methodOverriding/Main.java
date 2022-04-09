package methodOverriding;

public class Main {

	public static void main(String[] args) {
		// method overriding = Declaring a method in sub class,
		// 						which is already present in parent class.
		//						done so that a child class can give its own implementation

		//Step3
		Dog dog  = new Dog();
		
		dog.speak();
		
		Animal animal = new Animal();
		animal.speak();
			
	}

}
