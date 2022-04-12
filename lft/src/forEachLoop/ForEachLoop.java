package forEachLoop;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr[] = {5,6,7,8,6,5};
		int sum =0;
		//for loop
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		//foreach loop
		for(int x: arr)  // for each element we can change x to j whatever
		{
			System.out.println(x);
			sum += x;
		}
		System.out.println("Sum is "+sum);
	}

}
