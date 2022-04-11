package bitwiseOperator;

public class BitwiseOperator {
	// Bitwise Operator
	// ~ Not       <<left Shift
	// & And       >>right Shift
	// | Or        >>>right shift zero fill
	// ^ Exor
	/*
	 * while a  b  a&b      a b a|b
	 * 		 0  0   0       0 0  0
	 *       0  1   0       0 1  1
	 *       1  0   0       1 0  1
	 *       1  1   1       1 1  1
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int a=10,b=15;
		int c = a & b;
		System.out.println("a & b is "+c);
		c = a | b;
		System.out.println("a | b is "+c);
		c = a ^ b;
		System.out.println("a ^ b is "+c);
		c = ~a;
		System.out.println("~a is "+c);

	}

}
class BitwiseShiftOperator {
	// Bitwise Operator
	//      <<left Shift
	//      >>right Shift
	//      >>>right shift zero fill
	
	

	public static void main(String[] args) {
		
		byte a=4;
		int b=-5;
		//a &= 1;  We can also use a compound assignment in a bitwise operator
		boolean c = true, d = false;//0 or false , 1 or true 
		System.out.println(c&d);
		System.out.println(a<<28); // a is a byte but result shows in int
		System.out.println((byte)a<<28);//if i want a result in byte 
		System.out.println(b>>1);
		System.out.println(b>>>1);
		
		

	}

}
