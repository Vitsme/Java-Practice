package operator;

import java.util.Scanner;

public class Practice {
//And
	public static void main(String[] args) {
		
		int temp =15;
		
		if(temp>30)
		{
			System.out.println("Hot outside");
		}
		else if(temp>20 && temp<30)
		{
			System.out.println("Worm outside");
		}
		else 
		{
			System.out.println("Cold outside");
		}

	}

}
class Practice1 {
	//Or
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("You are in the Pokemon world! Ente x or X to quit the Game:");
			String response = sc.next();
			
			if(response.equals("x") || response.equals("X"))
			{
				System.out.println("You quit the game");
			}
			else 
			{
				System.out.println("You are in Pokemon world!");
			}
			
		}
}

class Practice2 {
	//not
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("You are in the Pokemon world! Ente x or X to quit the Game:");
			String response = sc.next();
			
			if(!response.equals("x") && !response.equals("X"))
			{
				System.out.println("You are in Pokemon world!");
				
			}
			else 
			{
				System.out.println("You quit the game");
			}
					
}
}


