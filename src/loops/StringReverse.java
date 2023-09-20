package loops;

public class StringReverse {
	public static void main(String[] args) {
		String a = "hello i love java";
		String[] array = a.split(" ");

		for (int i = 0; i < array.length; i++) {
			String reverse = array[i];
			String t = "";

			for (int j = reverse.length() - 1; j >= 0; j--) {
				t = t + reverse.charAt(j);
			}
			System.out.print(t + " ");
		}
	}

}
