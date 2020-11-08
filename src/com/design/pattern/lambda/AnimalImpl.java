package com.design.pattern.lambda;

public class AnimalImpl {

	public static void main(String[] args) {

		Animal cat = () -> System.out.println("Cat");
		Animal dog = () -> System.out.println("Dog");
		
		cat.printName();
		dog.printName();
	}
}
