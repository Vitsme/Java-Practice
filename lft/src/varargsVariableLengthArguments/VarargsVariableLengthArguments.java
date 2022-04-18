package varargsVariableLengthArguments;

public class VarargsVariableLengthArguments {
	
	static	int minValue(int...vals) //we can recieve more number of arrays using this varargs
		{
			int min = Integer.MAX_VALUE; //or int min = vals[0];
			
			for(int k: vals)
			{
				if(k<min)
					min =k;
				
			}
			return min;
		}

	public static void main(String[] args) {
		int m = minValue(5,2,3);
		System.out.println(m);
		int n = minValue(4,7,2,0,-1);
		System.out.println(n);
		
		int o = minValue();//it is the max value of integer
		System.out.println(o);

	}

}
