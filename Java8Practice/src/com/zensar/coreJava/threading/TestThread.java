package com.zensar.coreJava.threading;

public class TestThread {

	public static void main(String[] args) {
		/* ThreadDemo T1 = new ThreadDemo( "Thread-1");
	      T1.start();
	      
	      ThreadDemo T2 = new ThreadDemo( "Thread-2");
	      T2.start();*/

		Runnable r1 = () -> {
			for(int i=0;i<3;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println(" Run...");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
