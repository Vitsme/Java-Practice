package swapVariables;

import java.util.Scanner;

public class main
{

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Enter the value of x: ");
	double x = sc.nextDouble();
	System.out.println(" Enter the value of y: ");
	double y = sc.nextDouble();
	
	double z = Math.sqrt((x*x) + (y*y));
	System.out.println("Your hypotenuse value is "+z);
	
}
}
