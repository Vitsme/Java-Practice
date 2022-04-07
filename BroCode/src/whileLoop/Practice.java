package whileLoop;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name ="";
		
		while(name.isBlank())
		{
			System.out.println("Enter your name: ");
			name = sc.nextLine();
		}
		System.out.println("Hello "+name);
				
	}
}