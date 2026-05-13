package com.bridgelabz.registration;
import java.util.regex.Pattern;

public class UserValidator {

    // Common Name Validation (UC1 & UC2)
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

    // UC3 - Email Validation
    public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return Pattern.matches(regex, email);
    }

    public static void main(String[] args) {

        // Valid Emails
        System.out.println(validateEmail("abc@bl.co"));         // true
        System.out.println(validateEmail("abc.xyz@bl.co"));     // true
        System.out.println(validateEmail("abc.xyz@bl.co.in"));  // true

        // Invalid Emails
        System.out.println(validateEmail("abc@.co"));           // false
        System.out.println(validateEmail("abc@bl"));            // false
        System.out.println(validateEmail("abc.xyz@bl."));       // false
    }
}