package arrayrotation;

public class Rough 
{
	public static void main(String[] args)
	{
		java.util.ArrayList<String> futureMonths =
				new java.util.ArrayList<String>();
		
		
		
		int month = 2;
		
		switch (month)
		{
		case 1: futureMonths.add("January");
		case 2: futureMonths.add("February");
		case 3: futureMonths.add("March");
		case 4: futureMonths.add("April");
		case 5: futureMonths.add("May");
		case 6: futureMonths.add("June");
		case 7: futureMonths.add("July");
		case 8: futureMonths.add("August");
		case 9: futureMonths.add("September");
		case 10: futureMonths.add("October");
		case 11: futureMonths.add("November");
		case 12: futureMonths.add("December");
		break;
		default : break;
		}
		
		if(futureMonths.isEmpty())
		{
			System.out.println("Invalid month number");
		}
		else
		{
			for(String monthName : futureMonths)
			{
				System.out.println(monthName);
			}
		}
	}
}
class SwitchDemo
{
	public static int getMonthNumber(String month)
	{
		int monthNumber = 0;
		
		if(month == null)
		{
			return monthNumber;
		}
		switch(month.toLowerCase())
		{
		case "January": monthNumber = 1;
		break;
		
		case "February": monthNumber = 2;
		break;
		
		case "March": monthNumber = 3;
		break;
		
		default: monthNumber =0;
		break;
		}
		return monthNumber;
	}
	public static void main(String[] args)
	{
		String month = "March";
		
		int returnedMonthNumber = SwitchDemo.getMonthNumber(month);
		
		if(returnedMonthNumber == 0)
		{
			System.out.println("Invalid Month");
		}else
		{
			System.out.println(returnedMonthNumber);
			
		}
	}
}


//The while statement continually executes a block of statements while a particular condition is true. Its syntax 
//can be expressed as
class WhileDemo
{
	public static void main(String[] args)
	{
		int count =1;
		while(count < 11)
		{
			System.out.println("count is: "+count);
			count++;
		}
	}
}

class DoWhileDemo
{
	public static void main(String[] args)
	{
		int count =1;
		do
		{
			System.out.println("Count is: "+count);
			count++;
		}
		while(count<11);
	}
}


class ForDemo
{
	public static void main(String[] args)
	{
		for(int i=1; i<11; i++)
		{
			System.out.println("Count is: "+i);
		}
	}
}
class EnhancedForDemo
{
	public static void main(String[] args)
	{
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for(int item:numbers)
		{
			System.out.println("Count is: "+item);
		}
	}
}


class BreakDemo
{
	public static void main(String[] args)
	{
		int[] arrayOfInts =
			{
					32, 87, 3, 589,
					12, 1076, 2000,
					8, 622, 127
			};
		int searchfor = 3;
		int i;
		
		boolean foundIt = false;
		for(i = 0; i<arrayOfInts.length; i++)
		{
			if(arrayOfInts[i] == searchfor)
			{
				foundIt = true;
				break;
			}
			
		}
		if(foundIt)
		{
			System.out.println("Found "+searchfor+" at index "+ i);
		}else
		{
			System.out.println(searchfor + " not in the array");
		}
		
		
	}
}

class BreakWithLabelDemo
{
	public static void main(String[] args)
	{
		int[][] arrayOfInts =
			{
					{ 32, 87, 3, 598 },
					{12, 1078, 2000, 8 },
					{622, 127, 77, 955 }
			};
		
		int searchfor = 12;
		int i;
		int j = 0;
		boolean foundIt = false;
		
		
		search://label
		
		for(i=0;i<arrayOfInts.length;i++)
		{
			for(j=0; j<arrayOfInts[i].length;j++)
			{
				if(arrayOfInts[i][j] == searchfor)
				{
					foundIt =true;
					break search;
				}
			}
		}
		if (foundIt)
		{
			System.out.println("Found "+searchfor+" at "+i+", "+j);
		}else
		{
			System.out.println(searchfor+" not in the array");
		}
	}
}

class ContinueDemo
{
	public static void main(String[] args)
	{
		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		//int max =searchMe.length();
		int numPs = 0;
		
		for(int i= 0; i<searchMe.length();i++) // i<max
		{
			//interested only in p's 
			if(searchMe.charAt(i) != 'p')
				continue;
			
			//process p's
			numPs++;
					
		}
		System.out.println("Found "+numPs+ " p's in the string.");
	}
}


class ContinueWithLabelDemo
{
	public static void main(String[] args)
	{
		String searchMe = "Look for a substring in me";
		String substring = "sub";
		boolean foundIt =false;
		
		int max = searchMe.length() - substring.length();
		
		test:
			
			for(int i = 0; i<max; i++)
			{
				
				int n = substring.length();
				int j =i;
				int k =0;
				
				while(n-- != 0)
				{
					if(searchMe.charAt(j++) != substring.charAt(k++)) 
					{
						continue test;
					}
				}
				
				foundIt = true;
				break test;
				
			}
		System.out.println(foundIt ? "Found It": "Didn't find it");
	}
}




