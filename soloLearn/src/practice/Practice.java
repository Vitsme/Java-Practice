package practice;

public class Practice {

	public static void main(String[] args) 
	{
		int result = 0;
		for (int i=0; i<5; i++)
		{
			if(i == 3)
			{
				result += 10;
			}else
			{
				result += i;
			}
		}
		System.out.println(result);
				

	}

}
