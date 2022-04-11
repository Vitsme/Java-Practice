package switches;

public class SwitchesPractice {

	public static void main(String[] args) {
		// 
		
		String powerrangers = "Special Ranger";
		
		switch(powerrangers)
		{
			case "Red": System.out.println("Lead the team");
			break;
			case "Blue": System.out.println("Second ranger in the team");
			break;
			case "Yellow": System.out.println("girlranger in the team");
			break;
			case "Special Ranger": System.out.println("Ranger with special ability");
			break;
			default: System.out.println("You are not a ranger!");
		}
		
		

	}

}
