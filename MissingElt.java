package week3.day1;


import java.util.Arrays;



public class MissingElt {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 10, 6, 8 };
		Arrays.sort(array);
		int n = array.length;

		// to find max
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + ", ");
		}
		int max = array[n - 1];
		System.out.println("\nMaximum elt in the array: " + max);

		// check if element is present in the range.
		for (int i = 1; i <= max; i++) {
			boolean found = false;
			for (int j = 0; j < n; j++) {
				if (array[j] == i) {
					found = true;
					break;
				}
			}
			// to print missing values
			if (!found) {
				System.out.print(i + " ");
			}

		}
	}
}
