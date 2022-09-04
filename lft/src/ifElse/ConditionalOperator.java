package ifElse;

public class ConditionalOperator {

	public static void main(String[] args) {
		// conditional operator
		
		int a = 45,b=60;
		int max;
		/*
		if(a>b)
		{
			max = a;
		}else
		{
			max =b;
		}
		*/
	max = (a>b) ? a :b; //conditional operator
		//max = Math.max(a, b);   
		System.out.println(max);		

	}

}
