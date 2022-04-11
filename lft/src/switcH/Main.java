package switcH;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		char operator;
		System.out.println("Enter the Operator +,-,*,/ or % : ");
		operator =sc.next().charAt(0);
		
		switch(operator)
		{
		case '+' : System.out.println(a + " + " + b + " = "+ (a+b));
		break;
		case '-' : System.out.println(a + " - " + b + " = "+ (a-b));
		break;
		case '*' : System.out.println(a + " *" + b + " = "+ (a*b));
		break;
		case '/' : System.out.println(a + " /" + b + " = "+ (a/b));
		break;
		case '%' : System.out.println(a + " %" + b + " = "+ (a%b));
		break;
		default: System.out.println("You have entered a incorrect character!!"); // we can give default anywhere but we need to give break
		}

	}

}
