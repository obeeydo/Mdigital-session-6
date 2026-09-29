package com.mdigital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordCheckerTest {

    @Test
    void checkBlankPasswordReturnsFalae(){
        // Arrange
        passwordChecker checker = new passwordChecker();
        // check password
       boolean result = checker.checkPassword("");
       // Assert
        assertFalse(result);
    }
    @Test
    void checkShorteestPasswordFails(){
        // Arrange
        passwordChecker checker = new passwordChecker();
        // check password
        boolean result = checker.checkPassword("a3vjegy");
        // Assert
        assertFalse(result);
    }

    @Test
    void checkEightCharacterPasswordReturnsTrue(){
        // Arrange
        passwordChecker checker = new passwordChecker();
        // check password
        boolean result = checker.checkPassword("brbrbrbr1");
        // Assert
        assertTrue(result);
    }

    @Test
    void checkFailsIfNoNumberPresent(){
        // Arrange
        passwordChecker checker = new passwordChecker();
        // check password
        boolean result = checker.checkPassword("absvjegy");
        // Assert
        assertFalse(result);
    }
}