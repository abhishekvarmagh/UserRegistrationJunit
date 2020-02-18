package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
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
}
