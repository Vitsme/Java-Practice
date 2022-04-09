package variableScope;

import java.util.Random;

//for LocalVariable

public class PracticeMethod {

	PracticeMethod()
	{
		Random random = new Random();
		int number = 0;
		
		roll(random,number);
		
	}
	void roll(Random random, int number)
	{
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}

//For Global Variable
class PracticeMethod1 {
	
	Random random;
	int number;

	PracticeMethod1()
	{
		random = new Random();
		Random random = new Random();
		int number = 0;
		
		roll();
		
	}
	void roll()
	{
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
