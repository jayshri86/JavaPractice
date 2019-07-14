package com.zensar.coreJava.inheritance;

public interface A {
	public int a = 5;
	void methodA();
	
	default void methodB() {
		System.out.println("Inside Interface A ");
	}
	
	

}
