package com.bridgelabz.registration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserValidatorTests {


    // FIRST NAME
    @Test
    void givenValidFirstName_ShouldReturnTrue() {
        assertTrue(UserValidator.validateFirstName("John"));
    }

    @Test
    void givenInvalidFirstName_ShouldReturnFalse() {
        assertFalse(UserValidator.validateFirstName("jo"));
    }

    // EMAIL
    @Test
    void givenValidEmail_ShouldReturnTrue() {
        assertTrue(UserValidator.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    void givenInvalidEmail_ShouldReturnFalse() {
        assertFalse(UserValidator.validateEmail("abc@.com"));
    }

    // MOBILE
    @Test
    void givenValidMobile_ShouldReturnTrue() {
        assertTrue(UserValidator.validateMobile("91 9919819801"));
    }

    // PASSWORD
    @Test
    void givenValidPassword_ShouldReturnTrue() {
        assertTrue(UserValidator.validatePassword("Abcd123@"));
    }
	

}
