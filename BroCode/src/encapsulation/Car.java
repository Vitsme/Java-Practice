package encapsulation;

public class Car {
	
	//Step 1
	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year)
	{
		this.setMake(make);//this.make = make;  -- Due to Step 5 setters we need to use set
		this.setModel(model);//this.model = model;
		this.setYear(year);//this.year = year;
	}
	//Step3 - to create getters for access the private
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public int getYear()
	{
		return year;
	}
	
	//Step 5 - to create setters for change the value of the private to access
	
	public void setMake(String make)
	{
		this.make = make;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	
	

}
