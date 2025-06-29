package org.example;// MathServiceTest.java
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

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
