package com.zensar.coreJava.core;

public class Student {
	int rollno;// instance variable
	String name;
	static String college = "ITS";// static variable
	static int staticCount=0;
	int instanceCount=0;
	// constructor

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display the values
	void display() {
		staticCount++;
		instanceCount++;
		System.out.println(rollno + " " + name + " " + college + " " + instanceCount + " " + staticCount);
	}

}
