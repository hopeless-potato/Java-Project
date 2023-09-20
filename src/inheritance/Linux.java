package inheritance;

public class Linux extends OS {
	
	public void method3() {
	System.out.println("i am child2");
	
	}
	
	public static void main(String[] args) {
		
		Linux obj=new Linux();
		obj.method3();
		obj.method1();
		
		Windows ref=new Windows();
		ref.method2();
		
	}
}
