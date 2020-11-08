package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparable {

	public static void main(String[] args) {

		Laptop laptop1 = new Laptop(1, "dell");
		Laptop laptop2 = new Laptop(2, "samsung");
		Laptop laptop3 = new Laptop(3, "acer");

		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);

		Collections.sort(laptops);

		laptops.forEach(item -> {
			System.out.println("Name : " + item.getName() + " ID : " + item.getId());
		});

	}
}

class Laptop implements Comparable<Laptop> {

	private int id;
	private String name;

	public Laptop(int id, String name) {
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
	public int compareTo(Laptop o) {
		return this.getName().compareTo(o.getName());
	}
}