package com.zensar.coreJava.inheritance;

public class child1 extends Parent{
	
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println( "Inside child work()  " );
	}
	
	/*@Override
	public void work1() {
		// TODO Auto-generated method stub
		super.work1();
	}
	
	@Override
	public void work2() {
		// TODO Auto-generated method stub
		super.work2();
	}*/
	
	public void work3() {
		// TODO Auto-generated method stub
		//super.work3();
	}
	
	@Override
	public void work4() {
		// TODO Auto-generated method stub
		super.work4();
	}


	
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new child1();
		child1 p3 = new child1();
	//	child1 p4 = new Parent();
		p1.work();
		p2.work();
		p3.work();

	}

}
