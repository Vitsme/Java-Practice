package utilityPackagesandInheritance;

import java.util.Calendar;
import java.util.Date;

public class ExamplewithUtilityPackages {

	public static void main(String[] args) 
	{
		Calendar objCalendar = Calendar.getInstance();
		//Display Date and time components
		System.out.println("\n Date and Time Components");
		System.out.println("Year: "+objCalendar.get(Calendar.YEAR));
		System.out.println("Year: "+objCalendar.get(Calendar.MONTH));
		System.out.println("Year: "+objCalendar.get(Calendar.DATE));
		//note sameway we can create hour minute second
		
		//let us to add 30 minutes to the current time
		
		objCalendar.add(Calendar.MINUTE, 30);
		Date objDate = objCalendar.getTime();
		System.out.println("\n Date and Time ");
		System.out.println(objDate);
		
	}

}
