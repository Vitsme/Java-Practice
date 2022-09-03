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

//Typecasting - Widening (Converting lower datatype to higher datatype)
class Widening
{
	public static void main(String[] args)
	{
		char c ='F'; 
		int v = c;
		
		//Output is 70 because The ASCI value of F is 70
		System.out.println(v);
		
	}
}



//Typecasting - Narrowing(converting higher datatype to lower datatype)
class Narrawing
{
	public static void main(String[] args)
	{
		int v =70;
		char c = (char) v;  //Explicit
		System.out.println("Character value of the given integer: "+c);
	}
}

//Conditional Statement
class IfStmt
{
	public static void main(String[] args)
	{
		int years =60;
		if(years>18)
		{
			System.out.println("Your age is greater then 18 ");
		}else //else statement
		{
			System.out.println("Your age is lesser then 18");
		}
	}
}

//To find the IfElseStmt
class IfElseStmt
{
	public static void main(String[] args)
	{
		int no = 126;
		if(no%2 == 0)
		{
			System.out.println("even number");
		}
		else 
		{
			System.out.println("Odd number");
		}
		
	}
}




















