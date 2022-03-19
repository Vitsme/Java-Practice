package companyDetails1;

import java.util.Scanner;

public class Employee 
{
	// I am not creating public static void main(String[] args) because i am not running here i am running on myclass
	//global variable can readed by all methods in the class
	//tried on default is working
	//tried on public is working
	
	private String name;
	private int age;
	public static String company="Microsoft";// for using multiple employee company is common on variable  so static 
	
	//method 1
	public void readData()
	{
		//note -  if i put variable here it can only readed by this method so i put on global
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = obj.nextLine();
		System.out.println("Enter your age: ");
		age = obj.nextInt();
	}
	//method 2
	public void printData()
	{
		System.out.println("name is "+name);
		System.out.println("Age is "+age);
		System.out.println("company: "+company);
	}

}
