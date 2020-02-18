package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validateName("Abh"));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validateName("Ab"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validateName("Varma"));
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validateName("Va"));
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void givenEmailId_WhenNotInProperFormat_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validateEmail("abc.@gmail.com"));
    }

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

    @Test
    public void givenPassword_WhenMinimumEightCharacter_ShouldReturnTrue() {
        Assert.assertTrue(UserValidator.validatePassword("password"));
    }

    @Test
    public void givenPassword_WhenLessThanEightCharacter_ShouldReturnFalse() {
        Assert.assertFalse(UserValidator.validatePassword("passwor"));
    }
}
