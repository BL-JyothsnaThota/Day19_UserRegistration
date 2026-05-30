package com.bridgelabz.registration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorLambdaTest {

    @Test
    void givenValidFirstName_ShouldReturnTrue() {
        assertTrue(UserValidatorLambda.firstNameValidator.validate("John"));
    }

    @Test
    void givenInvalidFirstName_ShouldReturnFalse() {
        assertFalse(UserValidatorLambda.firstNameValidator.validate("jo"));
    }

    @Test
    void givenValidEmail_ShouldReturnTrue() {
        assertTrue(UserValidatorLambda.emailValidator.validate("abc@yahoo.com"));
    }

    @Test
    void givenInvalidEmail_ShouldReturnFalse() {
        assertFalse(UserValidatorLambda.emailValidator.validate("abc@.com"));
    }

    @Test
    void givenValidMobile_ShouldReturnTrue() {
        assertTrue(UserValidatorLambda.mobileValidator.validate("91 9919819801"));
    }

    @Test
    void givenInvalidMobile_ShouldReturnFalse() {
        assertFalse(UserValidatorLambda.mobileValidator.validate("919919819801"));
    }

    @Test
    void givenValidPassword_ShouldReturnTrue() {
        assertTrue(UserValidatorLambda.passwordValidator.validate("Abcd123@"));
    }

    @Test
    void givenInvalidPassword_ShouldReturnFalse() {
        assertFalse(UserValidatorLambda.passwordValidator.validate("abc"));
    }
}