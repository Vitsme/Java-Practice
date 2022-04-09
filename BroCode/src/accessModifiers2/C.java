package accessModifiers2;
import accessModifiers1.*; 

public class C {   //If we remove public here we can't able to access on other package
	
	//Step 1 Default Method
	String defaultMessage ="This is the default"; //It will access only on same package  C and Asub
	//Step 3 Public Method
	public String publicMessage ="This is the public";//It is available and access any packages
	//Step5 Protected Method
	protected String protectedMessage ="This is Protect";//It  is access by the same package or
														// It will access the contents of A ex: A class to Asub
														//simply something related to the same package or other package it only be accessible
	//Step 7 Private Method
	private String privateMessage ="This is Private"; //It is only accessible on the class it is present
}
