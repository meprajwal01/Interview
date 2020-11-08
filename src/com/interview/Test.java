package com.interview;

import java.util.HashSet;

public class Test {

	private void m(Long l) {
		System.out.println("Long");
	}

	private void m(Double d) {
		System.out.println("Double");
	}

	private void m(int i) {
		System.out.println("Double");
	}

	public void obj(String str) {
		System.out.println("String : " + str);
	}

	public void obj(Object obj) {
		System.out.println("Object : " + obj);
	}

	public static void main(String[] args) {

		// Compile Time exception
		// new Test().m(10);
		new Test().obj(null);

	}
}
