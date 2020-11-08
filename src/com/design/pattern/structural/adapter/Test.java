package com.design.pattern.structural.adapter;

/*
 * Adapter design pattern allows two unrelated/uncommon interfaces to work together.
 * It is useful when you have to write an interface which have to work with legacy code. 
 */
public class Test {

	public static void main(String[] args) {

		Assignment assignment = new Assignment();
		assignment.setPen(new PenAdapter());

		assignment.writeAssignment("Writing Assignment");

	}
}
