package random;

import java.util.Random;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int x = random.nextInt(6)+1;
		System.out.println("Your random number is: "+x);
		
		double y = random.nextDouble();
		System.out.println("Your random number for double is: "+y);
		
		boolean z = random.nextBoolean();
		System.out.println("Your random number for boolean is: "+z);

	}

}
