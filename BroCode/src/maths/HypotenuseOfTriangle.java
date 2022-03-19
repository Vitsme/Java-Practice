package maths;

import java.util.Scanner;

public class HypotenuseOfTriangle {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		//prompt for x and y
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		//formula for triangle hypotenuse c= root of a^2 + b^2
		
		z =Math.sqrt((x*x) + (y*y));
		
		System.out.println("The hypotenuse is : "+z);
		
		//good practice to close the scanner
		scanner.close();
		

	}

}
