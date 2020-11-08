package com.interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 
Serialization is a mechanism of converting the state of an object into a byte stream. 
De-serialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different platform.

Points to remember
	
1. If a parent class has implemented Serializable interface then child class doesn’t need to implement it but vice-versa is not true.
2. Only non-static data members are saved via Serialization process.
3. Static data members and transient data members are not saved via Serialization process.
4. Constructor of object is never called when an object is deserialized.
5. Associated objects must be implementing Serializable interface.
*/

public class MySerialization {

	public static void main(String[] args) {

		String fileName = "myFile.txt";

		serilize(fileName);
		deSerilize(fileName);
	}

	private static void serilize(String fileName) {

		Employee employee = new Employee(1, "Ram", 100, "IRIS");

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {

			objectOutputStream.writeObject(employee);
			System.out.println("Done !!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void deSerilize(String fileName) {

		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {

			Employee employee = (Employee) objectInputStream.readObject();

			System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Employee implements Serializable {

	private static final long serialVersionUID = -2694700275814160355L;
	private int id;
	private String name;
	private transient int salary;
	private static String company;

	public Employee(int id, String name, int salary, String company) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		Employee.company = company;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + " , company=" + company + "]";
	}

}