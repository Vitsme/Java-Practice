package stringMethods;

public class Main {

	public static void main(String[] args) {
		// String = a reference data type that can store one or more characters
		//    reference data types have access to useful methods
		
		String name = "Bro";
		
		//boolean result=name.equals("Bro");			 //it checks the  String name and equals name or same
														 //If it is true for both condition it will reflect
		//boolean result=name.equalsIgnoreCase("bro");	 //IgnoreCase to avoid caps mistake
		
		//boolean result=name.isEmpty(); 				 // if String name is empty  ex.String name="";
		
		//char result =name.charAt(0);					// it print the character stored in the name b=0 r=1 o=2
		
		//int result = name.indexOf("o"); 				// it print the value of the character
		
		//int result = name.length(); 					//it shows length of the word
		
		
		//String result = name.toUpperCase();			// convert to uppercase
		
	//	String result = name.toLowerCase();				// convert to lowercase
		
//	String result = name.trim();	// it removes empty space  ex String name =  "      Bro  ";
		
	String result = name.replace('r', 'i');  // it replaces the values
		
		System.out.println(result); 
		
		
		

	}

}
