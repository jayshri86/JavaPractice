package com.zensar.coreJava.threading;

import java.util.Arrays;

public class ThreadImplement implements Runnable{
	String s;

	public ThreadImplement(String msg) {
		this.s = msg;
	}

	public static void main(String[] args) {
		
		ThreadImplement t1 = new ThreadImplement("1- ");
		ThreadImplement t2 = new ThreadImplement("2- ");
		
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t2);
		
		t3.start();
		t4.start();
	}

	@Override
	public void run() {
		Arrays.stream(new Integer[]{1,2,3,4}).forEach(n -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running -- " + Thread.currentThread().getName() + " -- S -- " + s);
		});
		
	}

}
