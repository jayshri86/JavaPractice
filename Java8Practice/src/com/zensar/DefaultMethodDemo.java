package com.zensar;

@FunctionalInterface
interface DefaultMethodDemo {

	void test();

	default void display() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isPrime(12);

	}
	
	public static boolean isPrime(int a) {
		for(int i = 1; i<a; i++) {
			if(i%2 == 0)
				return true;
		}
		return false;
		
	}
	

}

@FunctionalInterface
interface MyDefaultMethodDemo extends DefaultMethodDemo {
	void test();
	
/*	public default void toString() {
		
	}
*/
}