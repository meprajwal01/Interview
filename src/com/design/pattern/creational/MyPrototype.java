package com.design.pattern.creational;

/*
 * The concept is to copy an existing object rather than creating a new instance from scratch, something that
 * may include costly operations. For example, if creation of object may include some costly DB operation, then
 * we should used this approach 
 */
public class MyPrototype {

	public static void main(String[] args) {

		try {

			Leg leg = new Leg(4);
			Dog dog1 = new Dog("Tommy", 3, leg);

			Dog dog2 = (Dog) dog1.clone();

			// In case of Shallow copy, change in original object will be
			// reflected in clone also, but not in deep copy
			dog1.getLeg().setLegCount(10);
			System.out.println(dog1);
			System.out.println(dog2);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

class Dog implements Cloneable {

	private String name;
	private int age;
	private Leg leg;

	public Dog(String name, int age, Leg leg) {
		this.name = name;
		this.age = age;
		this.leg = leg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	/*
	 * @Override 1 Shallow Copy protected Object clone() throws
	 * CloneNotSupportedException { return super.clone(); }
	 */

	@Override // Deep Copy
	protected Dog clone() throws CloneNotSupportedException {

		Leg leg = new Leg(getLeg().getLegCount());
		return new Dog(getName(), getAge(), leg);
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", leg=" + getLeg().getLegCount() + "]";
	}

}

class Leg {

	private int legCount;

	public Leg(int legCount) {
		this.legCount = legCount;
	}

	public int getLegCount() {
		return legCount;
	}

	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}

}
