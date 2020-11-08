package com.interview.tricky;

public class Palindrom {
	public static void main(String[] args) {

		ispalindrom(121);
		ispalindrom("naman");
	}

	private static void ispalindrom(int input) {

		int output = 0, remainder = 0, temp = input;

		while (temp != 0) {
			remainder = temp % 10;
			output = output * 10 + remainder;
			temp /= 10;
		}
		if (input == output)
			System.out.println(input + " is palindrom");
		else
			System.out.println(input + " is not palindrom");

	}

	private static void ispalindrom(String input) {

		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}

		if (input.equals(output))
			System.out.println(input + " is palindrom");
		else
			System.out.println(input + " is not palindrom");
	}
}
