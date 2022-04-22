package project;

public class Bus 
{
//Instance variables for bus classes or
//busno, AC, capacity
	
	private int busNo;
	private boolean ac;
	private int capacity; // due to private we need to create a get and set method
	
	Bus(int no, boolean ac, int cap)
	{
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getBusNo()
	{
		return busNo;
	}
	
	public boolean isAc()
	{
		return ac;
	}
	
	public void setAc(boolean val)
	{
		ac = val;
	}
	
	public int getCapacity() //get method or accessor method
	{
		return capacity;
	}
	public void setCapacity(int cap) //set method or mutater method
	{
		capacity = cap;
	}
	
	//Creating method for display  bus info
	public void displayBusInfo()
	{
		System.out.println("Bus No: "+ busNo +" Ac: "+ ac +" Total Capacity: "+ capacity);
	}
	
		
}
