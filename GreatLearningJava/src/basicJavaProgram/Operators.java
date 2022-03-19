package basicJavaProgram;

public class Operators 
{

	public static void main(String[] args) 
	{
		//arithmetic operators +,-,*,/
		int a = 10;
		int b = 20;
		boolean c = true;//logical
		boolean d = false;//logical
		System.out.println(a+b);
		
		//relational operators >,==,!=
		System.out.println(a>b);
		
		//logical operators and,or
		System.out.println(c && d);// for and it shows when the operator is true c && c otherwise it shows false
		System.out.println(d || d);// for or it shows either one of the operator is true  d||d it shows false
	}

}
