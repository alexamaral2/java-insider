package modulo05;

import java.util.Arrays;

public class ExRemoveElement {

	public static void main(String[] args) {

		int[] array = { 5, 3, 1, 3, 2, 6, 0, 3 };
		System.out.println(Arrays.toString(array));

		int remove = 5;
		int length = array.length;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == remove) {
				for (int j = i + 1; j < array.length; j++) {
					array[j - 1] = array[j];
				}

				array[length - 1] = -1;
				length--;
			}
		}

		System.out.println(Arrays.toString(array));
	}

}
