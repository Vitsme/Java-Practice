package constructor;

public class PracticeMethod {
	String model;
	int year;
	double price;
	
	PracticeMethod(String model, int year, double price)
	{
		this.model=model;
		this.year = year;
		this.price = price;
		
	}
	void sports()
	{
		System.out.println(this.model+"On the MotoGP");
	}
	void naked()
	{
		System.out.println(this.model+"Street cum comutor");
	}
	
}
