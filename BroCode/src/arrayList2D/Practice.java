package arrayList2D;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<String>> Bikes = new ArrayList();
		
		ArrayList<String> Kawasaki = new ArrayList();
		Kawasaki.add("H2R");
		Kawasaki.add("zx10r");
		Kawasaki.add("z1000rr");
		
		ArrayList<String> Triumph = new ArrayList();
		Triumph.add("Street Triple");
		Triumph.add("Trident");
		Triumph.add("Rocket");
		
		ArrayList<String> Honda = new ArrayList();
		Honda.add("CB1000RR");
		Honda.add("CB650R");
		Honda.add("FireBlade");
		
		Bikes.add(Kawasaki);
		Bikes.add(Triumph);
		Bikes.add(Honda);
		
		System.out.println(Kawasaki.get(0)); //to get H2R
		System.out.println(Triumph);
		System.out.println(Bikes);
		System.out.println(Bikes.get(1));
		System.out.println(Bikes.get(2).get(2));
	}

}
