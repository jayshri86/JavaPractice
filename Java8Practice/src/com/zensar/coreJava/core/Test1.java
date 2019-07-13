package com.zensar.coreJava.core;

/**
 * @author dh6rabe
 *
 */
public class Test1 {
	 static int x = 10;

	public static void main(String[] args) {
		int x = 20;
		Test1 t1 = new Test1();
		System.out.println(t1.x);
		System.out.println(x + " ");
	}

	static {
		
		System.out.println(x + "== ");
	}

}
