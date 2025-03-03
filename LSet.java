package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LSet {

	public static void main(String[] args) {

		String[] mentors = { "Vinoth", "Vineeth", "Bhuvanesh", "Vineeth", "Sakthi", "Bhuvanesh" };

		Set<String> unq = new TreeSet<String>();

		for (String s : mentors) {
			unq.add(s);
		}

		System.out.println(unq);

//set - we not have sort method , instead use TreeSet
//set - we do not have get method , instead convert list to set .

//convert set into list
		List<String> val = new ArrayList<String>(unq);
		String string = val.get(2);

		System.out.println(string);

// remove duplicate char from the string

		String name = "testleaf";

//convert into toCharArray
		char[] ch = name.toCharArray();

//empty set
		Set<Character> unq1 = new LinkedHashSet<Character>();

		for (Character c : ch) {
			unq1.add(c);
		}

		System.out.println(unq1);
//tesleaf

//set value and iteration into character

		for (Character character : unq1) {
			System.out.print(character);
		}

	}

}