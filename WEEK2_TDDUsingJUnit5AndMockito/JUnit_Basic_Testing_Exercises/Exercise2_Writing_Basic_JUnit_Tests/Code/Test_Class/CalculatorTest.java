package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void addTest()
    {
        Calculator calc=new Calculator();
        int res=calc.add(10,20);

        assertEquals(30,res);
    }

    @Test
    public void subTest()
    {
        Calculator calc=new Calculator();
        int res=calc.sub(20,10);
        assertEquals(10,res);
    }
}