package com.java8.myStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyFlatMapTest2 {

	public static void main(String[] args) {

		List<String> book1 = new ArrayList<>();
		book1.add("Hindi");
		book1.add("English");

		List<String> book2 = new ArrayList<>();
		book1.add("Math");
		book1.add("Science");

		Student student1 = new Student("Ram", book1);
		Student student2 = new Student("Shyam", book2);

		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);

		Stream<List<String>> allBooks = students.stream().map(x -> x.getBooks());
		List<String> b = allBooks.flatMap(x -> x.stream()).collect(Collectors.toList());
		b.forEach(s -> {
			System.out.println(s);
		});

	}

}

class Student {

	String name;
	List<String> books;

	public Student(String name, List<String> books) {
		this.name = name;
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

}
