package array2d;

public class Main {

	public static void main(String[] args) 
	{
		// 2D array = an array of array
		//String[][] cars = new String[3][3];
		//cars[0][0] ="camaro";
		//cars[0][1] ="Corvette";
		//or
		
		
		
		String[][] cars = {
				{ "Camaro", "Corvette","Silverado"},
				{"Mustang","Ranger","F-150"},
				{"Ferrari","Lambo","Tesla"}
								
		};
		
		for(int i=0;i<cars.length;i++)
		{
			System.out.println();
			for(int j=0;j<cars[i].length;j++)
			{
				System.out.print(cars[i][j]+" ");
			}
		}
		
		

	}

}
