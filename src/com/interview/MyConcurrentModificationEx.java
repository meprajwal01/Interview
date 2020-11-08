package com.interview;

import java.util.ArrayList;
import java.util.List;

public class MyConcurrentModificationEx {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();
		nameList.add("A");
		nameList.add("B");
		nameList.add("C");

		for (int i = 0; i < 4; i++) {
			nameList.remove("A");
			//nameList.add("D");
			System.out.println(nameList.get(i));
		}
	}
}
