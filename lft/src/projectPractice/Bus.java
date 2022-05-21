package projectPractice;

public class Bus 
{
	private int busNo;
	private boolean ac;
	private int capacity;
	
	//constructor
	Bus(int no, boolean ac, int cap)
	{
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	//Creating getters and setters
	
	public int getBusNo()
	{
		return busNo;
	}
	
	public boolean isAc()
	{
		return ac;
	}
	
	public void  setAc(boolean val)
	{
		ac = val;		
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int cap)
	{
		capacity = cap;
	}
	
	//creating display bus info method
	
	public void displayBusInfo()
	{
		System.out.println("BusNO: "+ busNo + " Ac: " + ac + " Total Capacity: "+capacity);
	}
}
