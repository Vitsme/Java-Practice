 package arrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ArrayList = a resizable array.
					//Elements can be added and removed after compilation phase store reference dat types
		
		//We need to use wrapper class here String is not a wrapper class so that's why we'r using here.
		//Need to import ArrayList utility
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		// useful method forArray List
		
		food.set(0, "sushi"); // to change the value
		food.remove(2);		// remove the value
		//food.clear();	// to clear all the value or element
		
		
		//for(int i=0; i<food.size(); i++)
		for(String i: food)
		{
			System.out.println(i);// to get list of foods
		}

	}

}
