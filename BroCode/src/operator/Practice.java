package operator;

import java.util.Scanner;

public class Practice {
//And
	public static void main(String[] args) {
		
		int temp =15;
		
		if(temp > 30)
		{
			System.out.println("It's very Hot Outside");
		}
		else if(temp>20 && temp<30)
		{
			System.out.println("It's normal Outside");
		}
		else
		{
			System.out.println("It's cold Outside");
		}

	}

}
class Practice1 {
	//Or
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Imagine you are in the game Enter x or X to quit the game: ");
			String response = sc.next();
			if(response.equals("x") || response.equals("X"))
			{
				System.out.println("You quit the game");
			}
			else
			{
				System.out.println("You are in the game");
			}
			
		}
}

class Practice2 {
	//not
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Imagine you are in the game Enter x or X to quit the game: ");
			String response = sc.next();
			if(!response.equals("x") && !response.equals("X"))
			{
				System.out.println("You are  in the game");
			}
			else
			{
				System.out.println("You quit the game");
			}
			
}
}


