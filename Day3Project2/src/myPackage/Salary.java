package myPackage;
public abstract class Salary
//abstract class can have normal methods as well as abstract methods
//re usability
// Ensure that derived class must override abstract methods\
//Template
{
	public int PF(int basic) // it is common for all companies
	{
		return 12*basic/100;
	}
	
	public int HRA(int basic) // it is common for all companies
	{
		return 40*basic/100;
	}
	public abstract int SA();  //special allowance // it is used by all companies but not common
	
	public abstract int TA(); //travel allowance  // it is used by all companies but not common
	
}

class MicrosoftSalary extends Salary
{

	@Override
	public int SA() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public int TA() {
		// TODO Auto-generated method stub
		return 2500;
	}
	
	
	
	
}

class CognizantSalary extends Salary
{
	
	public int SA()  //special allowance
	{
		return 10000;
	}
	public int TA() //travel allowance
	{
		return 1500;
	}
}


class InfosysSalary extends Salary
{
	
	public int SA()  //special allowance
	{
		return 10000;
	}

	@Override
	public int TA() {
		// TODO Auto-generated method stub
		return 1000;
	}
	
	
	
	
	
}