/*
 * Project: Lab3
 * Class: 	UniqueWords.java
 * Author: 	Sarah Hu
 * Date: 	October 14, 2026
 * This program counts all the unique strings in an ArrayList.
*/

import java.util.ArrayList;

public class UniqueWords {
	// ---------------------------------------------------------------
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */
	public static int countUnique(ArrayList<String> list) {
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			boolean unique = true;

			// Compares the word at index i to the words before it
			for (int j = 0; j < i; j++) {
				if (list.get(i).equals(list.get(j))) {
					unique = false;
				}
			}

			// Counts the word if it did not appear earlier
			if (unique) {
				count++;
			}
		}
		return count;
	}

	// ---------------------------------------------------------------
	// This method makes a test list and prints its unique word count.
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
