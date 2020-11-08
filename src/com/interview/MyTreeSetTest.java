package com.interview;

import java.util.Set;
import java.util.TreeSet;

public class MyTreeSetTest {

	public static void main(String[] args) {

		Fruit fruit1 = new Fruit(1, "Banana");
		Fruit fruit2 = new Fruit(2, "Apple");
		Fruit fruit3 = new Fruit(3, "Grapes");

		Set<Fruit> fruits = new TreeSet<>();
		fruits.add(fruit1);
		fruits.add(fruit3);
		fruits.add(fruit2);

		fruits.forEach(fru -> {
			System.out.println("ID : " + fru.getId() + " Name : " + fru.getName());
		});

	}

}

class Fruit implements Comparable<Fruit> {

	private int id;
	private String name;

	public Fruit(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Fruit o) {
		return this.getName().compareTo(o.getName());
	}

}