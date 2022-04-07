package arrayList;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("Donut");
		food.add("Burger");
		food.add("Hotdog");
		
		for(int i=0; i<food.size(); i++)
		{
			System.out.println(food.get(i));
		}
		
	}

}
