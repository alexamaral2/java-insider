package modulo04;

public class EvenNumbers2 {

	public static void main(String[] args) {

		int min = 1;
		int max = 20;
		int i = min;

		while (i <= max) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
			i++;
		}
	}

}
