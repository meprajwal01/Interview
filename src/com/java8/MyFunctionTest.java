package com.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

//It has apply(), andThen() compose(), 
public class MyFunctionTest {

	public static void main(String[] args) {

		Function<Integer, Integer> function = (x) -> x * x;
		System.out.println("Function : " + function.apply(5));

		Function<Integer, Integer> function2 = (x) -> x + x;
		System.out.println("Function2 : " + function2.apply(2));

		System.out.println("andThen check : " + function.andThen(function2).apply(5));
		System.out.println("Compose check : " + function.compose(function2).apply(5));

		BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;
		System.out.println("BiFunction " + biFunction.apply(10, 15));

	}

}
