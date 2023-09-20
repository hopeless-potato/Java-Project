package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		String numbers[][] = { { "one", "two", "three" }, { "four", "five", "six" } };

		System.out.println(numbers.length);
		int a = numbers[0].length;
		int b = numbers[1].length;
		System.out.println(a + b);
		
		System.out.println(Arrays.toString(numbers[0]) + Arrays.toString(numbers[1]));

////////////////////////////// using forEach method///////////////////////////////

		for (String[] idk : numbers) {

			System.out.println(Arrays.toString(idk));

		}

/////////////////////////////////////////// using forLoopmethod/////////////////////////////////////////

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

	}
}
