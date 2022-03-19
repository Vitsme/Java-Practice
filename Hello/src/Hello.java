
public class Hello {

	public static void main(String[] args) {
	//System.out.println("Hello World");
		int value1 = 23;
		int value2 = (12*2) - 1;
		int value3 = value1*value2*value2;
		//value1 =23;
		System.out.println(value3);

	}

}
class maxandmin
{
	public static void main(String[] args)
	
	{
		int max =2147483647;
		int min= - 2147483648;
		short shortmax = 32767;
		short shortmin = -32768;
		long longmax = 9223372036854775807L;// while using huge number we need to use L
		long longmin = -9223372036854775808L;
		byte bytemax = 127;
		byte bytemin = -128;
	}
}

class float1 
{
	public static void main(String[] args)
	{
		/*
		int value1= 9;
		float value2 = 9;
		double value3 = 9; 
		System.out.println("value 1 ="+ value1);
		System.out.println("value 2 ="+ value2);
		System.out.println("value 3 ="+ value3);
		*/
		int marker =512;
		double percentage = marker * 0.46f;
		System.out.println("percentage:" +  percentage);
			
	}
}