package com.citi.InvestmentProducts.exception;

public class EmptyParameterException extends RuntimeException {
	private static final long serialVersionUID = 741763036886027350L;

	private String parameterName;
	
	public EmptyParameterException(String parameterName) {
		super();
		this.parameterName = parameterName;
	}

	public String getParameterName() {
		return parameterName;
	}
	
	public String getTitle() {
		return "Can't be empty";
	}

	@Override
	public String getMessage() {
		return "Parameter " + parameterName + " cannot be empty";
	}
}
