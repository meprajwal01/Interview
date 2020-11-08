package com.interview;

/*
 	The ClassNotFoundException is thrown to indicate that the specified class can'nt be found in the 
	classpath.
*/

public class MyClassNotFoundEx {

	public static void main(String[] args) {

		try {

			// Provide full qualified name of class
			Class class1 = Class.forName("com.interview.Abc");
			Abc a = (Abc) class1.newInstance();

			/*
			 * The java.lang.Class.forName(String name, boolean initialize,
			 * ClassLoader loader) method returns the Class object associated
			 * with the class or interface with the given string name, using the
			 * given class loader.
			 * 
			 * The specified class loader is used to load the class or
			 * interface. If the parameter loader is null, the class is loaded
			 * through the bootstrap class loader. The class is initialized only
			 * if the initialize parameter is true and if it has not been
			 * initialized earlier.
			 */

			Class class2 = Class.forName("com.interview.Abc", true, null);
			class2.newInstance();

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

// If we comment this class then will get "java.lang.ClassNotFoundException:
// com.interview.Abc"
class Abc {

	public void abc() {
		System.out.println("Abc.abc()");
	}

}
