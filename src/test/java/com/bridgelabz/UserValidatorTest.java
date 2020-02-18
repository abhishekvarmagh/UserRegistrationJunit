package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    //Test Case For First Name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validateName("Abh"));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validateName("Ab"));
    }

    //Test Case For Last Name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validateName("Varma"));
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validateName("Va"));
    }

    //Test Case For Email
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void givenEmailId_WhenNotInProperFormat_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validateEmail("abc.@gmail.com"));
    }

    //Test Case For Mobile Number
    @Test
    public void givenMobileNumber_WhenProperFormat_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validateMobileNumber("91 1234567890"));
    }

    @Test
    public void givenMobileNumber_WhenInvalidCountryCode_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validateMobileNumber("09 1234567890"));
    }

    @Test
    public void givenMobileNumber_WhenImproperFormat_ShouldReturnTrue() {
        Assert.assertFalse(UserValidator.validateMobileNumber("9112345678901"));
    }

    //Test Case For Password Should Contain minimum Eight Character And Atleast One Uppercase
    @Test
    public void givenPassword_WhenMinimumEightCharacter_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validatePassword("passwordA"));
    }

    @Test
    public void givenPassword_WhenLessThanEightCharacter_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validatePassword("passwor"));
    }

    @Test
    public void givenPassword_WhenUpperCaseNotPresent_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validatePassword("password"));
    }

    @Test
    public void givenPassword_ContainAtLeastUppercaseWithDigit_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validatePassword("Password123"));
    }

    //Test Case For Password Should Contain Atleast One Number
    @Test
    public void givenPassword_ContainAtLeastOneNumber_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validatePasswordRuleThree("Password123"));
    }

    @Test
    public void givenPassword_WhenDoesNotContainNumber_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validatePasswordRuleThree("Password"));
    }

    @Test
    public void givenPassword_WhenContainSpecialCharacter_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validatePasswordRuleThree("Password123@"));
    }

    //Test Case For Password Should Contain Exactly One Special Character
    @Test
    public void givenPassword_WhenContainExactlyOneSpecialCharacter_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validatePasswordHasExactlyOneSpecialCharacter("Password@123"));
    }

    @Test
    public void givenPassword_WhenContainMoreThanOneSpecialCharacter_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validatePasswordHasExactlyOneSpecialCharacter("Password@12@"));
    }

    @Test
    public void givenPassword_WhenDoesNotContainUpperCase_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validatePasswordHasExactlyOneSpecialCharacter("password@12"));
    }

    @Test
    public void givenPassword_WhenDoNotContainNumber_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validatePasswordHasExactlyOneSpecialCharacter("Password@"));
    }
}
