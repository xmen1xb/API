
package com.vti.backend;

public class InvalidAgeInputingException extends Exception {
	public InvalidAgeInputingException(String message) {
		super(message);
		System.out.println("tuoi khong hop le");
	}
}
