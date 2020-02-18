package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {

    public static String namePattern = "^([A-Z]{1}[a-zA-Z]{2,})$";
    public static String emailPattern = "^[a-zA-Z]{3,}([-+_.]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2,3})?$";
    public static String mobileNumberPattern = "^[1-9]{1}[0-9]{1,2}[ ][1-9]{1}[0-9]{9}$";
    public static String passwordUppercasePattern = "^(?=.*[A-Z])[A-Za-z]{8,}$";
    public static String passwordContainNumberPattern = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$";

    public static boolean validateName(String name) {
        if (Pattern.matches(namePattern, name)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateEmail(String email) {
        if (Pattern.matches(emailPattern, email)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateMobileNumber(String mobileNumber) {
        if (Pattern.matches(mobileNumberPattern, mobileNumber)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validatePassword(String password) {
        if (Pattern.matches(passwordUppercasePattern, password)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validatePasswordRuleThree(String password) {
        if (Pattern.matches(passwordContainNumberPattern, password)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Junit User Registration");
    }

}