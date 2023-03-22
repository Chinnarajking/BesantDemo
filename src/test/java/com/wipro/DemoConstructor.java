  package com.wipro;

public class DemoConstructor {
	//constructor
	public DemoConstructor() {
		this(10);
		System.out.println("Default Construtor");
	}
	public DemoConstructor(int id) {
		this("Chinna");
		System.out.println("My ID is -"+ id);
	}
	public DemoConstructor(String name) {
		System.out.println("My name is -"+ name);
	}

	public static void main(String[] args) {
		DemoConstructor d = new DemoConstructor();
	}

}
