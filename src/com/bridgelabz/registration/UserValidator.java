package com.bridgelabz.registration;
import java.util.regex.Pattern;

public class UserValidator {

    // UC1 & UC2 - Name
    public static boolean validateName(String name) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, name);
    }

    public static boolean validateFirstName(String firstName) {
        return validateName(firstName);
    }

    public static boolean validateLastName(String lastName) {
        return validateName(lastName);
    }

    // UC3 - Email
    public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return Pattern.matches(regex, email);
    }

    // UC4 - Mobile
    public static boolean validateMobile(String mobile) {
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        return Pattern.matches(regex, mobile);
    }

    // UC5 - Password Rule 1 (Min 8 chars)
    public static boolean validatePasswordRule1(String password) {
        String regex = "^.{8,}$";
        return Pattern.matches(regex, password);
    }

    public static void main(String[] args) {

        // Valid
        System.out.println(validatePasswordRule1("abcd1234")); // true
        System.out.println(validatePasswordRule1("password")); // true

        // Invalid
        System.out.println(validatePasswordRule1("abc123"));   // false (<8)
    }
}