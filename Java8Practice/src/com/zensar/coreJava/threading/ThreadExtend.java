package com.zensar.coreJava.threading;

public class ThreadExtend extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running..." + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadExtend t1 = new ThreadExtend();
		ThreadExtend t2 = new ThreadExtend();
		ThreadExtend t3 = new ThreadExtend();
		
		t1.start();	
		t1.join();  
		
		t2.start();
		
		t3.start();
		//t3.join();
		
		
		
	}

}
