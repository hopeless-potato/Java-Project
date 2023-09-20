package inheritance;

public class Windows extends OS {
	
	public void method2() {
		System.out.println("i am child1");
	}

	public static void main(String[] args) {
		
		Windows obj=new Windows();
		obj.method2();
		obj.method1();
		
		Linux ref=new Linux();
		ref.method3();
		
	}
}
