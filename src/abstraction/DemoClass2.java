package abstraction;

public class DemoClass2 implements DemoClass {

	public void method1() {
		System.out.println("abtract method1 body");
	}
	
	public void method2() {
		System.out.println("abstract method2 body");
	}
	
	public static void main(String[] args) {
		
		DemoClass2 obj=new DemoClass2();
		obj.method1();
		obj.method2();
		
		
	}
	
}
