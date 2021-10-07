package com.vti.exception;

public class CustomerException extends Exception{

	private static final long serialVersionUID = 1L;

	public CustomerException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
