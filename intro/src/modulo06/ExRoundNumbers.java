package modulo06;

import java.util.Arrays;

public class ExRoundNumbers {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(round(new double[] { 3.45, 6.7, 8.0, 12 })));
	}

	static int[] round(double[] numbers) {
		int[] roundedNumbers = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			roundedNumbers[i] = (int) numbers[i];
		}

		return roundedNumbers;
	}

}
