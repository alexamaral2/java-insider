package modulo03;

public class ExFinePaymentCalculation {

	public static void main(String[] args) {

		int speed = 101;
		double amount;

		if (speed <= 80) {
			amount = 0;
		} else if (speed > 80 && speed <= 100) {
			amount = 67;
		} else {
			amount = 70 + (speed - 100) * 10;
		}

		System.out.println("O valor da multa = R$ " + amount);

	}

}
