package com.java8.myStream;

import java.util.function.Function;
import java.util.function.Predicate;

public class ReferenceTest2 {

	public static void localCheck() {
		System.out.println("ReferenceTest2.localCheck()");
	}

	public static void main(String[] args) {

		// Arbitrary Method Reference
		Predicate<Animal> p = Animal::myTest;
		boolean result = p.test(new Animal());
		System.out.println("Predicate : " + result);

		Function<Animal, Animal> f = Animal::myApply;
		Animal animal = f.apply(new Animal());
		System.out.println("Animal : " + animal);

	}

	public void myMethod() {
		T2 t2 = ReferenceTest2::localCheck;
	}
}

class Animal {

	public static boolean myTest(Animal animal) {
		System.out.println("Animal.myTest()");
		if (animal instanceof Animal) {
			return true;
		}
		return false;
	}

	public static Animal myApply(Animal animal) {
		System.out.println("Animal.printAnimals()");
		return new Animal();
	}

}

@FunctionalInterface
interface T2 {

	public abstract void check();
}
