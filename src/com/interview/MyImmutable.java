package com.interview;

import java.util.Date;

/*

Definition: Immutable objects are instances whose state doesn’t change after it has been initialized. 

For example, String and all wrapper classes(Integer, Float, Boolean…) are immutable class and once instantiated 
its value never changes.

Benefits:

1. An immutable class is good for caching purposes because you don’t have to worry about the value changes.
2. Immutable classes are inherently thread-safe, so you don’t have to worry about thread safety in case of 
multi-threaded environment.

Creation process:
    
1. Declare the class as final so it can’t be extended.
2. Make all fields private so that direct access is not allowed.
3. Don’t provide setter methods for variables.
4. Make all mutable fields final so that its value can be assigned only once.
5. Initialize all the fields via a constructor performing deep copy.
6. Perform cloning of objects in the getter methods to return a copy rather than returning the actual object 
reference.

*/

public final class MyImmutable {

	private final String name;
	private final Date dob;
	private final Address address;

	public MyImmutable(String name, Date dob, Address address) {
		this.name = name;
		this.dob = new Date(dob.getTime());

		Address address2 = new Address();
		address2.setCity(address.getCity());
		this.address = address2;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return new Date(dob.getTime());
	}

	public Address getAddress() {
		Address localAddress = new Address();
		localAddress.setCity(this.address.getCity());
		return localAddress;
	}

}

class Address {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
