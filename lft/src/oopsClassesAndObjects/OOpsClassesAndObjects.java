package oopsClassesAndObjects;

public class OOpsClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box =new Box();
		
		box.length=10;
		box.breadth=15;
		box.height=20;
		Box Wbox = new Box();
		Wbox.height =50;
		
		System.out.println(box.breadth);
		System.out.println(Wbox.height);
		

	}

}

class Box
{
	int length;
	int breadth;
	int height;
	
	
	
	
}
