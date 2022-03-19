package basicJavaProgram;

public class Array {

	public static void main(String[] args) 
	{
		char[] a = new char[5];
		
		a[0] = 'a';
		a[1] = 'b';
		a[2] = 'c';
		a[3] = 'd';
		a[4] = 'e';
		
		for(int i=0; i<5; i++)
		{
			System.out.print(a[i]);
		}

	}

}
class Array2
{
	public static void main(String[] args) 
	{
		int[] a = new int[10];
		for(int i=0; i<5; i++)
		{
			a[i]=i;
		}
		for(int i=0; i<5; i++)
		{
			System.out.print(a[i]);
		}
	}
	
}
//Adding to list of array a 01234 and b 56789 to c 5 7 9 11 13
class Array3
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[5];
		
		//creating variable to read data after 5 for b
		int num = 5;
		 //for a
			for(int i = 0; i<5; i++)
			{
				a[i]=i;
			}
		//for b
			for(int i=0; i<5; i++)
			{
				b[i] = num;
				++num;
			}
			//read the data from a
				System.out.print("Value of array a:");
				for(int i=0;i<5;i++)
				{
					System.out.print(a[i]+ " ");
				}
			//read the data from b
				System.out.print("\nValue of array b:");
				for(int i=0;i<5;i++)
				{
					System.out.print(b[i]+" ");
				}	
			//data of c adding data from a and b
				for(int i=0; i<5;i++)
				{
					c[i] = a[i] + b[i];
				}
				System.out.print("\nValue of array c:");
				for(int i=0; i<5; i++)
				{
					System.out.print(c[i]+ " ");
				}
		
		
		
	}
		
}

class MultidimensionalArray
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		int num=0;
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j]=num;
				++num;
			}
		}
		//print
		for(int i=0;i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
			
		}
		
		
		
	}
}
























