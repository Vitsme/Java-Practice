package statickeyword;

public class Main {

	public static void main(String[] args) {
		// static = modifier. A single copy of a variable/method is created and shared
		//			The class "owns" the static member
		//step4
		Friend friend1 = new Friend("Spongebob");
		Friend friend2 = new Friend("Doremon");	//step6
		Friend friend3 = new Friend("Oswold"); //step6
		Friend friend4 = new Friend("Pokemon");//step6
		//Step3
		System.out.println(Friend.numberOfFriend);
		Friend.displayFriends();   
	}

}
