package com.bridgelabz.registration;

@FunctionalInterface
public interface UserValidation {
    boolean validate(String input);
}