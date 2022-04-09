package interFace;

public class Main {

	public static void main(String[] args) {
		// Interface = a template that can be applied to a close.
		//				similar to inheritance, but specifies what a class has/must do.
		// 				classes can apply more than one interface, inheritance is limited to 1 super
		
		
		//Step3
		Rabbit rabbit = new Rabbit();
		
		rabbit.flee();
		//Step6
		Hawk hawk  = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.flee();
		fish.hunt();
	}

}
