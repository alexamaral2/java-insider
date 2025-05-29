package modulo04;

public class EvenNumbers {

	public static void main(String[] args) {

		int min = 1;
		int max = 10;

		for (int i = min; i <= max; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
