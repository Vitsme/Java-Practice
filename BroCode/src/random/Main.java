package random;
//for random we need to import random utility
import java.util.Random;

public class Main 
{
	public static void main(String[] args)
	{
		//this are not true random numbers but it is darn close called pseudorandom numbers
		Random random = new Random();
		int x = random.nextInt(6)+1;//note () it limits more than 2billion numbers
		//(10) if i put 10 inside it starts with 0 to 10 the limit if don't want 0  +1 outside bracket
		System.out.println(x);
		
		//same way to create double  (0 to 1)and boolean(true/false)
		double y =random.nextDouble();
		System.out.println(y);
		
		boolean z = random.nextBoolean();
		System.out.println(z);
	}
}
