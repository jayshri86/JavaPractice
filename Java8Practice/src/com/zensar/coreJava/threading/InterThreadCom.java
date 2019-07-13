package com.zensar.coreJava.threading;

public class InterThreadCom {

	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw..."  + amount);

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit..." + this.amount);
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed..." + this.amount);
		
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit..." + amount);
		this.amount += amount;
		System.out.println("deposit completed... " + this.amount);
		notifyAll();
	}	

	public static void main(String[] args) {
		final InterThreadCom c = new InterThreadCom();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.withdraw(30000);
			}
		}.start();
		
		

	}
}
