package com.zensar.coreJava.exception;

import java.io.IOException;

public class customException extends Exception {

	private static final long serialVersionUID = 4664456874499611218L;

	private String errorCode = "Unknown_Exception";

	public customException(String message, String errorCode){
		super(message);
		this.errorCode=errorCode;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

}
