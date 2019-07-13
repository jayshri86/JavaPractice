package com.zensar.coreJava.inheritance;

public class Parent {
	String name;
	int age;
	public static int a = 7;
	
	protected Parent(){
		
	}
	
	public void work() {
		try {
			//System.exit(0);
			System.out.println("Inside Parent Work" );
			throw new NullPointerException();
		
		}finally {
			System.out.println(" Inside finally block ");
		}
	}
	
	public static void work1() {
		System.out.println("Inside Work1" );
	}
	
	public final void work2() {
		System.out.println("Inside Work2" );
	}
	
	private void work3() {
		System.out.println("Inside Work3" );
		
	}
	
	protected void work4() {
		System.out.println("Inside Work3" );
		
	}
	

	public static void main(String[] args) {
		Parent p = new Parent();
		p.work();

	}
	

}
