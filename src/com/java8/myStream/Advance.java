package com.java8.myStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.entity.Employee;

public class Advance {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(4, "E", "India"));
		employees.add(new Employee(1, "D", "US"));
		employees.add(new Employee(1, "A", "UK"));
		employees.add(new Employee(3, "C", "US"));
		employees.add(new Employee(1, "D", "Pak"));

		/*
		 * forEach() take Consumer as argument. It is used to do some operation
		 * on each element of list
		 */
		employees.forEach(x -> {
			System.out.println("Advance.main() " + x);
		});

		// map() takes Function as argument, here we are incrementing ID by 1
		List<Employee> incrementedList = employees.stream().map(x -> {
			x.setId(x.getId() + 1);
			return x;
		}).collect(Collectors.toList());

		/*
		 * We are sorting based on ID and if ID is same then sorting based on
		 * Name, if Name is also same then based on County. If we don't use
		 * 'thenComparing', and ID is same then name will be sort based on index
		 */
		incrementedList.sort(Comparator.comparing(Employee::getId).thenComparing(Employee::getName)
				.thenComparing(Employee::getCountry));

		incrementedList.forEach(x -> {
			System.out.println(x);
		});

		/*
		 * filter() method takes Predicate as argument.
		 * Here we are filtering those employees whose name starts with D
		 */
		List<Employee> dNames = employees.stream().filter(x -> x.getName().startsWith("D"))
				.collect(Collectors.toList());
		dNames.forEach(x -> {
			System.out.println(x);
		});
	}
}
