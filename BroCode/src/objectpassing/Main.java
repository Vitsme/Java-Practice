package objectpassing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step1
		Garage garage = new Garage();
		Car car = new Car("BMW"); //step 3 assign value BMW
		Car car2 = new Car("Tesla"); //step 6
		//Step5 
		garage.park(car);
		garage.park(car2);
	
	
	}

}
