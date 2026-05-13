package com.bridgelabz.registration;
import java.util.regex.Pattern;

public class UserValidator {

    // UC1 & UC2 - Name Validation
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

    // UC4 - Mobile Number
    public static boolean validateMobile(String mobile) {
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        return Pattern.matches(regex, mobile);
    }

    public static void main(String[] args) {

        // Valid
        System.out.println(validateMobile("91 9919819801")); // true

        // Invalid
        System.out.println(validateMobile("919919819801")); // false (no space)
        System.out.println(validateMobile("91-9919819801")); // false (wrong separator)
        System.out.println(validateMobile("91 99198")); // false (less digits)
        System.out.println(validateMobile("9 9919819801")); // false (country code wrong)
    }
}