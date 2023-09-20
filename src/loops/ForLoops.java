package loops;

public class ForLoops {

	public static void main(String[] args) {

		// to print "hello" 10 times

		for (int i = 0; i < 10; i++) {

			System.out.println("hello");

		}

		System.out.println('\n' + "=================================================================" + '\n');

		// to print even numbers till 15

		for (int i = 0; i <= 15; i = i + 2) {

			System.out.print(i + " ");
		}

		System.out.println('\n' + "=================================================================" + '\n');

		// to print odd numbers till 15

		for (int i = 1; i <= 15; i = i + 2) {

			System.out.print(i + " ");
		}

		System.out.println('\n' + "=================================================================" + '\n');

		// to print table of 3

		for (int i = 3; i <= 30; i = i + 3) {

			System.out.print(i + " ");
		}

		System.out.println('\n' + "=================================================================" + '\n');

		// to print even & odd numbers both

		for (int i = 0; i <= 15; i++) {

			if (i % 2 == 0) {

				System.out.print("even number:" + i);
			} else {

				System.out.println(" odd number:" + i);
			}

		}
	}

}
