package com.java8.myStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicTest {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<>();
		integers.add(4);
		integers.add(5);
		integers.add(9);
		integers.add(2);

		// Print using method reference
		integers.stream().forEach(System.out::println);

		// Sorting and printing in two lines
		List<Integer> sortedList = integers.stream().sorted().collect(Collectors.toList());
		sortedList.stream().forEach(System.out::println);

		// Sorting and printing in single line
		integers.stream().sorted().forEach(System.out::println);

		// Filtering even value. Filter method takes Predicate as arguments
		integers.stream().filter((s) -> (s % 2 == 0)).forEach(System.out::println);

		// Printing value*2 for each element
		List<Integer> integers2 = integers.stream().map(x -> x * 2).collect(Collectors.toList());
		
		
	}
}
