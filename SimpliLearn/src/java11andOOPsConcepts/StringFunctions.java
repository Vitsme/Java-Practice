package java11andOOPsConcepts;

public class StringFunctions {

	public static void main(String[] args) 
	{
		// initializing String with some functions
		
		String var1= "String functions programs";
		String var2="String functions";
		
		//Commonly used string functions
		System.out.println("String Operations are: ");
		
		//Getting Character at specific position
		System.out.println(var1.charAt(3));
		
		//Getting Unicode character at specific index
		System.out.println(var1.codePointAt(5));
		
		//Getting Unicode character before the specific index
		System.out.println(var1.codePointBefore(5));
		
		//counting number of unicode characters between the indexes given
		System.out.println(var1.codePointCount(0, 7));
		
		//Compare two strings lexicographically i.e., based on unicode value
		System.out.println("\nstring comparision function");
		System.out.println(var1.compareTo(var2));
		
		//Compare two strings lexicographically ignoring the case
		System.out.println(var1.compareToIgnoreCase(var2));
		
		//Appends a string with another
		System.out.println("\nConcatenated string");
		System.out.println(var1.concat(var2));
		
		//Check Whether a string contains another string
		System.out.println(var1.contains(var2));
		
		//Check Whether string ends with specific characters
		System.out.println(var1.endsWith("grams"));
		
		//compare and returns true if the strings are equal
		System.out.println(var1.equals(var2));
		
		//compare and returns true if the strings are equal by ignoring the case
		System.out.println(var1.equalsIgnoreCase(var2));
		
		//hash code for a string is computed like this
		//s[0]*31^(n-1) 
		System.out.println(var1.hashCode());
		
		//gets the position of first occurrence of specific characters
		System.out.println(var1.indexOf("programs"));
		
		//verifies if strings are equal 
		String var3 = "demo";
		System.out.println(var3.isEmpty());
		
		//Gets position of last occurence of specific characters
		var3 ="functions program functions";
		System.out.println("\nlast occurence position");
		System.out.println(var3.lastIndexOf("functions"));
		
		//gets string length
		System.out.println(var1.length());
		
		// search string with specific value and replaces with it 
		System.out.println(var3.replace("functions", "java"));
		System.out.println(var3);
		
		//verifies if string starts with given string
		System.out.println(var1.startsWith("string"));
		
		//converts string to lower case
		var1 ="HELLO WORLD";
		System.out.println(var1.toLowerCase());
		
		//converts string to upper case
		var1 ="hello hi how are you";
		System.out.println(var1.toUpperCase());
		
		//trims space before and all the string
		String var4 = "		Hello World	";
		System.out.println(var4);
		System.out.println(var4.trim());
		
		
		
		
				
	}

}
