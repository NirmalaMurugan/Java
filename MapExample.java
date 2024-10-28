package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> quantity = new HashMap<>();

		// add values into map
		quantity.put("Papaya", 10);
		quantity.put("Orange", 30);
		quantity.put("Apple", 80);

		// change value of any key
		quantity.put("Apple", quantity.get("Apple") + 40);

		// print values.
		for (String key : quantity.keySet()) {
			// System.out.println(key);
			System.out.println(key + " : " + quantity.get(key));
		}

		quantity.put("Apple", quantity.get("Apple") + 40);

		// to check if key present

		System.out.println(quantity.containsKey("Apple"));
		System.out.println(quantity.containsKey("DragonFriut"));

	}
}