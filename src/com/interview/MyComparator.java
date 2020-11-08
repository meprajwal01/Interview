package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {

	public static void main(String[] args) {

		Computer computer1 = new Computer(1, "A");
		Computer computer3 = new Computer(3, "C");
		Computer computer2 = new Computer(2, "B");

		List<Computer> computers = new ArrayList<Computer>();
		computers.add(computer3);
		computers.add(computer2);
		computers.add(computer1);

		Collections.sort(computers, new ShortByName());

		computers.forEach(com -> {
			System.out.println("ID : " + com.getId() + " Name : " + com.getName());
		});
	}
}

class Computer {

	private int id;
	private String name;

	public Computer(int id, String name) {
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

}

class ShortByName implements Comparator<Computer> {

	@Override
	public int compare(Computer o1, Computer o2) {
		return o1.getName().compareTo(o2.getName());
	}

}