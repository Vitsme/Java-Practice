package accessModifiers1;
import accessModifiers2.*; 
public class A {
	
	//Step6 copy from c class
	protected String protectedMessage ="This is Protect";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step2 to get attempt from C class
		
		C c = new C();
		//System.out.println(c.defaultMessage);
		//Step4
		System.out.println(c.publicMessage);
		
		
		
	}

}
