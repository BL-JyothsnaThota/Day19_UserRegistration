package com.bridgelabz.registration;
import java.util.regex.Pattern;

public class UserValidator {

    // UC1 - First Name Validation
    public static boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, firstName);
    }

    public static void main(String[] args) {
        System.out.println(validateFirstName("John"));   // true
        System.out.println(validateFirstName("jo"));     // false
        System.out.println(validateFirstName("J"));      // false
    }
}