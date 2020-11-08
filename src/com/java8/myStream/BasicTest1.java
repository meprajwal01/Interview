package com.java8.myStream;

import java.util.stream.IntStream;

public class BasicTest1 {

	public static void main(String[] args) {

		int[] values = { 5, 2, 4, 9, 7, 3, 0 };

		// Printing all values
		IntStream.of(values).forEach(System.out::println);

		// Get maximum value
		int max = IntStream.of(values).max().getAsInt();
		System.out.println("Max : " + max);

	}
}
