package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private UserValidator validator = new UserValidator();

    //username
    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseWhenUsernameIsNull(String username) {
        assertFalse(validator.validateEmail(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0Maggie013", "kate_00", "X.x", "WWa999"})
    public void shouldReturnTrueIfUsernameIsCorrect(String username) {
        assertTrue(validator.validateUserName(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"xx", "kate,00", "X?x", "Żak", "0+45", ""})
    public void shouldReturnFalseIfUsernameIsIncorrect(String username) {
        assertFalse(validator.validateUserName(username));
    }

    //email
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseWhenEmailIsEmptyOrNull(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Xander@o2.pl", "Alvaro-Soler@email.com", "Alvaro-Soler@email.COM", "Alvaro.Soler@email.com", "123@o2.pl"})
    public void shouldReturnTrueIfEmailIsCorrect(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Xander@o2,pl", "Xandero2.pl", "Alvaro-Soler@email.xxxxxxx", "Alvaro-Soler@email.123", "Alvaro,Soler@email.com", "@email.com", "Alvaro?Soler@email.com"})
    public void shouldReturnFalseIfEmailIsIncorrect(String email) {
        assertFalse(validator.validateEmail(email));
    }

}