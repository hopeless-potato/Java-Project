package modifier.demo1;

public class Test1 {
	
    public int a=10;
	
	public void method1() {
		System.out.println("demo method");
	}
	
	public void method2() {
		int b=5;
		b=7;
		System.out.println("hello");
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		
		Test1 ref=new Test1();
		System.out.println(ref.a);
		ref.method1();
		ref.method2();
	}
	
	

}
