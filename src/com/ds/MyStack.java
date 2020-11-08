package com.ds;

import java.util.ArrayList;
import java.util.List;

/*
 * push()	:	Pushes an item onto the top of this stack.
 * pop()	:	Removes the object at the top of this stack and returns that object as the value of this function.
 * empty()	:	Tests if this stack is empty.
 * 
 * Methods of LinkedList: removeLast(), removeFirst(), addFirst(), addLast() etc.
 * If we are using LinkedList, we could use removeLast() in our pop() 
 */
public class MyStack {

	private List<Integer> list;

	public MyStack() {
		list = new ArrayList<>();
	}

	public void push(Integer i) {
		list.add(i);
	}

	public int pop() {

		if (!list.isEmpty()) {
			int remove = list.remove(list.size() - 1);
			return remove;
		} else {
			System.out.println("Empty Stack");
			return -1;
		}
	}

	public boolean empty() {
		return list.size() == 0;
	}

}
