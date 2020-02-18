package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {

    public static String namePattern = "^([A-Z]{1}[a-zA-Z]{2,})$";
    public static String emailPattern = "^[a-zA-Z]{3,}([-+_.]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2,3})?$";

    public static boolean validateName(String name) {
        if (Pattern.matches(namePattern,name)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean validateEmail(String email) {
        if (Pattern.matches(emailPattern,email)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Junit User Registration");
    }
}
