package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionThrowerTest {
    @Test
    void testThrowsException() {
        ExceptionThrower thrower = new ExceptionThrower();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> thrower.throwException(true)
        );

        assertEquals("Invalid argument provided!", exception.getMessage());
    }

    @Test
    void testDoesNotThrowException() {
        ExceptionThrower thrower = new ExceptionThrower();

        assertDoesNotThrow(() -> thrower.throwException(false));
    }
}