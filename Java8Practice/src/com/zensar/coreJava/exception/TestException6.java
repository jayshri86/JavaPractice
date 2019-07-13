package com.zensar.coreJava.exception;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public class TestException6 {

	public static void main(String[] args) {
		try {
			foo();
		} catch (IOException | JAXBException e) {
			e = new Exception("");
			e.printStackTrace();
		} catch (Exception e) {
			e = new Exception("");
			e.printStackTrace();
		}
	}

	public static void foo() throws IOException, JAXBException {

	}

}
