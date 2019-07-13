package com.zensar.coreJava.exception;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public class TestException2 {

	public static void main(String[] args) {
		try {
			foo();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) { // foo() should throw this exception
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void foo() throws IOException {

	}

}
