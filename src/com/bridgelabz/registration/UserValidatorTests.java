package com.bridgelabz.registration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTests {

    // ---------- FIRST NAME ----------
    @Test
    void givenValidFirstName_ShouldNotThrowException() {
        assertDoesNotThrow(() ->
            UserValidator.validateFirstName("John")
        );
    }

    @Test
    void givenInvalidFirstName_ShouldThrowException() {
        UserRegistrationException ex = assertThrows(
            UserRegistrationException.class,
            () -> UserValidator.validateFirstName("jo")
        );

        assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, ex.type);
    }

    // ---------- LAST NAME ----------
    @Test
    void givenValidLastName_ShouldNotThrowException() {
        assertDoesNotThrow(() ->
            UserValidator.validateLastName("Smith")
        );
    }

    @Test
    void givenInvalidLastName_ShouldThrowException() {
        UserRegistrationException ex = assertThrows(
            UserRegistrationException.class,
            () -> UserValidator.validateLastName("s")
        );

        assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, ex.type);
    }

    // ---------- EMAIL (Parameterized) ----------
    @ParameterizedTest
    @ValueSource(strings = {
        "abc@yahoo.com",
        "abc.100@yahoo.com",
        "abc-100@abc.net",
        "abc.xyz@bl.co.in"
    })
    void givenValidEmails_ShouldNotThrowException(String email) {
        assertDoesNotThrow(() ->
            UserValidator.validateEmail(email)
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "abc",
        "abc@.com",
        "abc..2002@gmail.com",
        "abc@abc@gmail.com"
    })
    void givenInvalidEmails_ShouldThrowException(String email) {
        UserRegistrationException ex = assertThrows(
            UserRegistrationException.class,
            () -> UserValidator.validateEmail(email)
        );

        assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, ex.type);
    }

    // ---------- MOBILE ----------
    @Test
    void givenValidMobile_ShouldNotThrowException() {
        assertDoesNotThrow(() ->
            UserValidator.validateMobile("91 9919819801")
        );
    }

    @Test
    void givenInvalidMobile_ShouldThrowException() {
        UserRegistrationException ex = assertThrows(
            UserRegistrationException.class,
            () -> UserValidator.validateMobile("919919819801")
        );

        assertEquals(UserRegistrationException.ExceptionType.INVALID_MOBILE, ex.type);
    }

    // ---------- PASSWORD ----------
    @Test
    void givenValidPassword_ShouldNotThrowException() {
       UserRegistrationException ex= assertThrows(
    		   UserRegistrationException.class,() ->
            UserValidator.validatePassword("Abcd123@")
        );
    }

    @Test
    void givenInvalidPassword_ShouldThrowException() {
        UserRegistrationException ex = assertThrows(
            UserRegistrationException.class,
            () -> UserValidator.validatePassword("abc")
        );

        assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, ex.type);
    }
}