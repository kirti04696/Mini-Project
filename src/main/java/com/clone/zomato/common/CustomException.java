package com.clone.zomato.common;

public class CustomException {
	
	private String message;

	public CustomException(String message) {
		super();
		this.message = message;
	}

	public CustomException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
