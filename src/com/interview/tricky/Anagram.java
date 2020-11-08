package com.interview.tricky;

/*
 * An anagram of a string is another string that contains the same characters, 
 * only the order of characters can be different. 
 * For example, “silent” and “listen” are an anagram of each other.
 */
public class Anagram {
	public static void main(String[] args) {

		if (isAnagram("silent", "listen"))
			System.out.println("Anagram");
		else
			System.out.println("Non Anagram");

	}

	public static boolean isAnagram(String str1, String str2) {

		boolean output = false;
		if (!(str1.length() == str2.length()))
			return output;

		String concanated = str1.concat(str2);

		if (concanated.indexOf(str1) != -1 && concanated.indexOf(str2) != -1)
			output = true;

		return output;
	}
}
