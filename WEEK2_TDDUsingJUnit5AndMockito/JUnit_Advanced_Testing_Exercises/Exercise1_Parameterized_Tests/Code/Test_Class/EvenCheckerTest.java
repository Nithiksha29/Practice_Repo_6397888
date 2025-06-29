package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


class EvenCheckerTest {
// EvenCheckerTest.java


        private final EvenChecker checker = new EvenChecker();

        @ParameterizedTest
        @ValueSource(ints = {2, 4, 6, 8, 10})
        public void testIsEven_withEvenNumbers(int number) {
            assertTrue(checker.isEven(number), number + " should be even");
        }

        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5, 7, 9})
        public void testIsEven_withOddNumbers(int number) {
            assertFalse(checker.isEven(number), number + " should be odd");
        }
    }

