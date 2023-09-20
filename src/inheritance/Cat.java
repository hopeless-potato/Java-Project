package inheritance;

public class Cat extends PetAnimals {
	
	public void method3() {
		System.out.println("i am child");
	}
	
	public static void main(String[] args) {
		
		Cat obj=new Cat();
		obj.method3();
		
		method2();
		
		obj.method1();
	}

}
