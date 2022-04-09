package overloadedConstructors;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMethod pizza = new PracticeMethod("thick crust");
		PracticeMethod pizza1 = new PracticeMethod("thick crust","tomato","mozzerolla");
		
		System.out.println("Here are the ingredients of your pizza");
		System.out.println(pizza.bread);
		System.out.println(pizza1.cheese);
	}

}
