package com.interview.tricky;

/*
 * In Fibonacci series each number is the sum of the two preceding ones
 * Example: 0 1 1 2 3 5 8 13 21 34 55 89 144
 */
public class Fibonacci {

	public static void main(String[] args) {

		int first = 0, second = 1, term = 10, addition = 0;

		System.out.print(first);
		System.out.print(" " + second);

		for (int i = 0; i <= term; i++) {

			addition = first + second;
			System.out.print(" " + addition);

			first = second;
			second = addition;

		}

	}

}
