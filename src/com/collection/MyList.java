package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Array list:
 * 
 * 1. ArrayList internally uses Array. i.e. Object[] elementData.
 * 2. Insertion order maintained based on index and 'null' insertion is possible
 * 3. ArrayList a = new ArrayList(); creates an empty ArrayList with default initial capacity 10.
 * 4. When ArrayList reaches its max capacity, a bigger ArrayList is created and copies the elements from 
 * previous list and previous list become eligible for garbage collection. Capacity of newly created 
 * arrayList is : (current capacity * 3/2)+1;
 * 5. There are 3 constructors in ArrayList	
 * 		a) ArrayList a = new ArrayList();
 * 		b) ArrayList a = new ArrayList(int initialCapacity);
 * 		c) ArrayList a = new ArrayList(Collection c);  
 * 6. It implements RamdomAccess interface, so any number of element can be searched in same amount of time,
 * hence it is best for Retrieval operation.
 * 7. Worst if frequent operation is deletion/insertion because it shift every object in this case. 
 * 8. remove() method is overloaded, 1st takes index as argument and 2nd take object as argument, 
 * 1st is simple that it remove object at a particular index whereas 2nd removes the first matching record. 
 * 
 * LinkedList
 * 1. Uses Doubly linked list
 * 2. Best if frequent operation is deletion/insertion.
 * 3. Worse is frequent operation is retrieval. 
 * 4. Contains addFirst(), addLast() for Stack implementation
 */
public class MyList {

	static List<Integer> getIntList() {
		List<Integer> iList = new ArrayList<>();
		iList.add(2);
		iList.add(1);
		iList.add(3);
		return iList;
	}

	static List<String> getStringList() {
		List<String> sList = new ArrayList<>();
		sList.add("a");
		sList.add("b");
		sList.add("c");
		sList.add("a");
		return sList;
	}

	static List<A> getAList() {
		List<A> aList = new ArrayList<>();
		aList.add(new A(1, "one"));
		aList.add(new A(2, "two"));
		aList.add(new A(3, "three"));
		aList.add(new A(1, "one"));
		return aList;
	}

	public static void main(String[] args) {

		List<Integer> iList = getIntList();
		iList.remove(new Integer(2));
		iList.forEach(x -> {
			System.out.println("MyList.main()" + iList);
		});

		List<String> sList = getStringList();
		sList.stream().forEach(System.out::println);
		sList.remove("a");
		sList.stream().forEach(System.out::print);

		List<A> aList = getAList();

		// Iterating using Iterator
		Iterator<A> aIterator = aList.iterator();
		while (aIterator.hasNext()) {
			System.out.println(aIterator.next().getName());
		}

		// Iterating using forEach
		aList.forEach(a -> {
			System.out.println(a.getId());
		});

		// if we don't override hashCode and equals the 'new A(1)' will not be
		// removed
		System.out.println(aList.remove(new A(1, "one")));

		aList.forEach(a -> {
			System.out.println(a.getId());
		});
	}
}

class A {

	private int id;
	private String name;

	A(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
