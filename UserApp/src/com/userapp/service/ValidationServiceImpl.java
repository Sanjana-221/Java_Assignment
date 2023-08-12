package com.userapp.service;
import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortExceptions;


public class ValidationServiceImpl implements IValidationService{
	
String[] userNames;
	
	public ValidationServiceImpl(String[] usernames2) {
	// TODO Auto-generated constructor stub
}

	public void ValidationServiceImp(String[] userNames) {
		this.userNames = userNames;
	}

	@Override
	public boolean validateUserName(String username) throws NameExistsException {
		for(String userName : userNames) {
			if(userName.equals(username))
				throw new NameExistsException("User Already Registered");
		}
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooLongException, TooShortExceptions {
		int length = password.length();
		if(length<6)
			throw new TooShortExceptions("Password length should be more than 6");
		else if(length>15)
			throw new TooLongException("Password length should be less than 15");
		else
			return true;
	}

}


