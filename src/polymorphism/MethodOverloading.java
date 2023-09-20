package polymorphism;

public class MethodOverloading {

	public void method(int a, double b) {
		System.out.println(a+b);
	}
	
	public void method(double a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.method(5, 6.5);
		obj.method(4.5, 7);
		
	}
	
}	
