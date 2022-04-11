package gettingInputs;

import java.util.Scanner;

public class GettingInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		System.out.println("Enter Your Age:");
		age =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Blood Group:");
		String bloodGroup =sc.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" Years old");
		System.out.println("Your Blood Group is: "+bloodGroup);

	}

}
