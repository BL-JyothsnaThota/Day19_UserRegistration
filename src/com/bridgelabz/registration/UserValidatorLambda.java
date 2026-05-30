package com.bridgelabz.registration;

import java.util.regex.Pattern;

public class UserValidatorLambda {

    // UC1 - First Name
    public static UserValidation firstNameValidator =
            firstName -> Pattern.matches("^[A-Z][a-z]{2,}$", firstName);

    // UC2 - Last Name
    public static UserValidation lastNameValidator =
            lastName -> Pattern.matches("^[A-Z][a-z]{2,}$", lastName);

    // UC3 - Email
    public static UserValidation emailValidator =
            email -> Pattern.matches(
                    "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$",
                    email);

    // UC4 - Mobile
    public static UserValidation mobileValidator =
            mobile -> Pattern.matches("^[0-9]{2} [0-9]{10}$", mobile);

    // UC5–UC8 - Password (ALL rules combined)
    public static UserValidation passwordValidator =
            password -> Pattern.matches(
                    "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[^a-zA-Z0-9]){1}$).{8,}$",
                    password);
}