package java.basics;

public class Methods {
	
	public void method1() {
		int a=10;
		System.out.println(a);
	}
	
	public static void method2() {
		System.out.println("i love java");
	}
	
	public int method3() {
	 int a=5;
	 return a;
	}
	
	public void method4() {
		int b=5+method3();
		System.out.println(b);
	}
	
	public String method5() {
		String c="methods demo";
				return c;
	}
	
	public void method6() {
		String d=method5();
		System.out.println(d);
	}
	
	public int method7(int a, int b) {
		int y=a;
		int z=b;
		return y+z;
	}
	
	public void method8() {
		int p=10 + method7(15, 5);
		System.out.println(p); 
	} 
	
	
	public static void main(String[] args) {
		
		Methods ref=new Methods();
		ref.method1();
		
		method2();
		ref.method4();
		
		ref.method6();
		
		ref.method7(15, 5);
		
		ref.method8();
		
		String q=ref.method5();
		System.out.println(q);
	}

}
