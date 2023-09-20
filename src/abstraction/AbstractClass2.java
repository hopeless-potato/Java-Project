package abstraction;

public class AbstractClass2 extends AbstractClass {

	void method2() {
		System.out.println("i like linux");
	}
	
	void method3() {
		System.out.println("i like java");
	}
	
	
	public static void main(String[] args) {
		
		AbstractClass2 obj=new AbstractClass2();
		obj.method1();
		obj.method2();
		obj.method3();
	}
	
}
