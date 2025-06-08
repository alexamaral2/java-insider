package modulo07;

import java.util.Scanner;

public class ExOperations {

	public static void main(String[] args) {
		System.out.println("Numero 1: ");
		double n1 = Double.parseDouble(read());

		System.out.println("Numero 2: ");
		double n2 = Double.parseDouble(read());

		System.out.println("Operacão: ");
		String op = read();

		double result;
		if (op.equals("+")) {
			result = n1 + n2;
		} else if (op.equals("-")) {
			result = n1 - n2;
		} else if (op.equals("*")) {
			result = n1 * n2;
		} else if (op.equals("/")) {
			result = n1 / n2;
		} else {
			System.out.println("Operador Inválido");
			result = 0;
		}

		System.out.println("O resultado é:  " + result);
	}

	static String read() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}
