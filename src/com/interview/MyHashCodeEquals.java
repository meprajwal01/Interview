package com.interview;

import java.util.HashMap;
import java.util.Map;

/*
 * 	1. HashMap initially check the hashCode method, if hash code is same then it checks for equals method.
	2. If two objects are equal according to the equals(Object)method, then calling the hashcode() must be same.
	3. Rehashing is the process of re-calculating the hashcode of already stored entries (Key-Value pairs), 
		to move them to another bigger size hashmap when the threshold is reached/crossed.
*/

public class MyHashCodeEquals {

	public static void main(String[] args) {

		Student student1 = new Student(1, "A");
		Student student2 = new Student(2, "B");

		Map<Student, Integer> hashMap = new HashMap<>();
		hashMap.put(student1, 100);
		hashMap.put(student2, 200);

		System.out.println(hashMap.size());

		System.out.println(hashMap.get(student1)); // This will produce 100

		// If we make any changes in Key's (Student) property, hashcode will be
		// calculated again
		student1.setId(4);
		System.out.println(hashMap.get(student1)); // This will produce null

	}
}

class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
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
	public int hashCode() {
		// System.out.println("Student.hashCode()");
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// System.out.println("Student.equals()");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
