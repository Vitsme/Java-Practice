package java11andOOPsConcepts;

import java.util.Scanner;

public class QuizProgram {

	public static void main(String[] args) 
	{
		//Declaring variables
		int n;
		
		//To Scan the object here
		Scanner sc = new Scanner(System.in);
				
		//running infinite loop		
		while(true)
		{
			//Displaying the set of quiz options
			System.out.println("Who is the founder of Blue Origin? ");
			System.out.println("1. Bill Gates \n2. Tim Cook \n3. Jeff Bezos \n4. Exit");
			
			//reading input from user
			System.out.println("Enter your choice(1/2/3/4)? ");
			n=sc.nextInt();
			
			//validating user choices
			if(n == 3)
			{
				System.out.println("Congratulations!! You guessed the correct answer");
				System.out.println("See You Next Quiz! BYE! BYE!");
				break;
			}
			else if(n == 4)
			{
				break;
			}else
			{
				System.out.println("Wrong choice. Please try again ;) ");
			}
		}
		
	}

}
