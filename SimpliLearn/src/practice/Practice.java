package practice;

public class Practice {
	
	
	public int CompareNum(int a,int b)
	{
		
		
				
		if(a>b)
		{
			return a;
		}else
		{
			return b;
		}

	}

	public static void main(String[] args) 
	{
		Practice num = new Practice();
		int result = num.CompareNum(15,7);
		System.out.println(result);
	
	}
}
