package practice;

import java.util.Arrays;

public class Revision {
	
	public static void main(String[] args) {
		
     int a[]= {10, 20, 30, 40, 50, 60}; // first method to declare arrays
     System.out.println(a.length);
     System.out.println(Arrays.toString(a));
     
	 int b[]=new int[5];
	 b[0]=10;
	 b[1]=20;
	 b[2]=30;
	 b[3]=40;
	 b[4]=50;
	 
	 System.out.println(b.length);
	 
	 for(int i=0; i<b.length; i++) {
		 System.out.print(b[i] + " ");
		 
	 }
	 
	 System.out.println('\n');
	 
	 a[2]=50;
	 
	 for(int k:a) {
		 System.out.print(k + " ");
		 
	 }
	 
	 System.out.println('\n');
	 
	 for(int i=a.length-1; i>=0; i--) {
		 System.out.println(a[i]);
	 }
	 
	}
	
}


