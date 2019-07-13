package com.zensar.coreJava.core;

public class StaticTest {

	public static void main(String[] args) {
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");
		// we can change the college of all objects by the single line of code
		// Student.college="BBDIT";
		s1.display();
		s2.display();

	}

}
