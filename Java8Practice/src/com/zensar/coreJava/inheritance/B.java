package com.zensar.coreJava.inheritance;

public interface B {
	void methodA();
	
	default void methodB() {
		System.out.println("Inside Interface B() ");
	}

}
