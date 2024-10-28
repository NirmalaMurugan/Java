package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortingCollection {

	public static void main(String[] args) {
		String[] array = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		int num = array.length;
		List<String> stringarray = new ArrayList<String>();
		for (String i : array) {
			stringarray.add(i);

		}
		Collections.sort(stringarray);

		System.out.println(stringarray);
		List<String> stringarrayreverse = new ArrayList<String>();
		for (int i = stringarray.size() - 1; i >= 0; i--) {
			System.out.print(stringarray.get(i) + ", ");
		}

	}

}
