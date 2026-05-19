package com.bridgelabz.registration;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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
	
    @ParameterizedTest
    @ValueSource(strings = {
        "abc@yahoo.com",
        "abc-100@yahoo.com",
        "abc.100@yahoo.com",
        "abc111@abc.com",
        "abc-100@abc.net",
        "abc.100@abc.com.au",
        "abc@1.com",
        "abc@gmail.com.com",
        "abc+100@gmail.com"
    })
    void givenValidEmails_ShouldReturnTrue(String email) {
        assertTrue(UserValidator.validateEmail(email));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {
        "abc",
        "abc@.com.my",
        "abc123@gmail.a",
        "abc123@.com",
        "abc123@.com.com",
        ".abc@abc.com",
        "abc()*@gmail.com",
        "abc@%*.com",
        "abc..2002@gmail.com",
        "abc.@gmail.com",
        "abc@abc@gmail.com",
        "abc@gmail.com.1a"
    })
    void givenInvalidEmails_ShouldReturnFalse(String email) {
        assertFalse(UserValidator.validateEmail(email));
    }

}
