package oops;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracticeMethods myBike = new PracticeMethods();
		
		System.out.println(myBike.model);
		System.out.println(myBike.colour);
		
		myBike.brake();
		myBike.drive();
	}

}
