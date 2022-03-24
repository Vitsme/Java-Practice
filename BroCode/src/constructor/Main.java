package constructor;

public class Main {

	public static void main(String[] args) 
	{
		// constructor = special method that is called when an object is instantiated (created)
		
		
		Human human1 = new Human("Rick",65,70);     // passing from human name, age, weight
		Human human2= new Human("Jason",40,68);  
		System.out.println(human2.name);
		
		human2.eat();
		human1.drink();
	}

}
