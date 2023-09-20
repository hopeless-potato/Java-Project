package exception.handling;

public class TryCatchBlock {
	
	public static void main(String[] args) {
		
		try { 
			int a=10;
			int b=a/5;
			System.out.println(b);
		
			int c[]= {10,20,30,40};
			System.out.println(c[5]);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception is handled");
			
		}
		catch(Exception e) {
			System.out.println("All types of exception are handled");
		} 
		
		finally {
			System.out.println("it will print regardless of any exception");
		}
		
		System.out.println("hello"); 
		
	}

}
	

