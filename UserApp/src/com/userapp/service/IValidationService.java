 package com.userapp.service;



import  com.userapp.exception.NameExistsException;
 import com.userapp.exception.TooLongException;
 import com.userapp.exception.TooShortExceptions;
 public interface IValidationService {
		boolean validateUserName(String username) throws NameExistsException;
		boolean validatePassword(String password) throws TooLongException, TooShortExceptions;
	}




