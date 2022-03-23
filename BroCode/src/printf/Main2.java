package printf;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean myBoolean = true;
		char myChar ='@';
		String myString = "Hi";
		int myInt = 50;
		double myDouble= 1000;
		
		//[Conversion-character]
		System.out.printf("%b",myBoolean);// to print boolean values
		System.out.printf("%c",myChar);
		System.out.printf("%s",myString);
		System.out.printf("%d",myInt);
		System.out.printf("%f",myDouble);
		
		//[width]
		//minimum number of character to be written as output
		System.out.printf("Hello %10s",myString);  // %10s in this value 10 indicate the space between hello and myString
												   // if i put the %-10 indicate the 10 digits space after the word place the mouse
		

		
		//[precision]
		//sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.2f",myDouble);
		
		//[flags]
		//adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus (+) or minus (-) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		System.out.printf("You have this much money %-20f",myDouble);
		System.out.printf("You have this much money %+f",myDouble); //- is not working we need to change in main method for -(minus)
		System.out.printf("You have this much money %020f",myDouble);
		System.out.printf("You have this much money %,f",myDouble);
	}

}
