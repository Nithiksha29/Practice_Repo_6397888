package org.example;// MathServiceTest.java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {

    private MathService service;

    @Before
    public void setUp() {
        service = new MathService();
        System.out.println("Setup done");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown done");
    }

    @Test
    public void testMultiply() {
        int result = service.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        int result = service.divide(10, 2);
        assertEquals(5, result);
    }
}
