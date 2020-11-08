package com.java8;

import java.util.function.Supplier;

//It has only get() method
public class MySupplierTest {

	static String name = "Ram";

	public static void main(String[] args) {

		Supplier<String> supplier = () -> name.concat(" Singh");
		System.out.println(supplier.get());

	}

}
