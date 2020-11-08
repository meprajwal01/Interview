package com.java8.myStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyFilterExample {

	public static void main(String[] args) {

		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit(5, "Apple"));
		fruits.add(new Fruit(4, "Banana"));
		fruits.add(new Fruit(2, "Guava"));
		fruits.add(new Fruit(5, "Mango"));

		// Filtering those fruits , who's price is less then the 5
		List<Fruit> newFruits = fruits.stream().filter((f) -> f.price < 5).collect(Collectors.toList());
		newFruits.forEach(s -> {
			System.out.println(s.getName());
		});

		// To get all fruit name
		List<String> fruitsName = fruits.stream().map(x -> x.getName()).collect(Collectors.toList());
		fruitsName.forEach(System.out::println);

		List<Fruit> result = fruits.stream().map(temp -> {
			return new Fruit(temp.getPrice() + 1, temp.getName());
		}).collect(Collectors.toList());

		result.forEach(s -> {
			System.out.println(s.getPrice());
		});

		// Get the first element from list
		Fruit f = fruits.stream().findFirst().get();
		System.out.println(f.getName());
	}

}

class Fruit {

	int price;
	String name;

	public Fruit(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
