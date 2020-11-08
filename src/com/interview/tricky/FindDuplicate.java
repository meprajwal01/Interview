package com.interview.tricky;
/*
 * Convert the string to an array of char, and store it in a HashSet. 
 * If then char could not add into the HashSet, means it is duplicate.
 * 
 */

import java.util.LinkedHashSet;

public class FindDuplicate {

	public static void main(String[] args) {

		String inputStr = "abc cddefggh";
		String outputStr = "";

		// Removing space from inputStr
		inputStr = inputStr.replaceAll("\\s", "");
		System.out.println(inputStr);

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (char c : inputStr.toCharArray()) {
			if (!set.add(c))
				outputStr = outputStr.concat(String.valueOf(c));
		}

		System.out.println(outputStr);
	}

}
