package com.bridgelabz.registration;

public class UserRegistrationException extends Exception {

    public enum ExceptionType {
        INVALID_FIRST_NAME,
        INVALID_LAST_NAME,
        INVALID_EMAIL,
        INVALID_MOBILE,
        INVALID_PASSWORD
    }

    public ExceptionType type;

    public UserRegistrationException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}