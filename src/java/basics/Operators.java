package java.basics;

public class Operators {
	
	public static void main(String[] args) {
		
		
//////////////////////////Arithmetic Operators/////////////////////////////////////////////		
	
		int a=10;
		int b=26;
		System.out.println(a+b);     // addition
		System.out.println(a+b++);   // post-increment
		System.out.println(++a+b);   // pre-increment
		System.out.println(a+b--);   // post-decrement
		System.out.println(--a+b);   // pre-decrement
				
		System.out.println(a-b);     // substraction
		
		int c=27;
		int d=3;
		
		System.out.println(c/d);     // multiplication
		
		System.out.println(c%d);     // modulus
		

////////////////////////////Comparison Operators///////////////////////////////////////////////
		
		
		byte e=26;
		byte f=32;
		
		System.out.println(e>f);   // Greater than
		System.out.println(e<f);   // Less than
		System.out.println(e>=f);  // Greater than or Equal to
		System.out.println(e<=f);  // Less than or Equal to
		System.out.println(e!=f);  // Not equal to
		System.out.println(e==f);  // Equal to
				
		
////////////////////////////Logical Operators///////////////////////////////////////////
		
		
		short g=127;
		
		System.out.println(g>110 && g<120);  // Logical AND
		System.out.println(g<200 || g>100);  // Logical OR
		System.out.println(!(g==120 && g!=127)); // Logical NOT
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(!(!x==!y));
 		
	}
		

}
