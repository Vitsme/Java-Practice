package loopsandpackages;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int[] a = {2,4,3,5,1,6};
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

	}

}
//getting the input from user
class ArrayUser {

	public static void main(String[] args) {
		
		int[] a =  new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 elements of the array:");
		for(int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
