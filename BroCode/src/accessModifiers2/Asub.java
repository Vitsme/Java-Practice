package accessModifiers2;
//Step 1 extends from accessModifiers1 A class here and import accessModifier1
import accessModifiers1.*; //change A to *



public class Asub extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step2 to get attempt from C class
		
		C c = new C();
		System.out.println(c.defaultMessage);
		System.out.println(c.protectedMessage);
		
		Asub asub = new Asub();
		System.out.println(asub.protectedMessage);

	}
}
