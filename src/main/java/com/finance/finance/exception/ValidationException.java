package com.finance.finance.exception;

public class ValidationException extends Exception {
	String errorm;

	public ValidationException(String error) {
		errorm=error;
		
	}

	public String getErrorm() {
		return errorm;
	}

}
