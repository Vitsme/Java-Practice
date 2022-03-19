package switchVariables;

public class main {

	public static void main(String[] args) {
		
		String x ="water";
		String y ="milk";
		//Create temp object to swap milk to water and water to milk
		String temp;
		
		
		temp=x;//swaping water to temp
		x=y;//swaping milk to x
		y=temp;//swaping water to y
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);

	}

}
