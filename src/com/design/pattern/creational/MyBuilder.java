package com.design.pattern.creational;

//It is used to construct a complex object step by step and the final step will return the object.
public class MyBuilder {

	public static void main(String[] args) {

		Mobile mobile = new MobileBuilder().setBrand("Samsung").getMobile();
		System.out.println(mobile);
	}
}

class Mobile {

	private String processor;
	private int battery;
	private String brand;

	public Mobile(String processor, int battery, String brand) {
		super();
		this.processor = processor;
		this.battery = battery;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Mobile [processor=" + processor + ", battery=" + battery + ", brand=" + brand + "]";
	}

}

class MobileBuilder {

	private String processor;
	private int battery;
	private String brand;

	public MobileBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public MobileBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public MobileBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public Mobile getMobile() {
		return new Mobile(processor, battery, brand);
	}

}
