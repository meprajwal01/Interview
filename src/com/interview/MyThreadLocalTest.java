package com.interview;

/*
 	Each thread that access threadLocal has its own, independently initialized copy of the variable. 
 	ThreadLocal instances are typically private static fields in classes that wish to associate state with a thread 
 	(e.g., a user ID or Transaction ID). 
 */

public class MyThreadLocalTest {

	// 1st Way to create
	private static ThreadLocal<String> threadLocal1 = new ThreadLocal<String>() {

		@Override
		protected String initialValue() {
			return String.valueOf(System.currentTimeMillis());
		}
	};

	// 2nd way to create that take Supplier functional interface
	private static ThreadLocal<String> threadLocal2 = ThreadLocal.withInitial(() -> {
		return String.valueOf(System.currentTimeMillis());
	});

	public static void main(String[] args) {

		System.out.println(threadLocal1.get());
		System.out.println(threadLocal2.get());

	}
}
