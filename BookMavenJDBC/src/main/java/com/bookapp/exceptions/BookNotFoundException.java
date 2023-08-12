package com.bookapp.exceptions;

public class BookNotFoundException extends RunTimeException {
	public BookNotFoundException() {
		super();
	}

	public BookNotFoundException(String message) {
		super(message);
	}
	
}


