package com.sunnysuperman.validation.api.exception;

@SuppressWarnings("serial")
public class ValidationsException extends RuntimeException {

	private final String invalidFieldName;
	private final String invalidMessage;

	public ValidationsException(String msg) {
		super(msg);
		this.invalidFieldName = null;
		this.invalidMessage = null;
	}

	public ValidationsException(String msg, Throwable t) {
		super(msg, t);
		this.invalidFieldName = null;
		this.invalidMessage = null;
	}

	public ValidationsException(String invalidFieldName, String invalidMessage) {
		super(invalidFieldName + ": " + invalidMessage);
		this.invalidFieldName = invalidFieldName;
		this.invalidMessage = invalidMessage;
	}

	public String getInvalidFieldName() {
		return invalidFieldName;
	}

	public String getInvalidMessage() {
		return invalidMessage;
	}

}
