package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class ComparatorWith8 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("D"));
		students.add(new Student("A"));
		students.add(new Student("G"));

		Comparator<Student> comparator = (s1, s2) -> s1.getName().compareTo(s2.getName());

		Collections.sort(students, comparator);

		for (Student student : students) {
			System.out.println(student.getName());
		}

		students.forEach(s -> {
			System.out.println(s.getName());
		});
	}
}
