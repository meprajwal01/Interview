package com.interview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * The Java ClassLoader is a part of the Java Runtime Environment that dynamically loads Java classes into the Java Virtual Machine.
 * a. BootStrap ClassLoader: rt.jar
 * b. Extension ClassLoader:  jre/lib/ext
 * c. System ClassLoader: user defined class which are available in class path
 * 
 * OOPs concept:
 * 
 * 1. Abstraction: Showing essential data and hiding background details. In java, abstraction is achieved by interfaces and abstract classes. 
 * We can achieve 100% abstraction using interfaces.
 * 
 * 2. Encapsulation : Wrapping up of data and its associated functions into a single unit. 
 * It can be achieved by declaring all the variables in the class as private and writing public methods in the class to set and get the values 
 * of variables.
 * 
 * 3. Inheritance: is a feature by which object of one class acquire the property of another class.
 * 
 * 4. Poly-morphism: Same name with different functionality. 
 * 		a. Overloading :	We can overload static methods 
 * 		b. Overriding 	:	We can't override static methods
 */
public class CoreJava {
	public static void main(String[] args) {

		// HashSet uses HashMap
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("A");

		// LinkedHashSet extends HashSet. HashSet uses HashMap
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("B");

		// TreeSet uses NavigableMap extends SortedMap extends Map
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("C");
	}

}
