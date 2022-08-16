
public class ifElseNestedIfTernaryOperator {

	//If -Else Statement
	public static void main(String[] args) 
	{
		int score = 76;
		char grade;
		
		if(score >= 90)
		{
			grade = 'A';
		}
		else if(score>=80)
		{
				grade='B';
		}
		else if(score>=70)
		{
			grade = 'C';
		}else
		{
			grade = 'F';
		}
		System.out.println("Grade "+grade);

	}

}

class nestedIf
{
	public static void main(String[] args) 
	{
		int i = 50;
		
		if(i==50)
		{
			System.out.println("i is 50");
			if(i<75)
			{
				System.out.println("i is smaller than 75");
				if(i>25)
				{
					System.out.println("i is greater than 25");
				}
			}
		}
	}
	
		
}


class ternaryOperator
{
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 2;
		
		int result;
		//Using ternaryOperator 
		result = a < b ? a : b;
		/**
		 * if(a<b)
		 * {
		 * result = a;
		 * }else
		 * {
		 * result = b;
		 * }
		 * 
		 */
		
		System.out.println(result);
		
		
	}
	
		
}
