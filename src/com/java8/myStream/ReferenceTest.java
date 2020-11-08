package com.java8.myStream;

public class ReferenceTest {

	public static int add(int x, int y) {
		return x + y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {

		// Static Method Reference
		I1 i1 = ReferenceTest::add;
		int result = i1.myFunction(5, 10);
		System.out.println("Result : " + result);

		// Instance Method Reference
		I1 i2 = new ReferenceTest()::mul;
		result = i2.myFunction(5, 5);
		System.out.println("Result : " + result);

	}

}

interface I1 {

	public abstract int myFunction(int x, int y);
}
