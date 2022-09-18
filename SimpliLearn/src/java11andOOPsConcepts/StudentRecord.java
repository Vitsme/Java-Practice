package java11andOOPsConcepts;

class Student
{
	int regNumber;
	String studentName;
	Student(int reg_no, String name) 
	{
		this.regNumber = reg_no;
		this.studentName = name;
	}
	
	}
	


public class StudentRecord 
{

	public static void main(String[] args) 
	{
		//Declare an array of integers
		Student[] arr;
		
		arr = new Student[5];
		
		arr[0] = new Student(01,"Solely");
		arr[1] = new Student(02,"Vignesh");
		arr[2] = new Student(03,"Vitsme");
		arr[3] = new Student(04,"Vitsmeon");
		arr[4] = new Student(05,"Sigma");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Student with Registration Number" + arr[i].regNumber+" is: "+arr[i].studentName);
		}
	}

}
