package constructor;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		PracticeMethod Aprillia = new PracticeMethod("GPR250cc ",2022,289000);
		PracticeMethod Ducati = new PracticeMethod("Monster900 ",2016,985000);
		
		Aprillia.sports();
		Ducati.naked();
		System.out.println(Ducati.model +" " + Ducati.price +" "+ Ducati.year);
	}

}
