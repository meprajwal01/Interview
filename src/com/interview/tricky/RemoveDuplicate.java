package com.interview.tricky;

/*
 * Convert the string to an array of char, and store it in a LinkedHashSet. 
 * That will preserve your ordering, and remove duplicates
 * 
 */
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String inputStr = "abc cddefggh";
		String outputStr = "";

		// Removing space from inputStr
		inputStr = inputStr.replaceAll("\\s", "");
		System.out.println(inputStr);

		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (char c : inputStr.toCharArray()) {
			set.add(c);
		}

		for (char c : set) {
			outputStr = outputStr.concat(String.valueOf(c));
		}

		System.out.println(outputStr);
	}
}
