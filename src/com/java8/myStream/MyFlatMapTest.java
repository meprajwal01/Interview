package com.java8.myStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyFlatMapTest {

	public static void main(String[] args) {

		String[][] myArray = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		Stream<String[]> myStream = Arrays.stream(myArray);

		Stream<String> streamString = myStream.flatMap(x -> Arrays.stream(x));
		List<String> result = streamString.filter(x -> x.equals("a")).collect(Collectors.toList());
		result.forEach(s -> {
			System.out.println(s);
		});
	}

}
