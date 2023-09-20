package inheritance;

public class PetAnimals extends Animals{
	
	public static void method2() {
		System.out.println("i am parent");
	}
	
	public static void main(String[] args) {
		
		PetAnimals obj=new PetAnimals();
		method2();
		obj.method1();
		
		
		
	}

}
