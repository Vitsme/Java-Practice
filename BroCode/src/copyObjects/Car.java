package copyObjects;

public class Car 
{
	//Step 1
		private String make;
		private String model;
		private int year;
		
		Car(String make, String model, int year)
		{
			this.setMake(make);
			this.setModel(model);
			this.setYear(year);
		}
		//-------
		
		//Step2 method 2 don't use on method 1
		Car(Car x)					//method 2
		{
			this.copy(x);			//method 2	
		}
		//-------- others are similar
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
		
		//Step2 
		
		public void copy(Car x)
		{
			this.setMake(x.getMake());
			this.setModel(x.getModel());
			this.setYear(x.getYear());
		}
}
