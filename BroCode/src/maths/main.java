package maths;

public class main {

	public static void main(String[] args) 
	{
		double x =3.14;
		double y = -10;
		double z = Math.max(x, y);
		double z1 = Math.min(x, y);
		double z2 = Math.abs(y);//absolute value is a number without negative sign
		double z3 = Math.sqrt(x);
		double z4 = Math.round(x);
		double z5 = Math.ceil(x); // to round the value to high 3.14 to 4.00
		double z6 = Math.floor(x); // to round the value to low 3.14 to 3.00
		System.out.println(z);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		System.out.println(z6);
	}

}
