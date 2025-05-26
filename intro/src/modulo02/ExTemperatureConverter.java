package modulo02;

public class ExTemperatureConverter {

	public static void main(String[] args) {

		double tf = 95;

		double tc = (tf - 32) / 9 * 5;

		System.out.println("A temperatura em Celsius é: " + tc);
	}

}
