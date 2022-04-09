package statickeyword;

public class Friend {

	//step 1 constructor
	String name;
	static int numberOfFriend; //Step 2 using Static
	
	Friend(String name)
	{
		this.name = name;
		numberOfFriend++; //Step 5
	}
	//Step7
	static void displayFriends()
	{
		System.out.println("You have "+numberOfFriend+" friends");
	}
}
