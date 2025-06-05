package modulo06;

public class Growth {

	public static void main(String[] args) {

		System.out.println(calculateGrowth(5, 10));
	}

	static double calculateGrowth(double valueStart, double valueEnd) {
		return ((valueEnd - valueStart) / valueStart) * 100;
	}

}
