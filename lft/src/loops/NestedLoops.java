package loops;

public class NestedLoops {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5; j++)
				System.out.print("$");
			{
				System.out.println();
			}
		}

	}

}
 class NestedLoops1 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5; j++)
				System.out.print(j);//if i put i it shows 11111,22222,33333
			{
				System.out.println();
			}
		}

	}

}
 //Triangle pattern
 //codeforwin website have a lot of pattern
 class NestedLoops2 {

		public static void main(String[] args) 
		{
			for(int i=1;i<=5;i++)
			{
				
				for(int j=1;j<=i; j++)
					System.out.print(j);//if i put i it shows 11111,22222,33333
				{
					System.out.println();
				}
			}

		}

	}
 
