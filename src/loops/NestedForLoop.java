package loops;

public class NestedForLoop {

	public static void main(String[] args) {
		


		int a = 1;

		for (int i = 0; i <= 4; i++) {

			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(a++ + " ");
			}

			System.out.println();

		}

		int b = 10;

		for (int i = 0; i <= 3; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
            }

			for (int j = 3; j >= i; j--) {
				System.out.print(b-- + " ");
			}

			System.out.println();
			
			

		}

	}

}
