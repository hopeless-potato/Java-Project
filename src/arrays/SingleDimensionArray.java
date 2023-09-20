package arrays;

import java.util.Arrays;

public class SingleDimensionArray {
	
	public static void main(String[] args) {
		
		String cars[]= {"volvo", "porsche", "supra", "nissan"};
		
		String numbers[]=new String[4];
		numbers[0]="one";
		numbers[1]="two";
		numbers[2]="three";
		numbers[3]="four";
		
		System.out.println(Arrays.toString(numbers) + " ");
		
		
		System.out.println(cars.length);
		
		cars[3]="corvett";
		
		System.out.println(Arrays.toString(cars));
		
/////////////////////////////////////////// using forLoopmethod/////////////////////////////////////////
	
	 for(int i=0; i<cars.length; i++) {
		System.out.print(cars[i] + " ");

	 }
	 
	 System.out.println();
	 
//////////////////////////////using forEach method///////////////////////////////
	 
	 for(String vehicle:cars) {
		 System.out.print(vehicle + " ");
	 }
 
	  
	 
	}
	
}	