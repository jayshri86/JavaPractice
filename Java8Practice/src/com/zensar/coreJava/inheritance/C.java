package com.zensar.coreJava.inheritance;

public class C extends Parent implements A,B{
	public int a = 10;

	public static void main(String[] args) {
	
		Parent obj = new C();
		System.out.println("a = " + obj.a);
		
		A obj1 = new C();		
		obj1.methodB();
		System.out.println("a = " + obj1.a);
		
	}



	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("Inside C");
		A.super.methodB();
	}

}
