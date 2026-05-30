package com.bridgelabz.registration;
import java.util.regex.Pattern;

public class UserValidator {
	
	

	    public static void validateFirstName(String firstName) throws UserRegistrationException {
	        if (!Pattern.matches("^[A-Z][a-z]{2,}$", firstName)) {
	            throw new UserRegistrationException(
	                UserRegistrationException.ExceptionType.INVALID_FIRST_NAME,
	                "Invalid First Name"
	            );
	        }
	    }
	    
	    public static void validateLastName(String lastName) throws UserRegistrationException {
	        if (!Pattern.matches("^[A-Z][a-z]{2,}$", lastName)) {
	            throw new UserRegistrationException(
	                UserRegistrationException.ExceptionType.INVALID_LAST_NAME,
	                "Invalid Last Name"
	            );
	        }
	    }

	    public static void validateMobile(String mobile) throws UserRegistrationException {
	        if (!Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mobile)) {
	            throw new UserRegistrationException(
	                UserRegistrationException.ExceptionType.INVALID_MOBILE,
	                "Invalid Mobile Number"
	            );
	        }
	    }
	    
	    public static void validatePassword(String password) throws UserRegistrationException {
	        if (!Pattern.matches("^[A-Z][a-z]{2,}$", password)) {
	            throw new UserRegistrationException(
	                UserRegistrationException.ExceptionType.INVALID_PASSWORD,
	                "Invalid Password"
	            );
	        }
	    }
	    
	    public static void validateEmail(String email) throws UserRegistrationException {
	        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";
	        if (!Pattern.matches(regex, email)) {
	            throw new UserRegistrationException(
	                UserRegistrationException.ExceptionType.INVALID_EMAIL,
	                "Invalid Email"
	            );
	        }
	    }


    public static void main(String[] args) {

        // Valid
    	 System.out.println("First Name: " +
                 UserValidatorLambda.firstNameValidator.validate("John"));

         System.out.println("Last Name: " +
                 UserValidatorLambda.lastNameValidator.validate("Doe"));

         System.out.println("Email: " +
                 UserValidatorLambda.emailValidator.validate("abc.xyz@bl.co.in"));

         System.out.println("Mobile: " +
                 UserValidatorLambda.mobileValidator.validate("91 9919819801"));

         System.out.println("Password: " +
                 UserValidatorLambda.passwordValidator.validate("Abcdef1@"));
        
    }
}