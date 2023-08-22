package ait.user.test;

import ait.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private String email = "john@mail.com";
    private String password = "OlenaWork@21";

    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    @Test
    void testValidEmail() {
        String validEmail = "john@mail.com";
        user.setEmail(validEmail);
        assertEquals(validEmail, user.getEmail());
    }

    @Test
    void testEmailWithoutAt() {
        String invalidEmail = "john.mail.com";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDoubletAt() {
        String invalidEmail = "john@@mail.com";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDotAfterAt() {
        String invalidEmail = "john@mailcom";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailLastDot() {
        String invalidEmail = "john@mailcom.";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());

        invalidEmail = "john@mailco.m";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailIncorrectSymbol() {
        String invalidEmail = "jo!hn@gmx.com";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
//    ******************************************
    @Test
    void testEmailIncorrectSymbolSpace() {
        String invalidEmail = " john@ mail.com ";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
//    ******************************************




//    ====================PASSWORD===============================
void testValidPassword() {
    String validPasssword = "OlenaWork@21";
    user.setEmail(validPasssword);
    assertEquals(validPasssword, user.getEmail());
}

    //1) Min 8 symbols
    @Test
    void testPasswordMinEightSymbol() {
        String invalidPassword = "Olena1@";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    //       2) Min one symbol in uppercase
    @Test
    void testPasswordMinOneSymbolInUppercase() {
        String invalidPassword = "olenawork1@";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    //       3) Min one symbol in lowercase
    @Test
    void testPasswordMinOneSymbolInLowercase() {
        String invalidPassword = "OLENAWORK1@";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    //       4) Min one symbol is digit
    @Test
    void testPasswordMinOneSymbolIsDigit() {
        String invalidPassword = "OlenaWork@";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    //   5) Min one symbol is a special symbol (!%@*&)
    @Test
    void testPasswordMinOneSymbolIsASpecialSymbol() {
        String invalidPassword = "OlenaWork21";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }
//    ************************************
@Test
void testPasswordSymbolSpace() {
    String invalidPassword = " OlenaWork21 ";
    user.setPassword(invalidPassword);
    assertEquals(password, user.getPassword());
}
//    ************************************

}