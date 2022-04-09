package arrayofobjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		//Step 1
		Food[] refrigerator = new Food[3];//no need for second method
		
		//Step 2
		Food food1 = new Food("Pizza");
		//Step4
		Food food2 = new Food("Hamburger");
		Food food3 = new Food("Hotdog");
		
		
		//Step5 to store food in refrigerator
		//Food[] refrigerator ={food1,food2,food3}; // second method
		refrigerator[0] = food1;//no need for secondmethod
		refrigerator[1] = food2;//no need for secondmethod
		refrigerator[2] = food3;//no need for secondmethod
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
	}

}
