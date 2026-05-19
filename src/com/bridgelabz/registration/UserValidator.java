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

    // UC8 - Combined Rule (Min 8 + Uppercase + Number + exactly one special character)
    public static boolean validatePassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[@#$%^&+=]){1}$)[A-Za-z0-9@#$%^&+=]{8,}$";
        return Pattern.matches(regex, password);
    }

    public static void main(String[] args) {

        // Valid
        System.out.println(validatePassword("Abcd1234")); // true
        System.out.println(validatePassword("Passw0rd")); // true

        // Invalid
        System.out.println(validatePassword("Password")); // false (no number)
        System.out.println(validatePassword("abcd1234")); // false (no uppercase)
        System.out.println(validatePassword("Abc12"));    // false (<8 chars)
    }
}