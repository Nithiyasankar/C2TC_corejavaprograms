package com.tnsif.dayfive.association.pack1;

public class Executor {
	public static void main(String[] args) {
		Address address = new Address("405,VOC street, Anna Nagar", "Thavalakuppam", "Puducherry", "605007");
		Person person = new Person("Nithiya", address);
		person.displayInfo();
	}

}
