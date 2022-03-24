package variableScope;

import java.util.Random;

public class DiceRoller 
{
		//Random random;	//created for Global Variable	 not in local variable		
		//int number;		//created for Global Variable	 not in local variable
	
	
	
	DiceRoller(){							//attribute
		//random=new Random(); //for Global
		Random random=new Random();
		int number = 0; 				//both
		//roll();   //for Global
		roll(random,number); //for local
		
	}
	
	void roll(Random random, int number) {			//adding (Local variable)				//method
		number=random.nextInt(6)+1;			//both
		System.out.println(number);			//both
	}
	
	
}
