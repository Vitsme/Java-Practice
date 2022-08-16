
public class Switch {

	public static void main(String[] args) 
	{
		int month = 4;
		
		String month1;
		
		switch (month)
		{
		
		case 1:
			month1 = "January";
			break;
		case 2:
			month1 = "February";
			break;
		case 3:
			month1 = "March";
			break;
		default:
			month1 ="Invalid Month";
			break;
		}
		System.out.println(month1);

	}

}
