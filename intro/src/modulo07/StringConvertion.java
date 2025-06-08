package modulo07;

import java.util.Scanner;

public class StringConvertion {

	public static void main(String[] args) {

		System.out.println("Número: ");
		String numberStr = read();
		double number = Double.parseDouble(numberStr);
		System.out.println("Numero ao quadrado: " + (number * number));
	}

	static String read() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}
