package practice;

import java.util.Arrays;

public class TwoDArrayRevision {
	
	public static void main(String[] args) {
		
//		String numbers[][]= {{"one", "two", "three"},{"four", "five", "six", "seven"}};
//		
//		int a=numbers[0].length;
//		int b=numbers[1].length;
//		
//		System.out.println(numbers.length);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a+b);
//		
//		System.out.println("");
//		
//		String color[][]=new String[2][3];
//		color[0][0]="black";
//		color[0][1]="red";
//		color[0][2]="yellow";
//		color[1][0]="orange";
//		color[1][1]="pink";
//		color[1][2]="blue";
//		
//		//System.out.println(Arrays.toString(color[0]) + Arrays.toString(color[1]));
//		
//		for(int i=0; i<color.length; i++) {
//			for(int j=0; j<color[i].length; j++) {
//				System.out.print(color[i][j] + " "); //color[0][0]
//			}
//			
//		}
//		
//		System.out.println("");
//		
//		for(String[] k:numbers) {
//			System.out.println(Arrays.toString(k));
//			
//		}
		
		String z="hello i love java";
		//System.out.println(z.length());
		
		String x[]=z.split(" ");
		System.out.println(x.length);
		System.out.println(Arrays.toString(x));
		
		for(int i=0; i<x.length; i++) {
		String reverse=x[i]; //hello //i //love //java
		
		for(int j=reverse.length()-1; j>=0; j--) {  //hello = lenght of hello = 5
			System.out.print(reverse.charAt(j));          //         index of hello = 4
			
		}
		System.out.print(" ");
		}
	}

}
