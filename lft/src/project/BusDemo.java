package project;

import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) {
		
		
		//ArrayList<Integer> nums = new ArrayList<Integer>();
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,true,50));
		buses.add(new Bus(3,true,46));
		
		
		for(Bus b:buses)
		{
			b.displayBusInfo();
		}
		
		int userOpt = 1;
		Scanner sc = new Scanner(System.in);
		while(userOpt==1) 
		{
			System.out.println("Enter 1 to Book and 2 to Exit: ");
			userOpt = sc.nextInt();
				if(userOpt == 1)
				{
					//System.out.println("Booking..............");
					Booking booking = new Booking();
					if(booking.isAvailable(bookings,buses))
					{
						bookings.add(booking);
						System.out.println("Your booking is confirmed");
					}else
					{
						System.out.println("Sorry, Bus is full. Try another bus or date.");
						
					}
				}
		}
	}

}
