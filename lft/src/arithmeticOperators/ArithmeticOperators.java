package arithmeticOperators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// +-*/%
		
		int a = 11, b = 2, c;
		c = a + b;
		
		double a1 = 11,b1 = 2,c1;
		c1 = a1 / b1;
		
		
		System.out.println(c);
		System.out.println(c1);
		

	}

}
 class CompoundAssignment {

	public static void main(String[] args) {
		// +-*/%
		
		int a = 11, b = 2, c;
		
		a = a + 3; // "a" value is added with 3 and store it on "a" value
		//a += 3; is a another way of compound assignment
		
		
		
		System.out.println(a); 
		
		

	}

}
 class IncrementOrDecrementOperator {

	public static void main(String[] args) {
		// +-*/%
		
		int a = 11, b = 2, c;
		
		a = a + 3; // "a" value is added with 3 and store it on "a" value
		//a += 3; is a another way of compound assignment
		
		//IncrementOperator
		a++;//post increment ex. a = 3; c= a++ c=3,a=4 first it will assign the value of c and increase the value of a
		++a;//pre increment ex. a=3; c = ++a c=4,a=4 first it will increase the value of a and assigned the increased value in c
		
		//DecrementOperator
		a--;//post decrement
		--a;//pre decrement
		//In this Operator only for adding 1 or subtract 1
		
		
		System.out.println(a);
		
		int x =15;
		x = x++ + ++x;   // first for x++  x value is assigned as x = 15 and x changed to  16 so it assigns x++ is 15  now x value is 16
						 // ++x already x is become 16 it changes 16 to 17 due to predecrement ++x is 17
						 // 15 + 17 = 32
		System.out.println(x);
		
		

	}

}
