package polymorphism;

public class Main {

	public static void main(String[] args) {
		// polymorphism = greek word for poly - "many", morph - "form"
		//					The ability of an object to identify as more than one type
		
		//Step 1
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		//Step 2 Store all the above objects in array called racers
		Vehicle[] racers = {car,bicycle,boat}; //here vehicle is a polymorphism if we use car it only stores car similarly others 
		
		//Step 4 call objects individually
		/* below method will work but we will use another method using for loop
		car.go();
		bicycle.go();
		boat.go();
		*/
		for(Vehicle x  :racers) {
			x.go();
			
		}
	}

}
