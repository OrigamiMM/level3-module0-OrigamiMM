package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	static ArrayList<String> Strings;

	public static void main(String[] args) {
		String[] coll = { "one", "two", "three", "four", "five", "six" };
		printArrayOfStrings(coll);
		System.out.println("");
		printReverseArrayOfStrings(coll);
		System.out.println("");
		printEveryOtherString(coll);
		System.out.println("");
		printRandomStrings(coll);

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static void printArrayOfStrings(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static void printReverseArrayOfStrings(String[] s) {
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.println(s[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void printEveryOtherString(String[] s) {
		for (int i = 0; i < s.length; i = i + 2) {
			System.out.println(s[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	static void printRandomStrings(String[] s) {
		// Strings = new ArrayList<String>();
		// int ran = r.nextInt(s.length);
		// Strings.add(s[ran]);
		// System.out.println(s[ran]);
		// for (int i = 0; i < s.length - 1; i++) {
		// if (!Strings.contains(s[ran])) {
		// Strings.add(s[ran]);
		// System.out.println(s[ran]);
		// } else {
		// ran = r.nextInt(s.length);
		// i--;
		// }
		if (s.length != 0) {
			boolean alreadyPrint;
			int counter=0;
			Random r = new Random();
			int[] ints = new int[s.length];
			while(counter<s.length) {
				alreadyPrint = false;
				int ranInt = r.nextInt(ints.length);
				System.out.println("ranInt is:"+ ranInt);
				for (int j = 0; j < ints.length; j++) {
					if (ints[j] == ranInt ) {
						alreadyPrint = true;
						break;
						
					}
				}
				if (!alreadyPrint) {
					ints[counter] = ranInt;
					counter++;
				}
				

			}
			for (int i : ints) {
				System.out.println(s[ints[i]]);
			}

		}
	}
}