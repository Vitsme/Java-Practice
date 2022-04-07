package array2d;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] cars = {
				{"KIA", "Citron", "Renault"},
				{"TATA","Nisson", "Hyundai"},
				{"Wolkswagan","Honda","Jeep"}
				
		};
		
		for(int i=0; i<cars.length; i++)
		{
			System.out.println();
			for(int j=0; j<cars[i].length; j++)
			{
				System.out.print(cars[i][j]+ " ");
			}
		}
	}

}
