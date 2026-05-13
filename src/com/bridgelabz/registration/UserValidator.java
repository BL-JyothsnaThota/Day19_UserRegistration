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

    // UC5 - Min 8 chars
    public static boolean validatePasswordRule1(String password) {
        String regex = "^.{8,}$";
        return Pattern.matches(regex, password);
    }

    // UC6 - At least 1 uppercase + min 8 chars
    public static boolean validatePasswordRule2(String password) {
        String regex = "^(?=.*[A-Z]).{8,}$";
        return Pattern.matches(regex, password);
    }

    public static void main(String[] args) {

        // Valid
        System.out.println(validatePasswordRule2("Abcd1234")); // true
        System.out.println(validatePasswordRule2("Password")); // true

        // Invalid
        System.out.println(validatePasswordRule2("abcd1234")); // false (no uppercase)
        System.out.println(validatePasswordRule2("Abc12"));    // false (<8 chars)
    }
}