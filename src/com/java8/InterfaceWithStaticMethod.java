package com.java8;

interface I1 {
	public static void m1() {
		System.out.println("I1.m1()");
	}

	public static void m1(int i) {
		System.out.println("I1.m1() with param");
	}
}

public class InterfaceWithStaticMethod implements I1 {

	public static void main(String[] args) {

		I1 i1 = new InterfaceWithStaticMethod();
		
		//i1.m1();		Not legal
		
		//Static methods of interface can be only called with interface name
		I1.m1();
		
	}
}
