package shortCircuitAndOperatorPrecedence;

public class ShortCircuitLogicalOperator {

	public static void main(String[] args) {
		// Short circuit logical operator
		// && 
		// ||
		
		int a = 21;
		
		System.out.println(a>20 && a<30);
		
		//in this sequence we are asking a is not inbetween 20 and 30
		System.out.println(a<20 || a>30);

	}

}
 class OperatorProcedence {

	public static void main(String[] args) {
		// Depends on priority for multiple expression higher to lower
		// ++  --(postfix)
		// ++  --(prefix) ~  !  typecast
		// * / %
		// + -
		// >> >>> <<
		// >  >= < <=  instanceof
		// == !=
		// &
		// ^
		// |
		// &&
		// ||
		// ?:
		// ->
		// =
		
		
		
		int a = 21,b=25;
		
		double c = a*b-10 / a;
		
		System.out.println(c);
		
		

	}

}

