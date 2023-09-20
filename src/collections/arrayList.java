package collections;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> random=new ArrayList<Integer>();
		random.add(10);
		random.add(20);
		random.add(30);
		random.add(40);
		
		System.out.println(random); // [10, 20 ,30 ,40]
		System.out.println(random.size());  //4
		System.out.println(random.get(1));  //20
		random.set(2, 50); // replaces the value at specific index
		random.add(3, 60); // adds value at specific index and shifts the array to right
		System.out.println(random); // [10, 20, 50, 60, 40]
		random.remove(3); // removes the value at specific index
		System.out.println(random); // [10, 20, 50, 40]
		
	}
	
}
