package utilityPackagesandInheritance;

import java.util.Calendar;
import java.util.Date;

public class Practice {

	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		
		cal.add(Calendar.MINUTE, 45);
		System.out.println(date);
	}

}
