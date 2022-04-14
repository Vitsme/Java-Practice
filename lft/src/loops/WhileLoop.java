package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int i;
		//while loop condition only follows in while loop i<=5
		//initialization will done in before the loop i=1
		
		
		i=1;
		while(i<=5)//first it checks the conditions and then initialized
		{
			//it i put i=1 in this place it will infinite the initialization
			System.out.println(i);
			i++;  //increment decrement will done in the loop
		}
		
		//do - it first execute the instruction and then check the conditon

	}

}
class WhileLoopUserExecution{

	public static void main(String[] args) {
	int i =1;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How many star do you want? ");
	int n = sc.nextInt();
	
	while(i<=n)
	{
		System.out.print("*");
		i++;
	}
		
	}

}