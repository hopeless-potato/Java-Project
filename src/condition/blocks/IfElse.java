package condition.blocks;

public class IfElse {
	
	public static void main(String[] args) {
		
	/*	int marks=70;
		
		if(marks>=90) {
					
		System.out.println("pass");
		
		} else if(marks<90 && marks>=70) {
			
			System.out.println("first class");
			
			
		} else if(marks<70 && marks>=50) {
			
			System.out.println("secondclass") ;
			
		} else {
			
			System.out.println("fail"); 
		}  */
		
		
		
		int time=12; 
				
		if(time>12) {
		System.out.println("past 12");
		
		} else if(time<12) {
		System.out.println("am");
		
		
		} else if(time>12 && time<18) {
		System.out.println("pm");
		
		} else {
		System.out.println("12  o clock");
		
		}
		
		String result=(time>10)? "good afternoon." : "good morning.";
		System.out.println(result);
	
		
		// declaring double type variables
	    Double n1 = -1.0, n2 = 4.5, n3 = -5.3, tmp;
	    // or
	   // Double n1= -1.0;
	    //Double n2= 4.5;
	    //Double n3= -5.3;
       //Double tmpd;
//        tmpd=2.2;
//        System.out.println(tmpd);
	    
	    if (n1 >= n2) {

	      // if...else statement inside the if block
	      // checks if n1 is greater than or equal to n3
	      if (n1 >= n3) {
	    	  tmp = n1;
	      }

	      else {
	    	 tmp = n3;
	      }
	    } else {

	      // if..else statement inside else block
	      // checks if n2 is greater than or equal to n3
	      if (n2 < n3) { 
	    	  tmp = n2;
	      }

	      else {
	    	 tmp = n3;
	      }
	    }

	    System.out.println("Largest Number: " +tmp);
		
		
			
   }	
	

}
