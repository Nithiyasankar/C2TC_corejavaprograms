package com.tnsif.daysix.staticblockmethod;

public class MyClassDemo {

	public static void main(String[] args) {

		MyClass obj1 = new MyClass();
		System.out.println(obj1);

		// static method with class name
		MyClass.display();

		MyClass obj2 = new MyClass();
		System.out.println(obj2);
		MyClass.display();
		MyClass obj3 = new MyClass();
		System.out.println(obj3);
		MyClass.display();

	}

}