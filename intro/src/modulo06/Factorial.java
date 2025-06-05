package modulo06;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fat(6));
	}

	static int fat(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fat(n - 1);
	}

}
