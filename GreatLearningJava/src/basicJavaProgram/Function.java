package basicJavaProgram;

public class Function {

	public static void main(String[] args) 
	{
		//method 1
		//calling the function
		vitsme();
		
		//method2
		//parameter funtion
		int a=10;
		int b=20;
		add(a,b);

	}
	//method 1
	public static void vitsme()
	{
		System.out.println("Welcome to vitsme club");
	}
	//method 2
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	

}

class Function2
{
	public static void main(String[] args) 
	{
		Function2 obj = new Function2();
		int x=10;
		int y=20;
		int get_result=obj.add(x,y);
		System.out.println(get_result);
				
	}
	public int add(int num1, int num2)
	{
		int result= num1+num2;
		return result;
	}
	
}

//swapping function

class Function3
{
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		
		swapFunction(x,y);
	}
	public static void swapFunction(int a, int b)
	{
		System.out.println("original values a:" +a+" b:"+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("swap values a:" +a+" b:"+b);
	}
}

//method overloading

class Function4
{
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		
		int r=5;
		
		Function4 obj= new Function4();
		float area_circle=obj.area(r);
		int area_rectangle =obj.area(x, y);
		
		
		System.out.println("area of the circle is:"+area_circle);
		System.out.println("area of the rectangle is:"+area_rectangle);
	}
	public int area(int n1, int n2)
	{
		int result= n1*n2;
		return result;
	}
	public float area(int n)
	{
		float result =3.14f*n*n;
		return result;
	}
}

class GFG

{

    public static void main (String[] args)

    {

    	  boolean a= true;

    	    boolean b = false;

    	System.out.println( a || b);

    }

}

















