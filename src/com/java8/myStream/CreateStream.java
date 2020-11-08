package com.java8.myStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* ------------------------
 * Type of stream operation
 * ------------------------
 *  1. Intermediate operation
 * 		Operate on stream and return stream	
 * 		Can be chained
 * 		Accept lambda expression that is applied to all elements
 * 		Example filter, map, sorted
 * 
 * 2. Terminal operation
 * 		Operate on stream and return non-stream	
 * 		Example: forEach, count , anyMatch
 
 *	Important method of Stream: 
 *	
 * 	distinct() : returns a stream consisting of distinct elements in a stream. distinct() is the method of Stream 
 * 	interface. This method uses hashCode() and equals() methods to get distinct elements. 
 */

public class CreateStream {

	public static void main(String[] args) {

		// List to stream
		List<Integer> integers = Arrays.asList(5, 3, 10, 8, 9);
		Stream<Integer> streams = integers.stream();

		int[] intArray = new int[] { 10, 8, 9, 11, 3 };
		IntStream intstream = Arrays.stream(intArray);

		// Terminal operation forEach
		Stream<String> stringStream = Stream.of("Apple", "Banana", "Carrot");
		stringStream.forEach((str) -> {
			System.out.println("Hello " + str);
		});

		// Intermediate operation anyMatch
		Stream<String> stringStream2 = Stream.of("Apple", "Banana", "Carrot");
		boolean flag = stringStream2.anyMatch((str) -> str.endsWith("t"));
		System.out.println("Flag : " + flag);
	}

}
