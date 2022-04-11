package userInput;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		String food;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your favourite food: ");
		food = sc.nextLine();
		
		System.out.println("hello "+name);
		System.out.println("Yo you are "+age+" years old");
		System.out.println("I too like "+food);

	}

}
