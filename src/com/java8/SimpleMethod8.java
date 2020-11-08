package com.java8;

@FunctionalInterface
interface MyInterface {

	public abstract int add(int x, int y);
}

public class SimpleMethod8 {

	public static void main(String[] args) {

		// return keyword is required if we use curly braces
		MyInterface myInterface = (a, b) -> { return a + b; };
		System.out.println(myInterface.add(5, 10));

		// return keyword is not required if we don't use curly braces
		MyInterface myInterface2 = (c, d) -> c + d;
		System.out.println(myInterface2.add(15, 45));
		
	}

}
