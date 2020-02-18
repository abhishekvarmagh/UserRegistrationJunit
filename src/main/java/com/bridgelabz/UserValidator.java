package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {

    public static String namePattern = "^([A-Z]{1}[a-zA-Z]{2,})$";

    public static boolean validateName(String name) {
        if (Pattern.matches(namePattern,name)) {
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
