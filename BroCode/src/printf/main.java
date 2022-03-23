package printf;

public class main {

	public static void main(String[] args) {
		// printf = an optional method to control, format, and display text to the console window
		//			two arguments =  format string + (object/variable/value)
		// 			%[flags][width] [conversion-character]
		System.out.printf("This is a format string %d",123 );
		System.out.printf(" %d This is a format string ", 123); //displaying 123 at the beginning.
		

		//[width]
				//minimum number of character to be written as output
				//System.out.printf("Hello %10s",myString); 
		//[precision]
				//sets number of digits of precision when outputting floating-point values
				//System.out.printf("You have this much money %.2f",myDouble);
	}

}
