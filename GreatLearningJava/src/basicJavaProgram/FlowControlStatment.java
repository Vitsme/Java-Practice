package basicJavaProgram;

public class FlowControlStatment 
{
	//looping Statement - Looping statement are used to repeat a task multiple times,
	//keep filling this bucket with a mug of water *while* it is not full
	// keep *repeating* the song until you close the app
	//Get your salary credited at the end of *each* month!
	public static void main(String[] args) 
	{
	/*
		//while
		int x = 1;
		while(x<=4)
		{
			System.out.println(x);
			x++;
		}
		*/
		
		//for loop
		for(int i =0; i<5;i=i+2)
		{
			System.out.println(i);
		}
		/*
		//for loop2
		for(int i = 0; i<=10; i++)
		{
			System.out.println(i);
		}
*/
	}

}

class PatternProblem
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		
		
		
	}
	
	
	
	
}




