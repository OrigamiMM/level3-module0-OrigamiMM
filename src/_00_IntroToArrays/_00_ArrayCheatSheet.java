package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		int current;
		int smallest = 51;
		int biggest = 0;
		// 1. make an array of 5 Strings
		String[] coll = { "one", "two", "three", "four", "five" };
		// 2. print the third element in the array
		System.out.println(coll[2]);
		// 3. set the third element to a different value
		coll[2] = "third";
		// 4. print the third element again
		System.out.println(coll[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice

		for (int i = 0; i < coll.length; i++) {
			coll[i] = "string";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < coll.length; i++) {
			System.out.println(coll[i]);
		}
		// 7. make an array of 50 integers
		int[] arrInt = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = new Random().nextInt(50);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		for (int i = 0; i < arrInt.length; i++) {
			current = arrInt[i];
			if (current < smallest) {
				smallest = current;
			}
		}
		System.out.println("smallest: " + smallest);
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		// 11. print the largest number in the array.
		for (int i = 0; i < arrInt.length; i++) {
			current = arrInt[i];
			if (current > biggest) {
				biggest = current;
			}
		}
		System.out.println("Biggest: " + biggest);
		// 12. print only the last element in the array
		System.out.println(arrInt[arrInt.length-1]);
	}
}
