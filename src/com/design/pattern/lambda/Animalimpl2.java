package com.design.pattern.lambda;

public class Animalimpl2 {

	private static void printMyName(Animal animal) {
		animal.printName();
	}

	public static void main(String[] args) {
		printMyName(() -> System.out.println("Cat"));
		printMyName(() -> System.out.println("Horse"));
	}
}
