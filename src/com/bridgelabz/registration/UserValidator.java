package com.bridgelabz.registration;
import java.util.regex.Pattern;

public class UserValidator {

    // Common method for Name Validation (Reusable)
    public static boolean validateName(String name) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, name);
    }

    // UC1
    public static boolean validateFirstName(String firstName) {
        return validateName(firstName);
    }

    // UC2
    public static boolean validateLastName(String lastName) {
        return validateName(lastName);
    }

    public static void main(String[] args) {

        // UC1
        System.out.println(validateFirstName("John"));   // true

        // UC2
        System.out.println(validateLastName("Doe"));     // true
        System.out.println(validateLastName("doe"));     // false
        System.out.println(validateLastName("Do"));      // false
    }
}