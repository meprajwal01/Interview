package com.design.pattern.creational;

/*
 * Factory design pattern provides approach to code for interface rather than implementation.
 * 
 */
public class MyFactory {

	public static void main(String[] args) {

		Shape shape = ShapeFactory.getInstance("TRIANGLE");
		shape.draw();
	}
}

class ShapeFactory {

	public static Shape getInstance(String type) {
		if ("CIRCLE".equals(type))
			return new Circle();
		if ("TRIANGLE".equals(type))
			return new Triangle();
		else
			return null;
	}

}

interface Shape {
	void draw();
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}
}

class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}
}