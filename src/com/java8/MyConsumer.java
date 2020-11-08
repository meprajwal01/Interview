package com.java8;

import java.util.function.Consumer;

//It has accept() , andThen() method.
public class MyConsumer {

	public static void main(String[] args) {

		Consumer<Integer> consumer = (z) -> System.out.println(z);
		consumer.accept(10);

	}

}
