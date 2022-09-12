package practice;

import java.util.*;

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

//Enhanced For loop
class EnhancedForLoop
{
	public static void main(String [] args)
	{
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		for(int items : numbers)
		{
			System.out.println("Count is: "+items);
		}
	}
}

//Nested For Loop
class NestedForLoop
{
	public static void main(String[] args)
	{
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/**
//ArrayList
class ArrayList
{
	public static void main(String[] args)
	{
		List<Integer> arrayList = new ArrayList<>(5);
		
		for(int i =1; i<=5; i++)
		{
			arrayList.add(i);
		}
		System.out.println(arrayList);
		
	}
}
**/

//For With labels
class ForWithLabels
{
	public static void main(String[] args)
	{
		label0:
			for(int a = 1; a<=3; a++)
			{
				label1:
					for(int b=1; b<=3; b++)
					{
						if(a == 3 && b == 3)
						{
							break label1;
						}
						System.out.println(a+" "+b);
					}
			}
	}
}
//while(condition)

class WhileLoopCheck
{
	public static void main(String[] args)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Value: ");
		i = sc.nextInt();
		
		while(i <= 5)
		{
			System.out.println(i);
			i++;
		}
	}
}
//do{Statement}while(Condition)

class DoWhile
{
	public static void main(String[] args)
	{
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First no: ");
		s = sc.nextInt();
		
		do
		{
			System.out.println(s);
			s++;
		}while(s <= 5);
	}
}

//Instance of Operator

class Simplepgm
{
	public static void main(String[] args)
	{
		Simplepgm s = new Simplepgm();
		System.out.println("This is instanceof Simplepgm");
	}
}

//OneDimensional Array
class OneDimensionalArray
{
	static void minimum(int a[])
	{
		int value =a[0];
		for(int m =1; m<a.length;m++)
		{
		if(value>a[m])
			value =a[m];
		}
		System.out.println(value);
		
	}
	
	public static void main(String[] args)
	{
		int x[] = {25,3,13,2,5,21,7};
		minimum (x);
	}
}

/*
 * 		Array Class
 * public static int binarySearch(Object[] a, Object key) ---- Doing Binary Search.
 * public static boolean equals(long[] a, long[] a2)    ---- Comparing 2 Keys.
 * public static void fill(int[] a, int val) ---- Filling data
 * public static void sort(Object[] a) ---- Sorting data
 */


//For Each Loop

class Foreacheg
{
	public static void main(String[] args)
	{
		int[] a = {13,5,78,34};
		int sum =0;
		
		for(int x: a)
		{
			sum += x; //sum = sum+x;
		}
		
		System.out.println("Total: "+sum);
	}
}










