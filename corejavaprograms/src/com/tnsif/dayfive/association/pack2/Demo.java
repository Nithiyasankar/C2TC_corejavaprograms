package com.tnsif.dayfive.association.pack2;

public class Demo {
	public static void main(String[] args) {

		Employee employee = new Employee("Sam", 101, "IT");
		Manager manager = new Manager("Nithiya", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}
}
