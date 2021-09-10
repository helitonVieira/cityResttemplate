package com.citi.InvestmentProducts.exception;

public class RecordNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -8943500575976972519L;

	public RecordNotFoundException(String exception) {
        super(exception);
    }
	
}
