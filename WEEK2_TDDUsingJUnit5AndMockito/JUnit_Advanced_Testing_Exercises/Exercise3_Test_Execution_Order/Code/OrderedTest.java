package org.example;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderedTests {

    @Test
    @Order(2)
    void testB() {
        System.out.println("Running testB (Order 2)");
        Assertions.assertTrue(true);
    }

    @Test
    @Order(1)
    void testA() {
        System.out.println("Running testA (Order 1)");
        Assertions.assertTrue(true);
    }

    @Test
    @Order(3)
    void testC() {
        System.out.println("Running testC (Order 3)");
        Assertions.assertTrue(true);
    }
}
