package com.java8;
/*
 * 
 * Use of default method
 * 1. To keep code backward compatibility
 * 2. To add the forEach and stream supports 
 * 	(i). 	List implements Collection implements Iterable --> default void forEach(Consumer<? super T> action) {
 * 	(ii).	List -> Collection -> default Stream<E> stream() {
 * 
 */

interface MyInterface1 {
	
	default void m1() {
		System.out.println("I.m1()");
	}

	default void m1(int i) {
		System.out.println("I.m1() over loaded with vaule : " + i);
	}

	default void m2() {
		System.out.println("I.m1()");
	}
}

class C1 implements MyInterface1 {

	@Override
	public void m1() {
		System.out.println("C1.m1()");
	}

}

class C2 implements MyInterface1 {

}

public class InterfaceWithDefaultMethod {

	public static void main(String[] args) {

		MyInterface1 i1 = new C1();
		i1.m1(5);

		MyInterface1 i2 = new C2();
		i2.m1();
	}
}
