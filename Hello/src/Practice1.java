import java.util.Scanner;

public class Practice1 {

	
	    public static void main(String args[]) 
	    {
	        
	        Scanner obj = new Scanner(System.in);
	        System.out.println("Enter your name: ");
	        String name=obj.nextLine();
	        System.out.println("Enter your age: ");
	        int age=obj.nextInt();
	        obj.nextLine();
	        System.out.println("Enter your fav food: ");
	        String food=obj.nextLine();
	     
	     System.out.println("hello: "+name);
	      System.out.println("your age is: "+age);
	      System.out.println("your fav food is: "+food);
	    }
	}
