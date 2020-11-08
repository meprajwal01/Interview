package com.java8;

@FunctionalInterface
interface I3 {

	// Functional interface can have only 1 single abstract method
	public abstract void xyz();

	default void d1() {
		System.out.println("I3.d1()");
	}

	default void d2() {
		System.out.println("I3.d2()");
	}

	public static void s1() {
		System.out.println("I3.s1()");
	}

	public static void s12() {
		System.out.println("I3.s12()");
	}

}

public class FunctionalInterfaceTest {

}
