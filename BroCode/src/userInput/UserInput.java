package userInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("How old are you: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		//after nextInt we can't able to call nextLine method so we need to use \n
		System.out.println("What is your favourite food: ");
		String food = scanner.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);
		
		

	}

}
