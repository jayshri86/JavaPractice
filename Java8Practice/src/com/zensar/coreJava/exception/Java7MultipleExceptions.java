package com.zensar.coreJava.exception;

public class Java7MultipleExceptions {
	public static void main(String[] args)  {
		try {
			rethrow("First");
			System.out.println("After throws");
		} catch (FirstException | SecondException | ThirdException | customException e) {
			// below assignment will throw compile time exception since e is final
			// e = new Exception();
			System.out.println("Error = " + e.getMessage());
			customException c = new customException("First","123");
			System.out.println("Error = " + c.getErrorCode());
		}
		
		//rethrow("First");
	}

	static void rethrow(String s) throws FirstException, SecondException, ThirdException, customException {
	//	try {
			if (s.equals("First"))
				throw new customException("First","123");
				//System.out.println("==== First");
			else if (s.equals("Second"))
				//throw new SecondException("Second");
				System.out.println("==== Second");
			else
			//	throw new ThirdException("Third");
				System.out.println("==== Third");
		/*} catch (Exception e) {
			// below assignment disables the improved rethrow exception type checking
			// feature of Java 7
			// e=new ThirdException();
			System.out.println("====");
		//	throw e;
		}*/
	}

	static class FirstException extends Exception {

		public FirstException(String msg) {
			super(msg);
		}
	}

	static class SecondException extends Exception {

		public SecondException(String msg) {
			super(msg);
		}
	}

	static class ThirdException extends Exception {

		public ThirdException(String msg) {
			super(msg);
		}
	}

}