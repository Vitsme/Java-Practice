package utilityPackagesandInheritance;


class ParentClass1
{
	public void methodX()
	{
		System.out.println("Parent class Method");
	}
}

class Childone extends ParentClass1
{
	public void methodY()
	{
		System.out.println("ClassY child One");
	}
}

class Childtwo extends Childone
{
	public void methodZ()
	{
		System.out.println("ClassZ Child two");
	}
}

public class MultilevelInheritanceExample {

	public static void main(String[] args) 
	{
		Childtwo obj = new Childtwo();
		obj.methodX();
		obj.methodY();
		obj.methodZ();
		

	}

}
