package projectPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingReservation {

	public static void main(String[] args) 
	{
		//ArrayList
		ArrayList<Bus>buses = new ArrayList<Bus>();
		ArrayList<Booking>bookings = new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,true,4));
		buses.add(new Bus(3,true,3));
		
		
		
		for(Bus a : buses)
		{
			a.displayBusInfo();
		}
		
		int userOpt = 1;
		Scanner sc = new Scanner(System.in);
		
		while(userOpt == 1)
		{
		System.out.println("Enter 1 to Book and 2 to Exit: ");
		userOpt =sc.nextInt();
		
		if(userOpt ==1)
		{
			Booking booking  = new Booking();
			if(booking.isAvailable(bookings, buses))
			{
				bookings.add(booking);
				System.out.println("Your booking is confirmed");
			}else
			{
				System.out.println("Sorry, Bus if full change date or bus No...........!");
			}
				
		}
		}
		

	}

}
