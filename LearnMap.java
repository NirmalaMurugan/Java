package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		String input = "amazon";
		// key - character
		// value - integer
		// o/p: a=2,m=1,z=1,o=1,n=1

		char[] ch = input.toCharArray();
		Map<Character, Integer> mapp = new LinkedHashMap<>();
		// method 1
//		for(int i=0; i<ch.length; i++) {
//			if(mapp.containsKey(ch[i])) {
//				int value = mapp.get(ch[i]);
//				value = mapp.put(ch[i], value+1);
//				
//			}
//			else {
//				mapp.put(ch[i], 1);
//			}
		// }

		// method2:

		for (int i = 0; i < ch.length; i++) {
			mapp.put(ch[i], mapp.getOrDefault(ch[i], 0) + 1);
		}
		System.out.println(mapp);

		// print only unique character:
		for (Entry<Character, Integer> entry : mapp.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}

		// find max
		int max = 0;
		char maxoccurence;
		for (Entry<Character, Integer> entry : mapp.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxoccurence = entry.getKey();
			}
		}
		System.out.println(max);

	}

}
