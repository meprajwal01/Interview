package com.java8;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

// It has and(), negate(), or(), test() methods
public class MyPredicateTest {

	public static void main(String[] args) {

		// Predicate with single argument 1
		Predicate<Integer> predicate = (x) -> x % 2 == 0;
		System.out.println("Predicate " + predicate.test(10));
		System.out.println("Predicate Negate : " + predicate.negate().test(2));

		// Predicate with single argument 2
		Predicate<Integer> greaterThen = (x) -> x > 12;
		System.out.println("Predicate " + greaterThen.test(5));

		System.out.println("Two predicate : " + predicate.and(greaterThen).test(10));

		// Predicate with double argument
		BiPredicate<String, String> biPredicate = (x, y) -> x.equals(y);
		System.out.println("BiPredicate " + biPredicate.test("A", "A"));

		// Predicate with primitive argument
		IntPredicate intPredicate = (v) -> v == 2;
		System.out.println("IntPredicate " + intPredicate.test(2));

		// Predicate with User Defined argument
		Predicate<Employee> predicate3 = (e) -> e.getName().equals("Ram");
		System.out.println("Predicate Emp " + predicate3.test(new Employee("Shyam")));

	}

}

class Employee {

	String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
