package com.collection;

import java.util.HashSet;
import java.util.Set;

/*
 * HashSet internally uses HashMap
 */
public class MySet {

	public static void main(String[] args) {

		Set<String> s = new HashSet<>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("a");

		// s.forEach(System.out::print);

		Set<B> bSet = new HashSet<>();
		bSet.add(new B(1));
		bSet.add(new B(2));
		bSet.add(new B(3));
		bSet.add(new B(3));

		bSet.forEach(b -> {
			System.out.println(b.getId());
		});

		bSet.remove(new B(3));

		bSet.forEach(b -> {
			System.out.println(b.getId());
		});
	}

}

class B {

	private int id;

	B(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		B other = (B) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
