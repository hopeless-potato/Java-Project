package polymorphism;

public class AxisBank extends Bank {
	
	public void transactions() {
		System.out.println("account credited");
	}
	
	public void method2() {
		System.out.println("i am from AxisBank");
	}
	
	public static void main(String[] args) {
		
		
		AxisBank ref=new AxisBank();
		ref.transactions();
		ref.method2();
		ref.method1();
		
		System.out.println();
		
		Bank ref1=new Bank();
		ref1.transactions();
		ref1.method1();
		
		System.out.println();
		
		Bank ref2=new AxisBank();
		ref2.method1();
		ref2.transactions();
			
		
	}
	

}
